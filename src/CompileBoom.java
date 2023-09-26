import boom.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class CompileBoom extends BoomBaseListener {

    private StringBuilder out = new StringBuilder();

    public String getCompiledCode() {
        return this.out.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssign(BoomParser.AssignContext ctx) {
        String row = "pop " + ctx.ID().getText();
        this.out.append(row + "\n");
        System.out.println("pop " + ctx.ID().getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrint(BoomParser.PrintContext ctx) {
        this.out.append("print " + ctx.ID().getText() + "\n");
        System.out.println("print " + ctx.ID().getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryExpr(BoomParser.UnaryExprContext ctx) {
        String value = ctx.ID() == null ? ctx.INT().getText() : ctx.ID().getText();

        this.out.append("push " + value + "\n");
        System.out.println("push " + value);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddExpr(BoomParser.AddExprContext ctx) {
        this.out.append("add\n");
        System.out.println("add");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGreaterExpr(BoomParser.GreaterExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreaterExpr(BoomParser.GreaterExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLesserExpr(BoomParser.LesserExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLesserExpr(BoomParser.LesserExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(BoomParser.WhileContext ctx) {
        this.out.append("label enterLoop\n");
        System.out.println("label enterLoop");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(BoomParser.WhileContext ctx) { }

}
