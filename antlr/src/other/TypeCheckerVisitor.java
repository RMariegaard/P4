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

    public TypeCheckerVisitor(ArrayList<APIevents> list) throws IOException {
        AddLibraryEventsToSymbolTable(list);
    }
    public TypeCheckerVisitor(){
    }
    @Override
    public Node Visit(ActionNode node) {
        //This is done because we dont have time to implement id.id.id from RobocodeAPI
        //The fcall id name is changed to id.id.id.Fcallname before visiting the fcall node
        Node[] array = node.IDNodes();
        String fcallName = node.Fcall().IDNode().idString;
        String newFcallName = "";
        for(int i = 0; i<array.length; i++) {
            newFcallName = String.format(newFcallName + array[i] + ".");
        }
        newFcallName = String.format(newFcallName + fcallName);
        node.Fcall().IDNode().idString = newFcallName;
        node.Type = Visit(node.Fcall()).Type;

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
                    node.Type = leftNode.Type;
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
            symbolTable.EnterSymbol(rNode.IDNode().toString(), node);
            return node;
        }

    }

    @Override
    public Node Visit(ArrayExprNode node) {
        if(Visit(node.IDNode()).ErrorFlag == false){
            SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().toString());
            Node exprType = Visit(node.ExprNode());
            if(exprType.Type.equals(int.class)){
                node.Type = sym.Node.Type;
                return node;
            }
            else {
                ErrorList.add(String.format("Line %s: Array can only be indexed with type Integer not with %s",node.FirstLinenumber, exprType.Type));
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
                return node;
                // this should only happen, if an error has occured further down the three
            }
            else if (idType.Type.equals(valueType.Type)) {
                node.Type = idType.Type;
                return node;
            }
            else{
                ErrorList.add(String.format("Line %s: assigning %s to type %s not possible", node.FirstLinenumber, valueType.Type.toString(), idType.Type.toString()));
                node.ErrorFlag = true;
            }
        }catch (NullPointerException e){
            //We no longer return null, so this should never happen, the error get catched in visit(IDNODE)
            ErrorList.add(String.format("Line %s: Variable %s does not exist, and cant be assigned to", node.FirstLinenumber, node.RefNode().LeftmostChild.toString()));
            node.ErrorFlag = true;
        }
        return node;
    }

    @Override
    public Node Visit(BehaviorNode node) {
        symbolTable.OpenScope();
        Visit(node.IDNode());
        //TODO:Casper hvad fuck er det her? Sådan at vi kan håndtere events med deres event parameter
        if(node.IDNode().idString.equals("BulletHit")){
            try{
                AddLibraryFunctionsToSymbolTable("BulletClass.txt");
            }
            catch (Exception e){
                ErrorList.add(String.format("You are missing files. Please reinstall the language agian"));
            }
        }
        Visit(node.BlockNode());
        symbolTable.CloseScope();
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
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.getID() + ", It already exist");
            node.ErrorFlag = true;
            return node;
        }
        //Why do we add the dcl node to the symbol table?
        symbolTable.EnterSymbol(node.getID(), node);
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
                    if(rightNodeType instanceof IntNode) {
                        if (((IntNode) rightNodeType).value == 0) { //This only works when the Right node is IntNode, anything else, function, variable etc, wont check for zero.
                            ErrorList.add(String.format("Line %s: cannot divide with zero", node.FirstLinenumber));
                            node.ErrorFlag = true;
                        }
                    }
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
        //TODO: vi skal vel tjekke at første variable også er den er bliver talt op til sidst.
        symbolTable.OpenScope();
        ArgumentNode variable = (ArgumentNode) Visit(node.VariableNode());
        if (variable.Type != int.class) {
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
            node.ErrorFlag = true;
        }

        UAddNode incANode = null;
        UsubNode incSNode = null;

        if(node.IncrementNode() instanceof UAddNode)
             incANode = (UAddNode) Visit(node.IncrementNode());
        else if (node.IncrementNode() instanceof UsubNode)
            incSNode = (UsubNode) Visit(node.IncrementNode());
        else {
            ErrorList.add(String.format("Line %s: Last term in do Loop has to be an ++ or --", node.FirstLinenumber));
            node.ErrorFlag = true;
        }

        String variableString = variable.RefNode().IDNode().idString;
        String incString;
        if(incANode != null){
            incString = incANode.RefNode().IDNode().idString;
            if(!incString.equals(variableString)){
                ErrorList.add(String.format("Line %s: The term incremented has to be %s and cant be a different variable like %s", incANode.FirstLinenumber, variableString, incString));
            }
        } else if(incSNode != null){
            incString = incSNode.RefNode().IDNode().idString;
            if(!incString.equals(variableString)){
                ErrorList.add(String.format("Line %s: The term incremented has to be %s and cant be a different variable like %s", incSNode.FirstLinenumber, variableString, incString));
            }
        }


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
        Node condition = Visit(node.Condition());
        if (!(condition.Type == boolean.class)) {
            ErrorList.add(String.format("Line %s: Condition in else if statement has to be type bool, not %s", node.FirstLinenumber, condition.Type));
            node.ErrorFlag = true;
        }
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
        if(node.FirstLinenumber == 0){
            //The event is imported from Robocode
        }
        else if(condition.Type == boolean.class){
            node.Type = EventType.class;
            symbolTable.EnterSymbol(node.ID().toString(), node);
        }
        else {
            ErrorList.add(String.format("Line %s: The condition of event %s is not of type boolean", node.FirstLinenumber, node.ID().toString()));
            node.ErrorFlag = true;
        }
        //Visit(node.ID()); Den skal vel ikke besøge ID, da vi lægger den ind her anyway.
        return node;
    }

    @Override
    public Node Visit(FcallNode node) {
        Node type = Visit(node.IDNode()); //this checks if the function exist

        SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().idString);
        if(sym != null){
            MethodNode methodNode = (MethodNode) sym.Node;
            int numberOfparams = methodNode.NumberOfParameters();
            int numberOfargs = node.NumberOfArguments();
            if(numberOfargs != numberOfparams){
                ErrorList.add(String.format("Line %s: Number of arguments does not match the number of parameters for the method %s", node.FirstLinenumber, node.IDNode().toString()));
                node.ErrorFlag = true;
            }
            else{
                Node[] arguments = node.ArgumentNodes();
                Node[] parameters = methodNode.Parameters();
                for(int i = 0; i<numberOfparams; i++) {
                    if (parameters[i].Type != Visit(arguments[i]).Type) {
                        ErrorList.add(String.format("Line %s, Argument number %s has to be of type %s", node.FirstLinenumber, i + 1, parameters[i].Type.toString()));
                        node.ErrorFlag = true;
                    }
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
                if(leftNodeType.Type == String.class || leftNodeType.Type == String.class){
                    ErrorList.add(String.format("Line %s: cannot compare two strings with >", node.FirstLinenumber));
                    node.ErrorFlag = true;
                }
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
                if(leftNodeType.Type == String.class || leftNodeType.Type == String.class){
                    ErrorList.add(String.format("Line %s: cannot compare two strings with >=", node.FirstLinenumber));
                    node.ErrorFlag = true;
                }
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
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.idString + " was not declared");
            node.ErrorFlag = true;
            return node;
        }
        else{
            node.Type = sym.Node.Type;
            return node;
        }
    }

    @Override
    public Node Visit(IfStmtNode node) {
        Node condition = Visit(node.Condition());
        if (!(condition.Type == boolean.class)) {
            ErrorList.add(String.format("Line %s: Condition in if statement has to be type bool, not %s", node.FirstLinenumber, condition.Type));
            node.ErrorFlag = true;
        }
        Visit(node.Block());
        return node;
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
                if(leftNodeType.Type == String.class || leftNodeType.Type == String.class){
                    ErrorList.add(String.format("Line %s: cannot compare two strings with >=", node.FirstLinenumber));
                    node.ErrorFlag = true;
                }
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
                if(leftNodeType.Type == String.class || leftNodeType.Type == String.class){
                    ErrorList.add(String.format("Line %s: cannot compare two strings with >=", node.FirstLinenumber));
                    node.ErrorFlag = true;
                }
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
            node.Type = typeNode.Type;
            symbolTable.EnterSymbol(node.IDNode().toString(), node);
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
                node.ErrorFlag = true;
            }
        }catch (NullPointerException e){
            node.ErrorFlag = true;
            //can this happen?
            return node;
        }
        return node;
    }

    @Override
    public Node Visit(ProgNode node) {
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
        //TODO: er denne her lavet?
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

    public void AddLibraryEventsToSymbolTable(ArrayList<APIevents> list) throws IOException{
        for(APIevents input : list){
                String id = input.name;
                SymbolClass sym = symbolTable.RetrieveSymbol(id);
                if(sym == null){
                    EventNode node = new EventNode(0);
                    node.AdoptChildren(new IDNode(0, id));
                    node.Type = EventType.class;
                    symbolTable.EnterSymbol(id, node);
            }
        }
    }

    public void AddLibraryFunctionsToSymbolTable(String... files) throws IOException {
        for(String input : files){
            List<String> content = Files.readAllLines(Paths.get(input));
            String[] elements;
            for(String line : content){
                elements = line.split("\\s+"); //RobocodeName - OurName - returnType - Parameter(max 1)/Can be none
                String id = elements[1];
                Object type = FindType(elements[2]);
                SymbolClass sym = symbolTable.RetrieveSymbol(id);
                if(elements[3].equals("none")) {
                        if(sym  == null) {
                            MethodNode node = new MethodNode(0);
                            node.Type = type;
                            node.AdoptChildren(new IDNode(0, id), new RTypeNode(0, elements[2]));
                            symbolTable.EnterSymbol(id, node);
                        }
                    }
                else{
                    ArgumentNode anode = new ArgumentNode(0, elements[3]); //Has no refNode, might be a problem
                        if(sym  == null){
                            MethodNode mnode = new MethodNode(0);
                            mnode.Type = elements[2];
                            mnode.AdoptChildren(new IDNode(0, id), new RTypeNode(0, elements[2]));
                            mnode.AdoptChildren(anode);
                            symbolTable.EnterSymbol(id, mnode);
                        }
                }
            }

        }

    }

    private Object FindType(String type) {
        switch (type) {
            case "text":
            case "string":
                return String.class;
            case "bool":
            case "boolean":
                return boolean.class;
            case "int":
                return int.class;
            case "decimal":
            case "double":
                return double.class;
            case "void":
                return void.class;
            default:
                return null;
        }

    }
}
