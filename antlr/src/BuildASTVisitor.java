package com.company;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;
import antlr.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.lang.*;

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

        methodNode.AdoptChildren(new IDNode(ctx.ID().getText()));
        methodNode.AdoptChildren(new RTypeNode(ctx.rtype().getText()));
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
    public Node visitPdcl(antlrParser.PdclContext ctx) {
        return visit(ctx.dcl());
    }

    @Override
    public Node visitEventDcl(antlrParser.EventDclContext ctx) {
        Node eventNode = new EventNode();
        eventNode.AdoptChildren(visit(ctx.aoexpr()));
        eventNode.AdoptChildren(new IDNode(ctx.ID().getText()));
        return eventNode;
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
        return visit(ctx.action());
    }

    @Override
    public Node visitIfStmt(antlrParser.IfStmtContext ctx) {
        Node ifStmtNode = new IfStmtNode();

        ifStmtNode.AdoptChildren(visit(ctx.first));
        ifStmtNode.AdoptChildren(visit(ctx.firstBlock));

        List<antlrParser.ElseifContext> elseIfs = ctx.elseif();
        if (!elseIfs.isEmpty()) {
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
    public Node visitElseif(antlrParser.ElseifContext ctx) {
        Node ElseIfNode = new ElseIfNode();

        ElseIfNode.AdoptChildren(visit(ctx.aoexpr()), visit(ctx.block()));

        return ElseIfNode;

    }

    @Override
    public Node visitAction(antlrParser.ActionContext ctx) {
        Node actionNode = new ActionNode();

        if (!ctx.ID().isEmpty()){
            List<TerminalNode> ids = ctx.ID();
            for (TerminalNode id : ids){
                actionNode.AdoptChildren(new IDNode(id.getText()));
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

        strategyNode.AdoptChildren(new IDNode(ctx.ID().getText()));

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

        behaviorNode.AdoptChildren(new IDNode(ctx.ID().getText()));
        behaviorNode.AdoptChildren(visit(ctx.block()));

        return behaviorNode;
    }

    @Override
    public Node visitFcall(antlrParser.FcallContext ctx) {
        Node IDNode = new IDNode(ctx.ID().getText());

        List<antlrParser.ExprContext> exprs = ctx.expr();
        if (!exprs.isEmpty()){
            for (antlrParser.ExprContext expr : exprs){
                IDNode.AdoptChildren(visit(expr));
            }
        }

        return IDNode;
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

        Node IDNode = new IDNode(ctx.ID().getText());

        if (ctx.expr() != null){
            Node RefNode = new RefNode();
            RefNode.AdoptChildren(IDNode.MakeSiblings(visit(ctx.expr())));
            return RefNode;
        }
        else {
            return IDNode;
        }
    }

    @Override
    public Node visitAssign(antlrParser.AssignContext ctx) {
        Node assignNode = new AssignNode();

        assignNode.AdoptChildren(visit(ctx.ref()));
        if (ctx.expr() != null){
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
        return visit(ctx.expr());
    }

    @Override
    public Node visitInfixExpr(antlrParser.InfixExprContext ctx) {
        Node infixNode;
        switch (ctx.op.getType()){
            case antlrParser.OP_ADD:
                infixNode = new AddExprNode();
                break;

            case antlrParser.OP_SUB:
                infixNode = new SubExprNode();
                break;
            default:
                //throw an exeption or some shit.
                infixNode = new NullNode(); //this is not something that should be used.
        }
        infixNode.AdoptChildren(visit(ctx.term()));
        infixNode.AdoptChildren(visit(ctx.expr()));

        return infixNode;

    }

    @Override
    public Node visitTermExpr(antlrParser.TermExprContext ctx) {
        return visitTerm(ctx.term());
    }

    @Override
    public Node visitArrayExpr(antlrParser.ArrayExprContext ctx) {
        Node arrayExprNode = new ArrayExprNode();
        arrayExprNode.AdoptChildren(new IDNode(ctx.ID().getText()));
        arrayExprNode.AdoptChildren(visit(ctx.expr()));

        return arrayExprNode;
    }

    @Override
    public Node visitActionExpr(antlrParser.ActionExprContext ctx) {
        return visitAction(ctx.action());
    }

    @Override
    public Node visitUnaryExpr(antlrParser.UnaryExprContext ctx) {
        Node unaryNode;
        switch (ctx.op.getType()){
            case antlrParser.OP_UADD:
                unaryNode = new UAddNode();
                break;
            case antlrParser.OP_USUB:
                unaryNode = new UsubNode();
                break;
            default:
                unaryNode = new NullNode(); //This is not supposed to be there call exception instead
                //idk where to catch it tho, and in java u have to catch it.
        }

        return unaryNode.AdoptChildren(visit(ctx.factor()));
    }

    @Override
    public Node visitTerm(antlrParser.TermContext ctx) {
        if (ctx.term() != null) {
            Node infixNode;
            switch (ctx.op.getType()){
                case antlrParser.OP_MUL:
                    infixNode = new MulExprNode();
                    break;

                case antlrParser.OP_DIV:
                    infixNode = new DivExprNode();
                    break;
                default:
                    //throw an exeption or some shit.
                    infixNode = new NullNode(); //this is not something that should be used.
            }
            infixNode.AdoptChildren(visit(ctx.factor()));
            infixNode.AdoptChildren(visit(ctx.term()));

            return infixNode;
        }
        else
            return visitFactor(ctx.factor());

    }

    @Override
    public Node visitFactor(antlrParser.FactorContext ctx) {
        if(ctx.aoexpr() != null){
            return visit(ctx.aoexpr());
        }
        else
            switch (ctx.op.getType()){
                case antlrParser.ID:
                    return new IDNode(ctx.ID().getText());
                case antlrParser.INT_NUM:
                    return new IntNode(Integer.parseInt(ctx.INT_NUM().getText()));
                case antlrParser.BOOL_VALUE:
                    return new BoolNode(Boolean.parseBoolean(ctx.BOOL_VALUE().getText()));
                case antlrParser.CHAR_VALUE:
                    char x = ctx.CHAR_VALUE().getText().charAt(0);
                    return new CharNode(x);
                case antlrParser.DECIMAL_NUM:
                    return new DecimalNode(Double.parseDouble(ctx.DECIMAL_NUM().getText()));
                default:
                    return new NullNode(); //should not call this, exeptions instead

            }

    }
}
