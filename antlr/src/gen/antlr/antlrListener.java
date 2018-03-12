// Generated from C:/Users/mark/Documents/antlr/src\antlr.g4 by ANTLR 4.7
package gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link antlrParser}.
 */
public interface antlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link antlrParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(antlrParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(antlrParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(antlrParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(antlrParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#gameloop}.
	 * @param ctx the parse tree
	 */
	void enterGameloop(antlrParser.GameloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#gameloop}.
	 * @param ctx the parse tree
	 */
	void exitGameloop(antlrParser.GameloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(antlrParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(antlrParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#predcl}.
	 * @param ctx the parse tree
	 */
	void enterPredcl(antlrParser.PredclContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#predcl}.
	 * @param ctx the parse tree
	 */
	void exitPredcl(antlrParser.PredclContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(antlrParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(antlrParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(antlrParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(antlrParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(antlrParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(antlrParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterStrategy(antlrParser.StrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitStrategy(antlrParser.StrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#behavior}.
	 * @param ctx the parse tree
	 */
	void enterBehavior(antlrParser.BehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#behavior}.
	 * @param ctx the parse tree
	 */
	void exitBehavior(antlrParser.BehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(antlrParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(antlrParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(antlrParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(antlrParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(antlrParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(antlrParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(antlrParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(antlrParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(antlrParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(antlrParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(antlrParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(antlrParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(antlrParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(antlrParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(antlrParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(antlrParser.FactorContext ctx);
}