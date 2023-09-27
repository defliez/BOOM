// Generated from /Users/valentino/Desktop/Systemprogramvara/Inlämningsuppgift2/Boom/src/boom/grammar/Boom.g4 by ANTLR 4.13.1
package boom.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoomParser}.
 */
public interface BoomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoomParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BoomParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BoomParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(BoomParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(BoomParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BoomParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BoomParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(BoomParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(BoomParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BoomParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BoomParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BoomParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BoomParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BoomParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BoomParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(BoomParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(BoomParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(BoomParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(BoomParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(BoomParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(BoomParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(BoomParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(BoomParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(BoomParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(BoomParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(BoomParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(BoomParser.WhileContext ctx);
}