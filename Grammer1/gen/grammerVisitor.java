// Generated from C:/Users/mark/Documents/Grammer1\grammer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(grammerParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#gameloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameloop(grammerParser.GameloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(grammerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#predcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredcl(grammerParser.PredclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(grammerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(grammerParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategy(grammerParser.StrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehavior(grammerParser.BehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(grammerParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(grammerParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(grammerParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(grammerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(grammerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grammerParser.FactorContext ctx);
}