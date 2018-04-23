package other;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;
import Types.EventType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TypeCheckerVisitor extends AstVisitor<Node> {
    public List<String> ErrorList = new ArrayList<>();
    public SymbolTable symbolTable = new SymbolTable();


    @Override
    public Node Visit(ActionNode node) {
        Node[] array = node.IDNodes();
        for(int i = 0; i<array.length; i++) {
            Visit(array[i]);
        }
        Visit(node.Fcall());
        //TODO idk hvad denne skal have af extra information
        return node;
    }

    @Override
    public Node Visit(AddExprNode node) {
        //Compares the class of the left node to the right node
        Node leftNode = Visit(node.LeftNode());
        Node rightNode = Visit(node.RightNode());
        try{
            if(leftNode.Type.equals(rightNode.Type)){
                if(leftNode.Type == int.class || leftNode.Type == double.class){
                    node.Type = leftNode;
                }
                else{
                    ErrorList.add(String.format("Line %s It is illegal to add two elements of type %s together", node.FirstLinenumber, leftNode.Type));
                    node.ErrorFlag = true;
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't add two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.FirstLinenumber,  node.LeftNode(), leftNode.Type, node.RightNode(), rightNode.Type));
                node.ErrorFlag = true;
            }
            return node;
        }catch (NullPointerException e){
            return node;
        }
    }

    @Override
    public Node Visit(AndNode node) {
        Node leftNode = Visit(node.LeftNode());
        Node rightNode = Visit(node.RightNode());
        try {
            if (leftNode.Type == boolean.class && rightNode.Type == boolean.class) {
                node.Type = boolean.class;
            }
            else{
                ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + "&& both arguments have to be of type Boolean");
                node.Type = boolean.class;
                node.ErrorFlag = true;
            }
        }catch (NullPointerException e){
            return node;
        }
        return node;
    }

    @Override
    public Node Visit(ArgumentNode node) {
        RefNode rNode = node.RefNode();
        if(symbolTable.DeclaredLocally(rNode.IDNode().toString())){
            ErrorList.add(String.format("Line %s: Argument %s is already declared in this scope", node.FirstLinenumber, rNode.IDNode()));
            node.ErrorFlag = true;
            return node;
        }
        else{
            symbolTable.EnterSymbol(rNode.IDNode().toString(), node.Type);
            return node;
        }

    }

    @Override
    public Node Visit(ArrayExprNode node) {
        if(Visit(node.IDNode()).Type != null){
            SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().toString());
            Node exprType = Visit(node.ExprNode());
            if(exprType.Type.equals(int.class)){
                node.Type = sym.type;
                return node;
            }
            else {
                ErrorList.add(String.format("Line %s: Array can only be indexed with type Integer not with %s",node.FirstLinenumber, exprType.getClass()));
                node.ErrorFlag = true;
                return node;
            }

        }
        else{
            ErrorList.add(String.format("Line %s: The array %s is not declared", node.FirstLinenumber, node.IDNode()));
            node.ErrorFlag = true;
            return node;
        }
    }

    @Override
    public Node Visit(AssignNode node) {
        try {
            Node idType = Visit(node.RefNode());
            Node valueType = Visit(node.ValueNode());
            if(valueType.Type == null){
                //TODO: if valuetype is zero then another error has happen and has been reported. however should type null be written to the user?
                return node;
            }
            else if (idType.Type.equals(valueType.Type)) {
                node.Type = idType.Type;
                return node;
            }
            else{
                ErrorList.add(String.format("Line %s: assigning %s to type %s not possible", node.FirstLinenumber, node.FirstLinenumber, valueType.Type.toString(), idType.Type.toString()));
                node.ErrorFlag = true;
            }
        }catch (NullPointerException e){
            ErrorList.add(String.format("Line %s: Variable %s does not exist, and cant be assigned to", node.FirstLinenumber, node.RefNode().LeftmostChild.toString()));
            node.ErrorFlag = true;
        }
        return node;
    }

    @Override
    public Node Visit(BehaviorNode node) {
        Visit(node.IDNode()); //Vi skal have tilføjet alle behaviors til symboltable
        Visit(node.BlockNode());
        return node;
    }

    @Override
    public Node Visit(BlockNode node) {
        Node[] children = node.StmtNodes();
        for(int i=0; i<children.length; i++){
            Visit(children[i]);
        }
        return node;
    }

    @Override
    public Node Visit(BoolNode node) {
        node.Type = boolean.class;
        return node;
    }

    @Override
    public Node Visit(DclNode node) {
        if(symbolTable.DeclaredLocally(node.getID())){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + ", It already exist");
            node.ErrorFlag = true;
            return null;
        }
        symbolTable.EnterSymbol(node.getID(), node.Type);
        Visit(node.ChildNode());
        //if(node.Type.equals(Visit(node.ChildNode())))
        //    symbolTable.EnterSymbol(node.getID(), node.Type);
        return node;
    }

    @Override
    public Node Visit(DecimalNode node) {
        node.Type = double.class;
        return node;
    }

    @Override
    public Node Visit(DivExprNode node) {
        //Compares the object of the left node to the right node
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.Type.equals(rightNodeType.Type)){
                if(leftNodeType.Type == int.class|| leftNodeType.Type == double.class){
                    //Hvordan fuck checker man for divide med 0?? svar: det her er jo typechecking. Det skal gøre et andet sted
                    if(rightNodeType instanceof IntNode)
                        if (((IntNode) rightNodeType).value == 0)
                            ErrorList.add(String.format("Line %s: cannot divide with zero", node.FirstLinenumber)); //idk om det virker
                    node.Type = leftNodeType.Type;
                    return node;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to divide two elements of type %s together", node.FirstLinenumber, leftNodeType.toString()));
                    node.ErrorFlag = true;
                }
            }
            else{
                node.ErrorFlag = true;
                ErrorList.add(String.format("Line %s: You can't divide two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.FirstLinenumber, node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return node;
        }catch (NullPointerException e){
            return node;
        }
    }

    @Override
    public Node Visit(DoStmtNode node) {
        symbolTable.OpenScope();
        if (Visit(node.VariableNode()).Type != int.class) {
            ErrorList.add(String.format("Line %s: the variable %s in Do construct has to be of type int", node.FirstLinenumber, node.VariableNode().RefNode().IDNode().toString()));
            node.ErrorFlag = true;
        }
        Node sType = Visit(node.StartValueNode());
        if(sType.Type != int.class){
            ErrorList.add(String.format("Line %s: the startvalue for the do loop has to be of type int and cant be %s", node.FirstLinenumber, sType.Type));
            node.ErrorFlag = true;
        }
        Node eType = Visit(node.EndValueNode());
        if(eType.Type != int.class){
            ErrorList.add(String.format("Line %s: the endvalue for the do loop has to be of type int and cant be %s", node.FirstLinenumber, eType.Type));
        }
        //Jaaaaaaaaaaa- hvordan var det lige vores do loop var ??
        Visit(node.IncrementNode());
        Visit(node.BlockNode());
        symbolTable.CloseScope();
        return node;
    }

    @Override
    public Node Visit(ElseNode node) {
        Visit(node.Block());
        return node;
    }

    @Override
    public Node Visit(ElseIfNode node) {
        Visit(node.Condition());
        Visit(node.Block());
        return node;
    }

    @Override
    public Node Visit(EqualNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type.equals(rightNodeType.Type)) {
                node.Type = boolean.class;
                return node;
                //skal man kunne sige string == string i vores sprog? kan man ikke i java så dette skal vi tage højde for når vi laver code generation.
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
                node.ErrorFlag = true;
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
        }
        return node;
    }

    @Override
    public Node Visit(EventNode node) {
        if(symbolTable.DeclaredLocally(node.ID().toString())) {
            ErrorList.add(String.format("Line %s: Event with name %s already declared", node.FirstLinenumber, node.ID().toString()));
            node.ErrorFlag = true;
            return node;
        }
        Node condition = Visit(node.ExprNode());
        if(condition.Type == boolean.class)
            symbolTable.EnterSymbol(node.ID().toString(), EventType.class);
        else {
            ErrorList.add(String.format("Line %s: The condition of event %s is not of type boolean", node.FirstLinenumber, node.ID().toString()));
            node.ErrorFlag = true;
        }
        //Visit(node.ID()); Den skal vel ikke besøge ID, da vi lægger den ind her anyway.
        return node;
    }

    @Override
    public Node Visit(FcallNode node) {
        Node type = Visit(node.IDNode());
        SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().idString);
        if(sym != null){
            int numberOfparams = sym.Parameters != null ? sym.Parameters.length : 0;
            int numberOfargs = node.NumberOfArguments();
            if(numberOfargs != numberOfparams){
                ErrorList.add(String.format("Line %s: Number of arguments does not match the number of parameters for the method %s", node.FirstLinenumber, node.IDNode().toString()));
            }
            Node[] arguments = node.ArgumentNodes();
            for(int i = 0; i<numberOfparams; i++) {
                if (sym.Parameters[i].Type != Visit(arguments[i])) {
                    ErrorList.add(String.format("Line %s, Argument number %s has to be of type %s", node.FirstLinenumber, i + 1, sym.Parameters[i].Type.toString()));
                }
            }
        }
        node.Type = type.Type;
        return node;
    }

    @Override
    public Node Visit(GameLoopNode node) {
        Visit(node.Block());
        return node;
    }

    @Override
    public Node Visit(GreaterNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type.equals(rightNodeType.Type)) {
                node.Type = boolean.class;
                return node;
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
            node.ErrorFlag = true;
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
        }
        return node;
    }

    @Override
    public Node Visit(GreaterEqualNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type.equals(rightNodeType.Type)) {
                node.Type = boolean.class;
                return node;
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
            node.ErrorFlag = true;
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
        }
        return node;
    }

    @Override
    public Node Visit(IDNode node) {
        SymbolClass sym = symbolTable.RetrieveSymbol(node.idString);
        if(sym == null){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.idString + " was not declared in this scope.");
            node.ErrorFlag = true;
            return node;
        }
        else{
            node.Type = sym.type;
            return node;
        }
    }

    @Override
    public Node Visit(IfStmtNode node) {
        Visit(node.Condition());
        Visit(node.Block());
        return node;
    }

    @Override
    public Node Visit(InfixExprNode node) {
        return null;
        //TODO: LAV DEN HER CASPER
    }

    @Override
    public Node Visit(IntNode node) {
        node.Type = int.class;
        return node;
    }

    @Override
    public Node Visit(LessEqualNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type.equals(rightNodeType.Type)) {
                node.Type = boolean.class;
                return node;
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
            node.ErrorFlag = true;
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
        }
        return node;
    }

    @Override
    public Node Visit(LessNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type.equals(rightNodeType.Type)) {
                node.Type = boolean.class;
                return node;
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
            node.ErrorFlag = true;
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
        }
        return node;
    }

    @Override
    public Node Visit(MethodNode node) {
        RTypeNode typeNode = node.RTypeNode();
        if(symbolTable.DeclaredLocally(node.IDNode().toString())){
            ErrorList.add(String.format("Line %s: The name %s is already used in this scope", node.FirstLinenumber, node.IDNode().toString()));
            node.ErrorFlag = true;
            return node;
        }
        else {
            symbolTable.EnterSymbol(node.IDNode().toString(), typeNode.toString(), node.Parameters());
            node.Type = typeNode.Type;
            return node;
        }
    }

    @Override
    public Node Visit(MulExprNode node) {
        //Compares the class of the left node to the right node
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.Type.equals(rightNodeType.Type)){
                if(leftNodeType.Type == int.class || leftNodeType.Type == double.class){
                    node.Type = leftNodeType.Type;
                    return node;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to multiply two elements of type %s together",node.FirstLinenumber,  leftNodeType.toString()));
                    node.ErrorFlag = true;
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't multiply two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s",node.FirstLinenumber,  node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));
                node.ErrorFlag = true;
            }
            return node;
        }catch (NullPointerException e){
            return node;
        }
    }

    @Override
    public Node Visit(NotExprNode node) {
        Node type = Visit(node.ExprNode());
        if(type.Type != boolean.class){
            ErrorList.add(String.format("Line %s: The expression is not of type boolean", node.FirstLinenumber));
            node.ErrorFlag = true;
            return node;
        }
        else{
            node.Type = type.Type;
            return node;
        }
    }

    @Override
    public Node Visit(NullNode node) {
        ErrorList.add(String.format("Line %s: WHY DO WE HAVE A NULL NODE?", node.FirstLinenumber));
        return node;
    }

    @Override
    public Node Visit(OrNode node) {
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.Type == boolean.class && rightNodeType.Type == boolean.class) {
                node.Type = boolean.class;
                return node;

            }
            else{
                ErrorList.add(String.format("Line %s: the two arguments before and after '||' has to be of type bool", node.FirstLinenumber ));
            }
        }catch (NullPointerException e){
            return node;
        }
        return node;
    }

    @Override
    public Node Visit(ProgNode node) {
        //Skal man starte med at åbne et scope??
        //ellers besøger jeg vel bare alle børnene
        symbolTable.OpenScope();
        Node child = node.LeftmostChild;
        while (child != null){
            Visit(child);
            child = child.RightSibling;
        }

        symbolTable.CloseScope();
        return node;
    }

    @Override
    public Node Visit(RTypeNode node) {

        return node;
    }

    @Override
    public Node Visit(ReturnStmtNode node) {
        node.Type = Visit(node.ExprNode()).Type;
        return node;
    }

    @Override
    public Node Visit(RefNode node) {
        node.Type = Visit(node.IDNode()).Type;
        return node;
    }

    @Override
    public Node Visit(SetupNode node) {
        return Visit(node.BlockNode());
    }

    @Override
    public Node Visit(StrategyNode node) {
        Visit(node.IDNode());
        for(Node bnode : node.BehaviourNodes()){
           Visit(bnode);
        }
        return node;
    }

    @Override
    public Node Visit(StringNode node) {
        node.Type = String.class;
        return node;
    }

    @Override
    public Node Visit(SubExprNode node) {
        //Compares the class of the left node to the right node
        Node leftNodeType = Visit(node.LeftNode());
        Node rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.Type.equals(rightNodeType.Type)){
                if(leftNodeType.Type == int.class || leftNodeType.Type == double.class){
                    node.Type = leftNodeType.Type;
                    return node;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to subtract two elements of type %s together",node.FirstLinenumber,  leftNodeType.toString()));
                    node.ErrorFlag = true;
                    return node;
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't subtract two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s",node.FirstLinenumber,  node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));
                node.ErrorFlag = true;
            }
            return node;
        }catch (NullPointerException e){
            return node;
        }
    }

    @Override
    public Node Visit(UsubNode node) {
        if(Visit(node.RefNode()).Type != int.class){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "USub not int");
            node.ErrorFlag = true;
        }
        node.Type = int.class;
        return node;
        //Returns integer even if an error occurs, so that the program can continue
        //Ved ikke om dette er iorden, men hvis man returnere andet blever den jo ved med at lave fejl hele vejen op igennem træet
    }

    @Override
    public Node Visit(UAddNode node) {
        if(Visit(node.RefNode()).Type != int.class){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "UAdd not int");
            node.ErrorFlag = true;
        }
        node.Type = int.class;
        return node;
    }

    @Override
    public Node Visit(WhileStmtNode node) {
        if(!(Visit(node.ConditionNode()).Type == boolean.class)){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "Condition not boolean");
            node.ErrorFlag = true;
        }
        Visit(node.BlockNode());


        return node;
    }

    public void AddLibarytoSymbolTable(String... files) throws IOException {
        for(String input : files){
            List<String> content = Files.readAllLines(Paths.get(input));
            String[] elements;
            for(String line : content){
                 elements = line.split("\\s+"); //RobocodeName - OurName - returnType - Parameter(max 1)/Can be none
                Object type = FindType(elements[2]);
                if(elements[3].equals("none")) {
                    String[] ids = elements[1].split("\\.");
                    for(String id : ids){
                        SymbolClass sym = symbolTable.RetrieveSymbol(id);
                        if(sym  == null)
                            symbolTable.EnterSymbol(id, type);
                        
                    }
                }
                else{
                    ArgumentNode node = new ArgumentNode(0, elements[3]); //Has no refNode, might be a problem
                    String[] ids = elements[1].split("\\.");
                    for(String id : ids)
                        if(symbolTable.RetrieveSymbol(id) == null)
                            symbolTable.EnterSymbol(id, type, new ArgumentNode[]{node});
                }
            }

        }

    }

    private Object FindType(String type) {

        if(type.equals("text"))
             return String.class;
        else if(type.equals("boolean"))
            return boolean.class;
        else if(type.equals("int"))
            return int.class;
        else if (type.equals("double"))
            return double.class;
        else if (type.equals("void"))
            return void.class;
        else
            return null;

    }
}
