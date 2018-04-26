package other;

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
        Node progNode = new ProgNode(0);

        List<antlrParser.PredclContext> preDcls = ctx.predcl();
        if (!preDcls.isEmpty()) {
            for(antlrParser.PredclContext preDcl : preDcls) {
                progNode.AdoptChildren(visit(preDcl));
            }
        }
        progNode.AdoptChildren(visit(ctx.setup()));
        progNode.AdoptChildren(visit(ctx.gameloop()));



/*        List<antlrParser.SmContext> sms = ctx.sm();
        if (!sms.isEmpty()) {
            for(antlrParser.SmContext sm : sms) {
                if(sm.method()!=null){
                    progNode.AdoptChildren(visit(sm.method()));
                }
                else if(sm.strategy() != null){
                    progNode.AdoptChildren(visit(sm.strategy()));
                }
            }
        }*/




        List<antlrParser.StrategyContext> strat = ctx.strategy();
        if(!strat.isEmpty()){
            for(antlrParser.StrategyContext s : strat){
                progNode.AdoptChildren(visit(s));
            }
        }
        List<antlrParser.MethodContext> meth = ctx.method();
        if(!meth.isEmpty()){
            for(antlrParser.MethodContext m : meth){
                progNode.AdoptChildren(visit(m));
            }
        }




        return progNode;
    }

    @Override
    public Node visitSetup(antlrParser.SetupContext ctx) {
        return new SetupNode(ctx.start.getLine()).AdoptChildren(visit(ctx.block()));
    }

    @Override
    public Node visitGameloop(antlrParser.GameloopContext ctx) {
        return new GameLoopNode(ctx.start.getLine()).AdoptChildren(visit(ctx.block()));
    }

    @Override
    public Node visitMethod(antlrParser.MethodContext ctx) {
        int linenumber = ctx.start.getLine();
        Node methodNode = new MethodNode(linenumber);

        methodNode.AdoptChildren(new IDNode(linenumber, ctx.ID().getText()));
        methodNode.AdoptChildren(new RTypeNode(linenumber, ctx.rtype().getText()));
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
        int linenumber = ctx.start.getLine();
        Node eventNode = new EventNode(linenumber);
        eventNode.AdoptChildren(new IDNode(linenumber, ctx.ID().getText()));
        eventNode.AdoptChildren(visit(ctx.aoexpr()));
        return eventNode;
    }


    @Override
    public Node visitBlock(antlrParser.BlockContext ctx) {
        Node blockNode = new BlockNode(ctx.start.getLine());

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
        return visit(ctx.dcl());
    }

    @Override
    public Node visitAssignStmt(antlrParser.AssignStmtContext ctx) {

        return visit(ctx.assign());
    }

    @Override
    public Node visitActionStmt(antlrParser.ActionStmtContext ctx) {
        return visit(ctx.action());
    }

    @Override
    public Node visitIfStmt(antlrParser.IfStmtContext ctx) {
        Node ifStmtNode = new IfStmtNode(ctx.start.getLine());

        ifStmtNode.AdoptChildren(visit(ctx.first));
        ifStmtNode.AdoptChildren(visit(ctx.firstBlock));

        List<antlrParser.ElseifContext> elseIfs = ctx.elseif();
        if (!elseIfs.isEmpty()) {
            for (antlrParser.ElseifContext elseIf : elseIfs) {
                ifStmtNode.AdoptChildren(visit(elseIf));
            }
        }

        if (ctx.secondBlock != null) {
            Node elseN = new ElseNode(ctx.secondBlock.start.getLine());
            elseN.AdoptChildren(visit(ctx.secondBlock));
            ifStmtNode.AdoptChildren(elseN);
        }

        return ifStmtNode;
    }

    @Override
    public Node visitDoStmt(antlrParser.DoStmtContext ctx) {
        Node doStmtNode = new DoStmtNode(ctx.start.getLine());

        doStmtNode.AdoptChildren(visit(ctx.argmnt()));
        doStmtNode.AdoptChildren(visit(ctx.firstAo));
        doStmtNode.AdoptChildren(visit(ctx.secondAo));
        doStmtNode.AdoptChildren(visit(ctx.thirdAo));
        doStmtNode.AdoptChildren(visit(ctx.block()));

        return doStmtNode;
    }

    @Override
    public Node visitWhileStmt(antlrParser.WhileStmtContext ctx) {
        Node whileStmtNode = new WhileStmtNode(ctx.start.getLine());

        whileStmtNode.AdoptChildren(visit(ctx.aoexpr()));
        whileStmtNode.AdoptChildren(visit(ctx.block()));

        return whileStmtNode;
    }

    @Override
    public Node visitReturnStmt(antlrParser.ReturnStmtContext ctx) {
        Node returnStmtNode = new ReturnStmtNode(ctx.start.getLine());

        returnStmtNode.AdoptChildren(visit(ctx.expr()));

        return returnStmtNode;
    }

    @Override
    public Node visitIncrStmt(antlrParser.IncrStmtContext ctx) {
        Node unaryNode;
        int linenumber = ctx.start.getLine();
        switch (ctx.op.getType()){
            case antlrParser.OP_UADD:
                unaryNode = new UAddNode(linenumber);
                break;
            case antlrParser.OP_USUB:
                unaryNode = new UsubNode(linenumber);
                break;
            default:
                unaryNode = new NullNode(linenumber); //This is not supposed to be there call exception instead
                //idk where to catch it tho, and in java u have to catch it.
        }

        return unaryNode.AdoptChildren(visit(ctx.ref()));
    }

    @Override
    public Node visitElseif(antlrParser.ElseifContext ctx) {
        Node ElseIfNode = new ElseIfNode(ctx.start.getLine());

        ElseIfNode.AdoptChildren(visit(ctx.aoexpr()), visit(ctx.block()));

        return ElseIfNode;

    }

    @Override
    public Node visitAction(antlrParser.ActionContext ctx) {
        Node actionNode = new ActionNode(ctx.start.getLine());

        if (!ctx.ID().isEmpty()){
            List<TerminalNode> ids = ctx.ID();
            for (TerminalNode id : ids){
                actionNode.AdoptChildren(new IDNode(actionNode.FirstLinenumber, id.getText())); //functioncalls can only be on one line.
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
        Node strategyNode = new StrategyNode(ctx.start.getLine());

        strategyNode.AdoptChildren(new IDNode(ctx.start.getLine(), ctx.ID().getText()));

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
        int linenumber = ctx.start.getLine();
        Node behaviorNode = new BehaviorNode(linenumber);

        behaviorNode.AdoptChildren(new IDNode(linenumber, ctx.ID().getText()));
        behaviorNode.AdoptChildren(visit(ctx.block()));

        return behaviorNode;
    }

    @Override
    public Node visitFcall(antlrParser.FcallContext ctx) {
        FcallNode fnode = new FcallNode(ctx.start.getLine());
        Node IDNode = new IDNode(ctx.start.getLine(), ctx.ID().getText());
        fnode.AdoptChildren(IDNode);
        List<antlrParser.ExprContext> exprs = ctx.expr();
        if (!exprs.isEmpty()){
            for (antlrParser.ExprContext expr : exprs){
                fnode.AdoptChildren(visit(expr));
            }
        }

        return fnode;
    }

    @Override
    public Node visitDcl(antlrParser.DclContext ctx) {
        Node dclNode = new DclNode(ctx.start.getLine(), ctx.type().getText());

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
        Node argumentNode = new ArgumentNode(ctx.start.getLine(), ctx.type().getText());

        argumentNode.AdoptChildren(visit(ctx.ref()));

        return argumentNode;
    }

    @Override
    public Node visitRef(antlrParser.RefContext ctx) {

        int linenumber = ctx.start.getLine();
        Node refNode = new RefNode(linenumber);
        Node idNode = new IDNode(linenumber, ctx.ID().getText());
        refNode.AdoptChildren(idNode);
        if (ctx.expr() != null){
            refNode.AdoptChildren(visit(ctx.expr()));
        }
        return refNode;
    }

    @Override
    public Node visitAssign(antlrParser.AssignContext ctx) {
        Node assignNode = new AssignNode(ctx.start.getLine());

        assignNode.AdoptChildren(visit(ctx.ref()));
        if (ctx.aoexpr() != null){
            assignNode.AdoptChildren(visit(ctx.aoexpr()));
        }

        return assignNode;
    }

    @Override
    public Node visitAoexpr(antlrParser.AoexprContext ctx) {
        Node andOrExprNode;
        int linenumber = ctx.start.getLine();
        if(ctx.op != null) {
            switch (ctx.op.getType()) {

                case antlrParser.OP_AND:
                    andOrExprNode = new AndNode(linenumber);
                    andOrExprNode.AdoptChildren(visit(ctx.bexpr()));
                    andOrExprNode.AdoptChildren(visit(ctx.aoexpr()));
                    break;
                case antlrParser.OP_OR:
                    andOrExprNode = new OrNode(linenumber);
                    andOrExprNode.AdoptChildren(visit(ctx.bexpr()));
                    andOrExprNode.AdoptChildren(visit(ctx.aoexpr()));
                    break;
                default:
                    andOrExprNode = new NullNode(linenumber);
            }
        }
        else{
            andOrExprNode = visit(ctx.bexpr());
        }

        return andOrExprNode;
    }

    @Override
    public Node visitBoolexpr(antlrParser.BoolexprContext ctx) {
        Node boolExpr;
        int linenumber = ctx.start.getLine();

        switch (ctx.op.getType()){
            case antlrParser.OP_GREATER:
                boolExpr = new GreaterNode(linenumber);
                boolExpr.AdoptChildren(visit(ctx.expr()));
                boolExpr.AdoptChildren(visit(ctx.bexpr()));
                break;
            case antlrParser.OP_LESS:
                boolExpr = new LessNode(linenumber);
                boolExpr.AdoptChildren(visit(ctx.expr()));
                boolExpr.AdoptChildren(visit(ctx.bexpr()));
                break;
            case antlrParser.OP_EQUAL:
                boolExpr = new EqualNode(linenumber);
                boolExpr.AdoptChildren(visit(ctx.expr()));
                boolExpr.AdoptChildren(visit(ctx.bexpr()));
                break;
            case antlrParser.OP_GREATEREQUAL:
                boolExpr = new GreaterEqualNode(linenumber);
                boolExpr.AdoptChildren(visit(ctx.expr()));
                boolExpr.AdoptChildren(visit(ctx.bexpr()));
                break;
            case antlrParser.OP_LESSEQUAL:
                boolExpr = new LessEqualNode(linenumber);
                boolExpr.AdoptChildren(visit(ctx.expr()));
                boolExpr.AdoptChildren(visit(ctx.bexpr()));
                break;
            default:
                boolExpr = new NullNode(linenumber);
        }



        return boolExpr;
    }

    @Override
    public Node visitNotexpr(antlrParser.NotexprContext ctx) {
        Node notExprNode = new NotExprNode(ctx.start.getLine());

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
        int linenumber = ctx.start.getLine();
        switch (ctx.op.getType()){
            case antlrParser.OP_ADD:
                infixNode = new AddExprNode(linenumber);
                break;

            case antlrParser.OP_SUB:
                infixNode = new SubExprNode(linenumber);
                break;
            default:
                //throw an exeption or some shit.
                infixNode = new NullNode(linenumber); //this is not something that should be used.
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
    public Node visitUnaryExpr(antlrParser.UnaryExprContext ctx) {
        Node unaryNode;
        int linenumber = ctx.start.getLine();
        switch (ctx.op.getType()){
            case antlrParser.OP_UADD:
                unaryNode = new UAddNode(linenumber);
                break;
            case antlrParser.OP_USUB:
                unaryNode = new UsubNode(linenumber);
                break;
            default:
                unaryNode = new NullNode(linenumber); //This is not supposed to be there call exception instead
                //idk where to catch it tho, and in java u have to catch it.
        }

        return unaryNode.AdoptChildren(visit(ctx.ref()));
    }

    @Override
    public Node visitTerm(antlrParser.TermContext ctx) {
        int linenumber = ctx.start.getLine();
        if (ctx.term() != null) {
            Node infixNode;
            switch (ctx.op.getType()){
                case antlrParser.OP_MUL:
                    infixNode = new MulExprNode(linenumber);
                    break;

                case antlrParser.OP_DIV:
                    infixNode = new DivExprNode(linenumber);
                    break;
                default:
                    //throw an exeption or some shit.
                    infixNode = new NullNode(linenumber); //this is not something that should be used.
            }
            infixNode.AdoptChildren(visit(ctx.factor()));
            infixNode.AdoptChildren(visit(ctx.term()));

            return infixNode;
        }
        else
            return visit(ctx.factor());

    }

    @Override
    public Node visitParenFactor(antlrParser.ParenFactorContext ctx) {
        return new ParenNode(ctx.start.getLine()).AdoptChildren(visit(ctx.aoexpr()));
    }

    @Override
    public Node visitValueFactor(antlrParser.ValueFactorContext ctx) {
        int linenumber = ctx.start.getLine();
        switch (ctx.value.getType()){
            case antlrParser.INT_NUM:
                return new IntNode(linenumber, Integer.parseInt(ctx.INT_NUM().getText()));
            case antlrParser.BOOL_VALUE:
                return new BoolNode(linenumber, Boolean.parseBoolean(ctx.BOOL_VALUE().getText()));
            case antlrParser.TEXT:
                String x = ctx.TEXT().getText();
                return new StringNode(linenumber, x);
            case antlrParser.DECIMAL_NUM:
                return new DecimalNode(linenumber, Double.parseDouble(ctx.DECIMAL_NUM().getText()));
            default:
                return new NullNode(linenumber); //should not call this, exeptions instead

        }
    }

    @Override
    public Node visitActionFactor(antlrParser.ActionFactorContext ctx) {
        return visit(ctx.action());
    }

    @Override
    public Node visitRefFactor(antlrParser.RefFactorContext ctx) {
        return visit(ctx.ref());
    }


}
