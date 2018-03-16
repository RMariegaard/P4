// Generated from C:/Users/mark/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
package antlr;
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
	 * Enter a parse tree produced by {@link antlrParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterSm(antlrParser.SmContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitSm(antlrParser.SmContext ctx);
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
	 * Enter a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDclStmt(antlrParser.DclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDclStmt(antlrParser.DclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(antlrParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(antlrParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterActionStmt(antlrParser.ActionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitActionStmt(antlrParser.ActionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(antlrParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(antlrParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDoStmt(antlrParser.DoStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDoStmt(antlrParser.DoStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(antlrParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(antlrParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(antlrParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(antlrParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(antlrParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(antlrParser.ElseifContext ctx);
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
	 * Enter a parse tree produced by {@link antlrParser#argmnt}.
	 * @param ctx the parse tree
	 */
	void enterArgmnt(antlrParser.ArgmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#argmnt}.
	 * @param ctx the parse tree
	 */
	void exitArgmnt(antlrParser.ArgmntContext ctx);
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
	 * Enter a parse tree produced by {@link antlrParser#aoexpr}.
	 * @param ctx the parse tree
	 */
	void enterAoexpr(antlrParser.AoexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#aoexpr}.
	 * @param ctx the parse tree
	 */
	void exitAoexpr(antlrParser.AoexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(antlrParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(antlrParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(antlrParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(antlrParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyboolexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyboolexpr(antlrParser.EmptyboolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyboolexpr}
	 * labeled alternative in {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyboolexpr(antlrParser.EmptyboolexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(antlrParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(antlrParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(antlrParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(antlrParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(antlrParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(antlrParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterActionExpr(antlrParser.ActionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitActionExpr(antlrParser.ActionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(antlrParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(antlrParser.UnaryExprContext ctx);
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