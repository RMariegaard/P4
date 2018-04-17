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
        return null;
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
                    ErrorList.add(String.format("It is illegal to add two elements of type %s together", leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("You can't add two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

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
                ErrorList.add("&& both arguments have to be of type Boolean");
                //return bool or null?
            }
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    @Override
    public Object Visit(ArgumentNode node) {
        return null;
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
                ErrorList.add(String.format("Array can only be indexed with type Integer not with %s", exprType.getClass()));
                return null;
            }

        }
        else{
            ErrorList.add(String.format("The array %s is not declared", node.IDNode()));
            return null;
        }
    }

    @Override
    public Object Visit(AssignNode node) {
        try {
            Object idType = Visit(node.RefNode());
            Object valueType = Visit(node.ValueNode());
            if (idType.equals(valueType)) {
                return idType;
            }
            else{
                ErrorList.add(String.format("on line %s, assigning %s to type %s not possible", node.FirstLinenumber, valueType.toString(), idType.toString()));
            }
        }catch (NullPointerException e){
            ErrorList.add(String.format("Variable %s does not exist, and cant be assigned to", node.RefNode().LeftmostChild.toString()));
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
            ErrorList.add(node.toString() + ", It already exist");
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
                    ErrorList.add(String.format("It is illegal to divide two elements of type %s together", leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("You can't divide two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(DoStmtNode node) {
        return null;
    }

    @Override
    public Object Visit(ElseNode node) {
        Visit(node.Block());
        return null;
    }

    @Override
    public Object Visit(ElseIfNode node) {
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
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    @Override
    public Object Visit(EventNode node) {
        if(symbolTable.DeclaredLocally(node.ID().toString())) {
            ErrorList.add(String.format("Event with name %s already declared", node.ID().toString()));
            return null;
        }
        Object condition = Visit(node.ExprNode());
        if(condition instanceof Boolean)
            symbolTable.EnterSymbol(node.ID().toString(), EventType.class);
        else
            ErrorList.add(String.format("The condition of event %s is not of type boolean", node.ID().toString()));
        //Visit(node.ID()); Den skal vel ikke besøge ID, da vi lægger den ind her anyway.
        return null;
    }

    @Override
    public Object Visit(GameLoopNode node) {
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
            ErrorList.add(node.idString + " was not declared in this scope.");
            return null;
        }
        else{
            return sym.type;
        }
    }

    @Override
    public Object Visit(IfStmtNode node) {
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
        return null;
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
                    ErrorList.add(String.format("It is illegal to multiply two elements of type %s together", leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("You can't multiply two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(NotExprNode node) {
        return null;
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
        return null;
    }

    @Override
    public Object Visit(ReturnStmtNode node) {
        return null;
    }

    @Override
    public Object Visit(RefNode node) {
        return Visit(node.IDNode());
    }

    @Override
    public Object Visit(SetupNode node) {
        return null;
    }

    @Override
    public Object Visit(StrategyNode node) {
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
                    ErrorList.add(String.format("It is illegal to subtract two elements of type %s together", leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("You can't subtract two elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(UsubNode node) {
        if(!(Visit(node.IDNode()) instanceof Integer)){
            ErrorList.add(node.toString() + "USub not int");
        }
        return Integer.class;
        //Returns integer even if an error occurs, so that the program can continue
        //Ved ikke om dette er iorden, men hvis man returnere andet blever den jo ved med at lave fejl hele vejen op igennem træet
    }

    @Override
    public Object Visit(UAddNode node) {
        if(!(Visit(node.IDNode()) instanceof Integer)){
            ErrorList.add(node.toString() + "UAdd not int");
        }
        return Integer.class;
    }

    @Override
    public Object Visit(WhileStmtNode node) {
        if(! (Visit(node.ConditionNode()) instanceof Boolean)){
            ErrorList.add(node.toString() + "Condition not boolean");
        }
        Visit(node.BlockNode());


        return null;
    }
}
