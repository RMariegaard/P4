package other;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;

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
            if(leftNodeType.getClass().equals(rightNodeType.getClass())){
                if(leftNodeType.getClass().equals(int.class) || leftNodeType.getClass().equals(double.class)){
                    return leftNodeType;
                }
                else{
                    ErrorList.add(String.format("It is illegal to add two elements of type %s together", leftNodeType.toString()));
                }
            }
            else{
                ErrorList.add(String.format("You can't add to to elements of different types together.\nThe type of %s is %s, which doesn't match the type of %s, which is %s", node.LeftNode(), leftNodeType, node.RightNode(), rightNodeType));

            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public Object Visit(AndNode node) {
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
            if(exprType.getClass().equals(int.class)){
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
            Object idType = Visit(node.IDNode());
            Object valueType = Visit(node.ValueNode());
            if (idType.equals(valueType)) {
                return idType;
            }
            else{
                ErrorList.add(String.format("assigning %s to type %s not possible", node.IDNode().toString(), valueType.toString()));
            }
        }catch (NullPointerException e){

        }


        return null;
    }

    @Override
    public Object Visit(BehaviorNode node) {
        return null;
    }

    @Override
    public Object Visit(BlockNode node) {
        return null;
    }

    @Override
    public Object Visit(BoolExprNode node) {
        Object leftNodeType = Visit(node.LeftNode());
        Object rightNodeType = Visit(node.RightNode());
        if(leftNodeType.getClass().equals(rightNodeType.getClass())){

        }

        return null;
    }

    @Override
    public Object Visit(BoolNode node) {
        return Boolean.class;
    }

    @Override
    public Object Visit(DclNode node) {
        if(symbolTable.DeclaredLocally(node.getID())){
            ErrorList.add(node.toString() + "Duplicate decleration");
            return null;
        }
        symbolTable.EnterSymbol(node.getID(), node.Type);
        Visit(node.ChildNode());
        return null;
    }

    @Override
    public Object Visit(DecimalNode node) {
        return Double.class;
    }

    @Override
    public Object Visit(DivExprNode node) {
        return null;
    }

    @Override
    public Object Visit(DoStmtNode node) {
        return null;
    }

    @Override
    public Object Visit(ElseNode node) {
        return null;
    }

    @Override
    public Object Visit(ElseIfNode node) {
        return null;
    }

    @Override
    public Object Visit(EqualNode node) {
        return null;
    }

    @Override
    public Object Visit(EventNode node) {
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
        return Integer.class;
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
        return null;
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
        return null;
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
        return null;
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
