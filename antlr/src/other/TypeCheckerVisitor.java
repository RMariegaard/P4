package other;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;
import Types.EventType;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckerVisitor extends AstVisitor<Object> {
    public List<String> ErrorList = new ArrayList<>();
    public SymbolTable symbolTable = new SymbolTable();


    @Override
    public Object Visit(ActionNode node) {
        Node[] array = node.IDNodes();
        for(int i = 0; i<array.length; i++) {
            Visit(array[i]);
        }
        return Visit(node.Fcall());
    }

    @Override
    public Object Visit(AddExprNode node) {
        //Compares the class of the left node to the right node
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.equals(rightNodeType)){
                if(leftNodeType instanceof Integer || leftNodeType instanceof Double){ //ikke sikker på dette virker før var det "leftNodeType.getClass().equals(int.class)
                    return leftNodeType;
                }
                else{
                    ErrorList.add(String.format("Line %s: Line %s It is illegal to add two elements of type %s together", node.FirstLinenumber, leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("Line %s: Line %s: You can't add two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.FirstLinenumber,  node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(AndNode node) {
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType instanceof Boolean && rightNodeType instanceof Boolean) {
                return boolean.class;
            }
            else{
                ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + "&& both arguments have to be of type Boolean");
                //return bool or null?
            }
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    @Override
    public Object Visit(ArgumentNode node) {
        RefNode rNode = node.RefNode();
        if(symbolTable.DeclaredLocally(rNode.IDNode().toString())){
            ErrorList.add(String.format("Line %s: Argument %s is already declared in this scope", node.FirstLinenumber, rNode.IDNode()));
            return null;
        }
        else{
            symbolTable.EnterSymbol(rNode.IDNode().toString(), node.Type);
            return node.Type;
        }

    }

    @Override
    public Object Visit(ArrayExprNode node) {
        if(Visit(node.IDNode()) != null){
            SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().toString());
            Object exprType = Visit(node.ExprNode()).getClass();
            if(exprType.equals(int.class)){
                return sym.type;
            }
            else {
                ErrorList.add(String.format("Line %s: Array can only be indexed with type Integer not with %s",node.FirstLinenumber, exprType.getClass()));
                return null;
            }

        }
        else{
            ErrorList.add(String.format("Line %s: The array %s is not declared", node.FirstLinenumber, node.IDNode()));
            return null;
        }
    }

    @Override
    public Object Visit(AssignNode node) {
        try {
            Object idType = Visit(node.RefNode());
            Object valueType = Visit(node.ValueNode());
            if(valueType == null){
                //TODO: if valuetype is zero then another error has happen and has been reported. however should type null be written to the user?
                return null;
            }
            else if (idType.equals(valueType)) {
                return idType;
            }
            else{
                ErrorList.add(String.format("Line %s: assigning %s to type %s not possible", node.FirstLinenumber, node.FirstLinenumber, valueType.toString(), idType.toString()));
            }
        }catch (NullPointerException e){
            ErrorList.add(String.format("Line %s: Variable %s does not exist, and cant be assigned to", node.FirstLinenumber, node.RefNode().LeftmostChild.toString()));
        }
        return null;
    }

    @Override
    public Object Visit(BehaviorNode node) {
        Visit(node.IDNode()); //Vi skal have tilføjet alle behaviors til symboltable
        Visit(node.BlockNode());
        return null;
    }

    @Override
    public Object Visit(BlockNode node) {
        Node[] children = node.StmtNodes();
        for(int i=0; i<children.length; i++){
            Visit(children[i]);
        }
        return null;
    }

    @Override
    public Object Visit(BoolNode node) {
        return boolean.class;
    }

    @Override
    public Object Visit(DclNode node) {
        if(symbolTable.DeclaredLocally(node.getID())){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + ", It already exist");
            return null;
        }
        symbolTable.EnterSymbol(node.getID(), node.Type);
        Visit(node.ChildNode());
        //if(node.Type.equals(Visit(node.ChildNode())))
        //    symbolTable.EnterSymbol(node.getID(), node.Type);
        return null;
    }

    @Override
    public Object Visit(DecimalNode node) {
        return double.class;
    }

    @Override
    public Object Visit(DivExprNode node) {
        //Compares the object of the left node to the right node
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.equals(rightNodeType)){
                if(leftNodeType instanceof Integer || leftNodeType instanceof Double){
                    //Hvordan fuck checker man for divide med 0?? svar: det her er jo typechecking. Det skal gøre et andet sted
                    return leftNodeType;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to divide two elements of type %s together", node.FirstLinenumber, leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't divide two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.FirstLinenumber, node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(DoStmtNode node) {
        symbolTable.OpenScope();
        if (Visit(node.VariableNode()) != int.class) {
            ErrorList.add(String.format("Line %s: the variable %s in Do construct has to be of type int", node.FirstLinenumber, node.VariableNode().RefNode().IDNode().toString()));
        }
        Object sType = Visit(node.StartValueNode());
        if(sType != int.class){
            ErrorList.add(String.format("Line %s: the startvalue for the do loop has to be of type int and cant be %s", node.FirstLinenumber, sType));
        }
        Object eType = Visit(node.EndValueNode());
        if(eType != int.class){
            ErrorList.add(String.format("Line %s: the endvalue for the do loop has to be of type int and cant be %s", node.FirstLinenumber, eType));
        }
        //Jaaaaaaaaaaa- hvordan var det lige vores do loop var ??
        Visit(node.IncrementNode());
        Visit(node.BlockNode());
        symbolTable.CloseScope();
        return null;
    }

    @Override
    public Object Visit(ElseNode node) {
        Visit(node.Block());
        return null;
    }

    @Override
    public Object Visit(ElseIfNode node) {
        Visit(node.Condition());
        Visit(node.Block());
        return null;
    }

    @Override
    public Object Visit(EqualNode node) {
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType.equals(rightNodeType)) {
                return boolean.class;
                //skal man kunne sige string == string i vores sprog? kan man ikke i java så dette skal vi tage højde for når vi laver code generation.
            }
            else
                ErrorList.add(String.format("Line %s: Cannot compare type %s and %s, type must be the same",node.FirstLinenumber,leftNodeType, rightNodeType));
        }catch (NullPointerException e){

            System.out.println(String.format("Something went wrong... Left node on line %s was most likely type null", node.FirstLinenumber));
            return null;
        }
        return null;
    }

    @Override
    public Object Visit(EventNode node) {
        if(symbolTable.DeclaredLocally(node.ID().toString())) {
            ErrorList.add(String.format("Line %s: Event with name %s already declared", node.FirstLinenumber, node.ID().toString()));
            return null;
        }
        Object condition = Visit(node.ExprNode());
        if(condition instanceof Boolean)
            symbolTable.EnterSymbol(node.ID().toString(), EventType.class);
        else
            ErrorList.add(String.format("Line %s: The condition of event %s is not of type boolean", node.FirstLinenumber, node.ID().toString()));
        //Visit(node.ID()); Den skal vel ikke besøge ID, da vi lægger den ind her anyway.
        return null;
    }

    @Override
    public Object Visit(FcallNode node) {
        Object type = Visit(node.IDNode());
        SymbolClass sym = symbolTable.RetrieveSymbol(node.IDNode().idString);
        if(sym != null){
            int numberOfparams = sym.Parameters != null ? sym.Parameters.length : 0;
            int numberOfargs = node.NumberOfArguments();
            if(numberOfargs != numberOfparams){
                ErrorList.add(String.format("Line %s: Number of arguments does not match the number of parameters for the method %s", node.FirstLinenumber, node.IDNode().toString()));
            }
            ArgumentNode[] arguments = node.ArgumentNodes();
            for(int i = 0; i<numberOfparams; i++) {
                if (sym.Parameters[i].Type != arguments[i]) {
                    ErrorList.add(String.format("Line %s, Argument number %s has to be of type %s", node.FirstLinenumber, i + 1, sym.Parameters[i].Type.toString()));
                }
            }
        }
        return type;
    }

    @Override
    public Object Visit(GameLoopNode node) {
        Visit(node.Block());
        return null;
    }

    @Override
    public Object Visit(GreaterNode node) {
        return null;
    }

    @Override
    public Object Visit(GreaterEqualNode node) {
        return null;
    }

    @Override
    public Object Visit(IDNode node) {
        SymbolClass sym = symbolTable.RetrieveSymbol(node.idString);
        if(sym == null){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.idString + " was not declared in this scope.");
            return null;
        }
        else{
            return sym.type;
        }
    }

    @Override
    public Object Visit(IfStmtNode node) {
        Visit(node.Condition());
        Visit(node.Block());
        return null;
    }

    @Override
    public Object Visit(InfixExprNode node) {
        return null;
    }

    @Override
    public Object Visit(IntNode node) {
        return int.class;
    }

    @Override
    public Object Visit(LessEqualNode node) {
        return null;
    }

    @Override
    public Object Visit(LessNode node) {
        return null;
    }

    @Override
    public Object Visit(MethodNode node) {
        RTypeNode typeNode = node.RTypeNode();
        if(symbolTable.DeclaredLocally(node.IDNode().toString())){
            ErrorList.add(String.format("Line %s: The name %s is already used in this scope", node.FirstLinenumber, node.IDNode().toString()));
            return null;
        }
        else {
            symbolTable.EnterSymbol(node.IDNode().toString(), typeNode.toString(), node.Parameters());
            return typeNode.Type;
        }
    }

    @Override
    public Object Visit(MulExprNode node) {
        //Compares the class of the left node to the right node
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.equals(rightNodeType)){
                if(leftNodeType instanceof Integer || leftNodeType instanceof Double){ //ikke sikker på dette virker før var det "leftNodeType.getClass().equals(int.class)
                    return leftNodeType;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to multiply two elements of type %s together",node.FirstLinenumber,  leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't multiply two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s",node.FirstLinenumber,  node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(NotExprNode node) {
        Object type = Visit(node.ExprNode());
        if(type != boolean.class){
            ErrorList.add(String.format("Line %s: The expression is not of type boolean", node.FirstLinenumber));
            return null;
        }
        else{
            return type;
        }
    }

    @Override
    public Object Visit(NullNode node) {
        return null;
    }

    @Override
    public Object Visit(OrNode node) {
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try {
            if (leftNodeType instanceof Boolean && rightNodeType instanceof Boolean) {
                return boolean.class;

            }
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    @Override
    public Object Visit(ProgNode node) {
        //Skal man starte med at åbne et scope??
        //ellers besøger jeg vel bare alle børnene
        symbolTable.OpenScope();
        Node child = node.LeftmostChild;
        while (child != null){
            Visit(child);
            child = child.RightSibling;
        }

        symbolTable.CloseScope();
        return node; //idk
    }

    @Override
    public Object Visit(RTypeNode node) {
        return node.Type;
    }

    @Override
    public Object Visit(ReturnStmtNode node) {
        return Visit(node.ExprNode());
    }

    @Override
    public Object Visit(RefNode node) {
        return Visit(node.IDNode());
    }

    @Override
    public Object Visit(SetupNode node) {
        return Visit(node.BlockNode());
    }

    @Override
    public Object Visit(StrategyNode node) {
        Visit(node.IDNode());
        for(Node bnode : node.BehaviourNodes()){
           Visit(bnode);
        }
        return null;
    }

    @Override
    public Object Visit(StringNode node) {
        return String.class;
    }

    @Override
    public Object Visit(SubExprNode node) {
        //Compares the class of the left node to the right node
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        try{
            if(leftNodeType.equals(rightNodeType)){
                if(leftNodeType instanceof Integer || leftNodeType instanceof Double){ //ikke sikker på dette virker før var det "leftNodeType.getClass().equals(int.class)
                    return leftNodeType;
                }
                else{
                    ErrorList.add(String.format("Line %s: It is illegal to subtract two elements of type %s together",node.FirstLinenumber,  leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("Line %s: You can't subtract two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s",node.FirstLinenumber,  node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(UsubNode node) {
        if(Visit(node.RefNode()) != int.class){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "USub not int");
        }
        return Integer.class;
        //Returns integer even if an error occurs, so that the program can continue
        //Ved ikke om dette er iorden, men hvis man returnere andet blever den jo ved med at lave fejl hele vejen op igennem træet
    }

    @Override
    public Object Visit(UAddNode node) {
        if(Visit(node.RefNode()) != int.class){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "UAdd not int");
        }
        return Integer.class;
    }

    @Override
    public Object Visit(WhileStmtNode node) {
        if(! (Visit(node.ConditionNode()) instanceof Boolean)){
            ErrorList.add(String.format("Line %s: ", node.FirstLinenumber) + node.toString() + "Condition not boolean");
        }
        Visit(node.BlockNode());


        return null;
    }
}
