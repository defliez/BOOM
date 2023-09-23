// Generated from /Users/valentino/Desktop/Systemprogramvara/Inlämningsuppgift2/Boom/src/boom/grammar/Boom.g4 by ANTLR 4.13.1
package boom.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoomParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(BoomParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(BoomParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BoomParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(BoomParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BoomParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BoomParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BoomParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(BoomParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoomParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(BoomParser.AddExprContext ctx);
}