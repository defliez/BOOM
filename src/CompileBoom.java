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
    @Override public void exitCond(BoomParser.CondContext ctx) {
        if (ctx.parent instanceof BoomParser.LesserContext) {
            this.out.append("lt\n");
            System.out.println("lt");
        } else if (ctx.parent instanceof BoomParser.GreaterContext) {
            this.out.append("gt\n");
            System.out.println("gt");
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLesser(BoomParser.LesserContext ctx) {
        this.out.append("lt\n");
        System.out.println("lt");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreater(BoomParser.GreaterContext ctx) {
        this.out.append("gt\n");
        System.out.println("gt");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(BoomParser.WhileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(BoomParser.WhileContext ctx) { }

}
