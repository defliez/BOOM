import boom.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Stack;

public class CompileBoom extends BoomBaseListener {

    private StringBuilder out = new StringBuilder();
    private Stack<String> enterLabelStack = new Stack<>();
    private Stack<String> exitLabelStack = new Stack<>();

    private int enterLabelCounter = 0;
    private int exitLabelCounter = 0;

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
        this.out.append("not\n");
        System.out.println("lt");
        System.out.println("not");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreater(BoomParser.GreaterContext ctx) {
        this.out.append("gt\n");
        this.out.append("not\n");
        System.out.println("gt");
        System.out.println("not");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(BoomParser.WhileContext ctx) {
        enterLabelCounter++;
        exitLabelCounter++;

        String enterLabel = "label enterLoop" + enterLabelCounter;
        String exitLabel = "label exitLoop" + exitLabelCounter;

        enterLabelStack.push(enterLabel);
        exitLabelStack.push(exitLabel);

        this.out.append(enterLabel + "\n");
        System.out.println(enterLabel);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(BoomParser.WhileContext ctx) {
        String enterLabel = enterLabelStack.pop();
        String exitLabel = exitLabelStack.pop();

        this.out.append("if-goto " + exitLabel + "\n");
        System.out.println("if-goto " + exitLabel);

        this.out.append("goto " + enterLabel + "\n");
        System.out.println("goto " + enterLabel);

        this.out.append(exitLabel + "\n");
        System.out.println(exitLabel);
    }

}
