// Generated from C:/Users/mark/Documents/antlr/src\antlr.g4 by ANTLR 4.7
package gen.antlr;
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
	 * Visit a parse tree produced by {@link antlrParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(antlrParser.StmtContext ctx);
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
	 * Visit a parse tree produced by {@link antlrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(antlrParser.ExprContext ctx);
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