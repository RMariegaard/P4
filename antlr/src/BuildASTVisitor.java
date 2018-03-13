import gen.antlr.*;

public class BuildASTVisitor extends antlrBaseVisitor<Node>
{
    @Override
    public Node visitProg(antlrParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Node visitSetup(antlrParser.SetupContext ctx) {
        return super.visitSetup(ctx);
    }

    @Override
    public Node visitGameloop(antlrParser.GameloopContext ctx) {
        return super.visitGameloop(ctx);
    }

    @Override
    public Node visitMethod(antlrParser.MethodContext ctx) {
        return super.visitMethod(ctx);
    }

    @Override
    public Node visitPredcl(antlrParser.PredclContext ctx) {
        return super.visitPredcl(ctx);
    }

    @Override
    public Node visitBlock(antlrParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Node visitStmt(antlrParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Node visitAction(antlrParser.ActionContext ctx) {
        return super.visitAction(ctx);
    }

    @Override
    public Node visitStrategy(antlrParser.StrategyContext ctx) {
        return super.visitStrategy(ctx);
    }

    @Override
    public Node visitBehavior(antlrParser.BehaviorContext ctx) {
        return super.visitBehavior(ctx);
    }

    @Override
    public Node visitFcall(antlrParser.FcallContext ctx) {
        return super.visitFcall(ctx);
    }

    @Override
    public Node visitDcl(antlrParser.DclContext ctx) {
        return super.visitDcl(ctx);
    }

    @Override
    public Node visitType(antlrParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Node visitRef(antlrParser.RefContext ctx) {
        return super.visitRef(ctx);
    }

    @Override
    public Node visitAssign(antlrParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public Node visitExpr(antlrParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Node visitTerm(antlrParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Node visitFactor(antlrParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }
}
