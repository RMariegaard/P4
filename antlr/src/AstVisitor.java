import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;
import antlr.antlrParser;

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
    public abstract T Visit(CharNode node);
    public abstract T Visit(BoolNode node);


    public void Visit(Node node){

    }
}
