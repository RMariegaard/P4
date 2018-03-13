import antlr.*;

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
    public Node visitDclStmt(antlrParser.DclStmtContext ctx) {
        return super.visitDclStmt(ctx);
    }

    @Override
    public Node visitAssignStmt(antlrParser.AssignStmtContext ctx) {
        return super.visitAssignStmt(ctx);
    }

    @Override
    public Node visitActionStmt(antlrParser.ActionStmtContext ctx) {
        return super.visitActionStmt(ctx);
    }

    @Override
    public Node visitIfStmt(antlrParser.IfStmtContext ctx) {
        return super.visitIfStmt(ctx);
    }

    @Override
    public Node visitDoStmt(antlrParser.DoStmtContext ctx) {
        return super.visitDoStmt(ctx);
    }

    @Override
    public Node visitWhileStmt(antlrParser.WhileStmtContext ctx) {
        return super.visitWhileStmt(ctx);
    }

    @Override
    public Node visitReturnStmt(antlrParser.ReturnStmtContext ctx) {
        return super.visitReturnStmt(ctx);
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
    public Node visitInfixExpr(antlrParser.InfixExprContext ctx) {
        return super.visitInfixExpr(ctx);
    }

    @Override
    public Node visitTermExpr(antlrParser.TermExprContext ctx) {
        return super.visitTermExpr(ctx);
    }

    @Override
    public Node visitArrayExpr(antlrParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public Node visitBoolExpr(antlrParser.BoolExprContext ctx) {
        return super.visitBoolExpr(ctx);
    }

    @Override
    public Node visitActionExpr(antlrParser.ActionExprContext ctx) {
        return super.visitActionExpr(ctx);
    }

    @Override
    public Node visitAndOrExpr(antlrParser.AndOrExprContext ctx) {
        return super.visitAndOrExpr(ctx);
    }

    @Override
    public Node visitNotExpr(antlrParser.NotExprContext ctx) {
        return super.visitNotExpr(ctx);
    }

    @Override
    public Node visitUnaryExpr(antlrParser.UnaryExprContext ctx) {
        return super.visitUnaryExpr(ctx);
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
