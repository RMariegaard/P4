import Nodes.AddExprNode;
import Nodes.Node;
import Nodes.ProgNode;
import antlr.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class BuildASTVisitor extends antlrBaseVisitor<Node>
{

    @Override
    public Node visitProg(antlrParser.ProgContext ctx) {
        Node progNode = new ProgNode();

        List<antlrParser.PredclContext> preDcls = ctx.predcl();
        if (!preDcls.isEmpty()) {
            for(antlrParser.PredclContext preDcl : preDcls) {
                progNode.AdoptChildren(visit(preDcl));
            }
        }
        progNode.AdoptChildren(visit(ctx.setup()));
        progNode.AdoptChildren(visit(ctx.gameloop()));



        List<antlrParser.SmContext> sms = ctx.sm();
        if (!sms.isEmpty()) {
            for(antlrParser.SmContext sm : sms) {
                if(sm.method()!=null){
                    progNode.AdoptChildren(visit(sm.method()));
                }
                else if(sm.strategy() != null){
                    progNode.AdoptChildren(visit(sm.strategy()));
                }
            }
        }
        

        return progNode;
    }

    @Override
    public Node visitSm(antlrParser.SmContext ctx) {
        return super.visitSm(ctx);
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
    public Node visitArgmnt(antlrParser.ArgmntContext ctx) {
        return super.visitArgmnt(ctx);
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
    public Node visitAndorexpr(antlrParser.AndorexprContext ctx) {
        return super.visitAndorexpr(ctx);
    }

    @Override
    public Node visitAoexpr(antlrParser.AoexprContext ctx) {
        return super.visitAoexpr(ctx);
    }

    @Override
    public Node visitEmptyaoexpr(antlrParser.EmptyaoexprContext ctx) {
        return super.visitEmptyaoexpr(ctx);
    }

    @Override
    public Node visitBoolexpr(antlrParser.BoolexprContext ctx) {
        return super.visitBoolexpr(ctx);
    }

    @Override
    public Node visitNotexpr(antlrParser.NotexprContext ctx) {
        return super.visitNotexpr(ctx);
    }

    @Override
    public Node visitEmptyboolexpr(antlrParser.EmptyboolexprContext ctx) {
        return super.visitEmptyboolexpr(ctx);
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
    public Node visitActionExpr(antlrParser.ActionExprContext ctx) {
        return super.visitActionExpr(ctx);
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
