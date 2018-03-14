// Generated from C:/Users/mark/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface antlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlrParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(antlrParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(antlrParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#gameloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameloop(antlrParser.GameloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(antlrParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#predcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredcl(antlrParser.PredclContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(antlrParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclStmt(antlrParser.DclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(antlrParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStmt(antlrParser.ActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(antlrParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(antlrParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(antlrParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(antlrParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(antlrParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategy(antlrParser.StrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehavior(antlrParser.BehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(antlrParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(antlrParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#argmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgmnt(antlrParser.ArgmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(antlrParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(antlrParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(antlrParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(antlrParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#b2expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB2expr(antlrParser.B2exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(antlrParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(antlrParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(antlrParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionExpr(antlrParser.ActionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(antlrParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(antlrParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(antlrParser.FactorContext ctx);
}