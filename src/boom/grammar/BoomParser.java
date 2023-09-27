// Generated from /Users/valentino/Desktop/Systemprogramvara/Inlämningsuppgift2/Boom/src/boom/grammar/Boom.g4 by ANTLR 4.13.1
package boom.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BoomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, WS=15;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_statement = 2, RULE_decl = 3, RULE_assign = 4, 
		RULE_print = 5, RULE_expr = 6, RULE_unaryExpr = 7, RULE_addExpr = 8, RULE_lesser = 9, 
		RULE_greater = 10, RULE_cond = 11, RULE_while = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "code", "statement", "decl", "assign", "print", "expr", "unaryExpr", 
			"addExpr", "lesser", "greater", "cond", "while"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'POW'", "'ZAP'", "'KABOOM'", "'BAM'", "'GULP'", "'HMPH'", 
			"'ZOINKS'", "'('", "')'", "'?'", "'?!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Boom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BoomParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__7:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				code();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				statement();
				setState(31);
				match(T__0);
				setState(32);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				statement();
				setState(35);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				while_();
				setState(38);
				code();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				while_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				assign();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoomParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoomParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(T__2);
			setState(53);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoomParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__3);
			setState(56);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				addExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoomParser.ID, 0); }
		public TerminalNode INT() { return getToken(BoomParser.INT, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			unaryExpr();
			setState(65);
			match(T__4);
			setState(66);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LesserContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitLesser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitLesser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			unaryExpr();
			setState(69);
			match(T__5);
			setState(70);
			unaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			unaryExpr();
			setState(73);
			match(T__6);
			setState(74);
			unaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cond);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				lesser();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				greater();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomListener ) ((BoomListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoomVisitor ) return ((BoomVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__7);
			setState(81);
			match(T__8);
			setState(82);
			cond();
			setState(83);
			match(T__9);
			setState(84);
			match(T__10);
			setState(85);
			code();
			setState(86);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fY\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"=\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000bO\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\r\u000e"+
		"S\u0000\u001c\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004"+
		".\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b3\u0001\u0000"+
		"\u0000\u0000\n7\u0001\u0000\u0000\u0000\f<\u0001\u0000\u0000\u0000\u000e"+
		">\u0001\u0000\u0000\u0000\u0010@\u0001\u0000\u0000\u0000\u0012D\u0001"+
		"\u0000\u0000\u0000\u0014H\u0001\u0000\u0000\u0000\u0016N\u0001\u0000\u0000"+
		"\u0000\u0018P\u0001\u0000\u0000\u0000\u001a\u001d\u0003\u0002\u0001\u0000"+
		"\u001b\u001d\u0005\u0000\u0000\u0001\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0001\u0000\u0000 !"+
		"\u0003\u0002\u0001\u0000!*\u0001\u0000\u0000\u0000\"#\u0003\u0004\u0002"+
		"\u0000#$\u0005\u0001\u0000\u0000$*\u0001\u0000\u0000\u0000%&\u0003\u0018"+
		"\f\u0000&\'\u0003\u0002\u0001\u0000\'*\u0001\u0000\u0000\u0000(*\u0003"+
		"\u0018\f\u0000)\u001e\u0001\u0000\u0000\u0000)\"\u0001\u0000\u0000\u0000"+
		")%\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+/\u0003\u0006\u0003\u0000,/\u0003\b\u0004\u0000-/\u0003\n"+
		"\u0005\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0002\u0000"+
		"\u000012\u0005\r\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005\r"+
		"\u0000\u000045\u0005\u0003\u0000\u000056\u0003\f\u0006\u00006\t\u0001"+
		"\u0000\u0000\u000078\u0005\u0004\u0000\u000089\u0005\r\u0000\u00009\u000b"+
		"\u0001\u0000\u0000\u0000:=\u0003\u000e\u0007\u0000;=\u0003\u0010\b\u0000"+
		"<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000"+
		"\u0000>?\u0007\u0000\u0000\u0000?\u000f\u0001\u0000\u0000\u0000@A\u0003"+
		"\u000e\u0007\u0000AB\u0005\u0005\u0000\u0000BC\u0003\f\u0006\u0000C\u0011"+
		"\u0001\u0000\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\u0006\u0000"+
		"\u0000FG\u0003\u000e\u0007\u0000G\u0013\u0001\u0000\u0000\u0000HI\u0003"+
		"\u000e\u0007\u0000IJ\u0005\u0007\u0000\u0000JK\u0003\u000e\u0007\u0000"+
		"K\u0015\u0001\u0000\u0000\u0000LO\u0003\u0012\t\u0000MO\u0003\u0014\n"+
		"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0017\u0001"+
		"\u0000\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0005\t\u0000\u0000RS\u0003"+
		"\u0016\u000b\u0000ST\u0005\n\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0003"+
		"\u0002\u0001\u0000VW\u0005\f\u0000\u0000W\u0019\u0001\u0000\u0000\u0000"+
		"\u0005\u001c).<N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}