import Nodes.*;
import antlr.*;
import org.antlr.intellij.adaptor.parser.AntlrParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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
    public Node visitSetup(antlrParser.SetupContext ctx) {
        return new SetupNode().AdoptChildren(visit(ctx.block()));
    }

    @Override
    public Node visitGameloop(antlrParser.GameloopContext ctx) {
        return new GameLoopNode().AdoptChildren(visit(ctx.block()));
    }

    @Override
    public Node visitMethod(antlrParser.MethodContext ctx) {
        Node methodNode = new MethodNode();

        methodNode.AdoptChildren(visit(ctx.ID()));

        List<antlrParser.ArgmntContext> arguments = ctx.argmnt();
        if (!arguments.isEmpty()){
            for(antlrParser.ArgmntContext argument : arguments) {
                methodNode.AdoptChildren(visit(argument));
            }
        }

        methodNode.AdoptChildren(visit(ctx.block()));

        return methodNode;
    }

    @Override
    public Node visitPredcl(antlrParser.PredclContext ctx) {
        Node predclNode = new PredclNode();

        if (ctx.dcl() != null){
            predclNode.AdoptChildren(visit(ctx.dcl()));
        }
        else if (ctx.aoexpr() != null){
            predclNode.AdoptChildren(visit(ctx.aoexpr()));
        }

        return predclNode;
    }

    @Override
    public Node visitBlock(antlrParser.BlockContext ctx) {
        Node blockNode = new BlockNode();

        List<antlrParser.StmtContext> stmts = ctx.stmt();
        if (!stmts.isEmpty()){
            for(antlrParser.StmtContext stmt : stmts){
                blockNode.AdoptChildren(visit(stmt));
            }
        }

        return blockNode;
    }

    @Override
    public Node visitDclStmt(antlrParser.DclStmtContext ctx) {
        Node dclStmtNode = new DclStmtNode();

        dclStmtNode.AdoptChildren(visit(ctx.dcl()));

        return dclStmtNode;
    }

    @Override
    public Node visitAssignStmt(antlrParser.AssignStmtContext ctx) {
        Node assignStmtNode = new AssignStmtNode();

        assignStmtNode.AdoptChildren(visit(ctx.assign()));

        return assignStmtNode;
    }

    @Override
    public Node visitActionStmt(antlrParser.ActionStmtContext ctx) {
        Node actionStmtNode = new ActionStmtNode();

        actionStmtNode.AdoptChildren(visit(ctx.action()));

        return actionStmtNode;
    }

    @Override
    public Node visitIfStmt(antlrParser.IfStmtContext ctx) {
        Node ifStmtNode = new IfStmtNode();

        ifStmtNode.AdoptChildren(visit(ctx.first));
        ifStmtNode.AdoptChildren(visit(ctx.firstBlock));

        List<antlrParser.ElseifContext> elseIfs = ctx.elseif();
        if (elseIfs.isEmpty()) {
            for (antlrParser.ElseifContext elseIf : elseIfs) {
                ifStmtNode.AdoptChildren(visit(elseIf));
            }
        }

        if (ctx.secondBlock != null) {
            ifStmtNode.AdoptChildren(visit(ctx.secondBlock));
        }

        return ifStmtNode;
    }

    @Override
    public Node visitDoStmt(antlrParser.DoStmtContext ctx) {
        Node doStmtNode = new DoStmtNode();

        doStmtNode.AdoptChildren(visit(ctx.argmnt()));
        doStmtNode.AdoptChildren(visit(ctx.firstAo));
        doStmtNode.AdoptChildren(visit(ctx.secondAo));
        doStmtNode.AdoptChildren(visit(ctx.thirdAo));
        doStmtNode.AdoptChildren(visit(ctx.block()));

        return doStmtNode;
    }

    @Override
    public Node visitWhileStmt(antlrParser.WhileStmtContext ctx) {
        Node whileStmtNode = new WhileStmtNode();

        whileStmtNode.AdoptChildren(visit(ctx.aoexpr()));
        whileStmtNode.AdoptChildren(visit(ctx.block()));

        return whileStmtNode;
    }

    @Override
    public Node visitReturnStmt(antlrParser.ReturnStmtContext ctx) {
        Node returnStmtNode = new ReturnStmtNode();

        returnStmtNode.AdoptChildren(visit(ctx.expr()));

        return returnStmtNode;
    }

    @Override
    public Node visitAction(antlrParser.ActionContext ctx) {
        Node actionNode = new ActionNode();

        if (!ctx.ID().isEmpty()){
            List<TerminalNode> ids = ctx.ID();
            for (TerminalNode id : ids){
                actionNode.AdoptChildren(visit(id));
            }
            actionNode.AdoptChildren(visit(ctx.fcall()));
        }
        else {
            actionNode.AdoptChildren(visit(ctx.fcall()));
        }

        return  actionNode;
    }

    @Override
    public Node visitStrategy(antlrParser.StrategyContext ctx) {
        Node strategyNode = new StrategyNode();

        strategyNode.AdoptChildren(visit(ctx.ID()));

        List<antlrParser.BehaviorContext> behaviors = ctx.behavior();

        if (!behaviors.isEmpty()) {
            for (antlrParser.BehaviorContext behavior : behaviors) {
                strategyNode.AdoptChildren(visit(behavior));
            }
        }

        return strategyNode;
    }

    @Override
    public Node visitBehavior(antlrParser.BehaviorContext ctx) {
        Node behaviorNode = new BehaviorNode();

        behaviorNode.AdoptChildren(visit(ctx.ID()));
        behaviorNode.AdoptChildren(visit(ctx.block()));

        return behaviorNode;
    }

    @Override
    public Node visitFcall(antlrParser.FcallContext ctx) {
        Node fcallNode = new FcallNode();

        fcallNode.AdoptChildren(visit(ctx.ID()));

        List<antlrParser.ExprContext> exprs = ctx.expr();
        if (!exprs.isEmpty()){
            for (antlrParser.ExprContext expr : exprs){
                fcallNode.AdoptChildren(visit(expr));
            }
        }

        return fcallNode;
    }

    @Override
    public Node visitDcl(antlrParser.DclContext ctx) {
        Node dclNode = new DclNode();


        if (ctx.assign() != null){
            dclNode.AdoptChildren(visit(ctx.assign()));
        }
        else if (ctx.ref() != null){
            dclNode.AdoptChildren(visit(ctx.ref()));
        }

        return dclNode;
    }

    @Override
    public Node visitArgmnt(antlrParser.ArgmntContext ctx) {
        Node argumentNode = new ArgumentNode();

        argumentNode.AdoptChildren(visit(ctx.ref()));

        return argumentNode;
    }

    @Override
    public Node visitRef(antlrParser.RefContext ctx) {
        Node refNode = new RefNode();

        refNode.AdoptChildren(visit(ctx.ID()));

        if (ctx.expr() != null){
            refNode.AdoptChildren(visit(ctx.expr()));
        }

        return refNode;
    }

    @Override
    public Node visitAssign(antlrParser.AssignContext ctx) {
        Node assignNode = new AssignNode();

        assignNode.AdoptChildren(visit(ctx.ref()));
        if (ctx.ref() != null){
            assignNode.AdoptChildren(visit(ctx.expr()));
        }

        return assignNode;
    }

    @Override
    public Node visitAoexpr(antlrParser.AoexprContext ctx) {
        Node andOrExprNode = new AndorExprNode();

        andOrExprNode.AdoptChildren(visit(ctx.bexpr()));

        if (ctx.aoexpr() != null){
            andOrExprNode.AdoptChildren(visit(ctx.aoexpr()));
        }

        return andOrExprNode;
    }

    @Override
    public Node visitBoolexpr(antlrParser.BoolexprContext ctx) {
        Node boolExpr = new BoolExprNode();

        boolExpr.AdoptChildren(visit(ctx.expr()));
        boolExpr.AdoptChildren(visit(ctx.bexpr()));

        return boolExpr;
    }

    @Override
    public Node visitNotexpr(antlrParser.NotexprContext ctx) {
        Node notExprNode = new NotExprNode();

        notExprNode.AdoptChildren(visit(ctx.expr()));

        return notExprNode;
    }

    @Override
    public Node visitEmptyboolexpr(antlrParser.EmptyboolexprContext ctx) {
        Node emptyExprNode = new EmptyExprNode();

        emptyExprNode.AdoptChildren(visit(ctx.expr()));

        return emptyExprNode;
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
