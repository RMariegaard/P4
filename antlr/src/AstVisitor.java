import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;

public abstract class AstVisitor<T> {
    public abstract T Visit(WhileStmtNode node);
    public abstract T Visit(UsubNode node);
    public abstract T Visit(UAddNode node);
    public abstract T Visit(StrategyNode node);
    public abstract T Visit(SetupNode node);
    public abstract T Visit(RTypeNode node);
    public abstract T Visit(ReturnStmtNode node);
    public abstract T Visit(RefNode node);
    public abstract T Visit(ProgNode node);
    public abstract T Visit(OrNode node);
    public abstract T Visit(NullNode node);
    public abstract T Visit(MethodNode node);
    public abstract T Visit(LessNode node);
    public abstract T Visit(LessEqualNode node);
    public abstract T Visit(IfStmtNode node);
    public abstract T Visit(GreaterNode node);
    public abstract T Visit(GreaterEqualNode node);
    public abstract T Visit(GameLoopNode node);
    public abstract T Visit(EventNode node);
    public abstract T Visit(EqualNode node);
    public abstract T Visit(ElseNode node);
    public abstract T Visit(ElseIfNode node);
    public abstract T Visit(DoStmtNode node);
    public abstract T Visit(DclNode node);
    public abstract T Visit(BlockNode node);
    public abstract T Visit(BehaviorNode node);
    public abstract T Visit(AssignNode node);
    public abstract T Visit(ArgumentNode node);
    public abstract T Visit(AndNode node);
    public abstract T Visit(ActionNode node);
    public abstract T Visit(SubExprNode node);
    public abstract T Visit(NotExprNode node);
    public abstract T Visit(MulExprNode node);
    public abstract T Visit(InfixExprNode node);
    public abstract T Visit(DivExprNode node);
    public abstract T Visit(BoolExprNode node);
    public abstract T Visit(ArrayExprNode node);
    public abstract T Visit(AddExprNode node);
    public abstract T Visit(IntNode node);
    public abstract T Visit(IDNode node);
    public abstract T Visit(DecimalNode node);
    public abstract T Visit(StringNode node);
    public abstract T Visit(BoolNode node);


    public T Visit(Node node){
        if(node instanceof WhileStmtNode){
            return Visit((WhileStmtNode)node);
        } else if(node instanceof UsubNode){
            return Visit((UsubNode) node);
        } else if(node instanceof UAddNode){
            return Visit((UAddNode) node);
        } else if(node instanceof StrategyNode){
            return Visit((StrategyNode) node);
        } else if(node instanceof SetupNode){
            return Visit((SetupNode) node);
        } else if(node instanceof RTypeNode){
            return Visit((RTypeNode) node);
        } else if(node instanceof ReturnStmtNode){
            return Visit((ReturnStmtNode) node);
        } else if(node instanceof RefNode){
            return Visit((RefNode) node);
        } else if(node instanceof ProgNode){
            return Visit((ProgNode) node);
        } else if(node instanceof OrNode){
            return Visit((OrNode) node);
        } else if(node instanceof NullNode){
            return Visit((NullNode) node);
        } else if(node instanceof MethodNode){
            return Visit((MethodNode) node);
        } else if(node instanceof LessNode){
            return Visit((LessNode) node);
        } else if(node instanceof LessEqualNode){
            return Visit((LessEqualNode) node);
        } else if(node instanceof IfStmtNode){
            return Visit((IfStmtNode) node);
        } else if(node instanceof GreaterNode){
            return Visit((GreaterNode) node);
        } else if(node instanceof GreaterEqualNode){
            return Visit((GreaterEqualNode) node);
        } else if(node instanceof GameLoopNode){
            return Visit((GameLoopNode) node);
        } else if(node instanceof EventNode){
            return Visit((EventNode) node);
        } else if(node instanceof EqualNode){
            return Visit((EqualNode) node);
        } else if(node instanceof ElseNode){
            return Visit((ElseNode) node);
        } else if(node instanceof ElseIfNode){
            return Visit((ElseIfNode) node);
        } else if(node instanceof DoStmtNode){
            return Visit((DoStmtNode) node);
        } else if(node instanceof DclNode){
            return Visit((DclNode) node);
        } else if(node instanceof BlockNode){
            return Visit((BlockNode) node);
        } else if(node instanceof BehaviorNode){
            return Visit((BehaviorNode) node);
        } else if(node instanceof AssignNode){
            return Visit((AssignNode) node);
        } else if(node instanceof ArgumentNode){
            return Visit((ArgumentNode) node);
        } else if(node instanceof AndNode){
            return Visit((AndNode) node);
        } else if(node instanceof ActionNode){
            return Visit((ActionNode) node);
        } else if(node instanceof SubExprNode){
            return Visit((SubExprNode) node);
        } else if(node instanceof NotExprNode){
            return Visit((NotExprNode) node);
        } else if(node instanceof MulExprNode){
            return Visit((MulExprNode) node);
        } else if(node instanceof InfixExprNode){
            return Visit((InfixExprNode) node);
        } else if(node instanceof DivExprNode){
            return Visit((DivExprNode) node);
        } else if(node instanceof BoolExprNode){
            return Visit((BoolExprNode) node);
        } else if(node instanceof ArrayExprNode){
            return Visit((ArrayExprNode) node);
        } else if(node instanceof AddExprNode){
            return Visit((AddExprNode) node);
        } else if(node instanceof IntNode){
            return Visit((IntNode) node);
        } else if(node instanceof IDNode){
            return Visit((IDNode) node);
        } else if(node instanceof DecimalNode){
            return Visit((DecimalNode) node);
        } else if(node instanceof StringNode){
            return Visit((StringNode) node);
        } else if(node instanceof BoolNode){
            return Visit((BoolNode) node);
        }
        else
            return null; //hvad skal vi ellers returnere...
    }
}
