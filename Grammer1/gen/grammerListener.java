// Generated from C:/Users/mark/Documents/Grammer1\grammer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammerParser}.
 */
public interface grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(grammerParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(grammerParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#gameloop}.
	 * @param ctx the parse tree
	 */
	void enterGameloop(grammerParser.GameloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#gameloop}.
	 * @param ctx the parse tree
	 */
	void exitGameloop(grammerParser.GameloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(grammerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(grammerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#predcl}.
	 * @param ctx the parse tree
	 */
	void enterPredcl(grammerParser.PredclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#predcl}.
	 * @param ctx the parse tree
	 */
	void exitPredcl(grammerParser.PredclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(grammerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(grammerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(grammerParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(grammerParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterStrategy(grammerParser.StrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitStrategy(grammerParser.StrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#behavior}.
	 * @param ctx the parse tree
	 */
	void enterBehavior(grammerParser.BehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#behavior}.
	 * @param ctx the parse tree
	 */
	void exitBehavior(grammerParser.BehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(grammerParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(grammerParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(grammerParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(grammerParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(grammerParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(grammerParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(grammerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(grammerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grammerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grammerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grammerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grammerParser.FactorContext ctx);
}