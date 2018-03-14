// Generated from C:/Users/mark/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, NEWLINE=40, ID=41, BOOL_VALUE=42, INT_NUM=43, DECIMAL_NUM=44, 
		CHAR_VALUE=45, WS=46, COMMENTS=47;
	public static final int
		RULE_prog = 0, RULE_setup = 1, RULE_gameloop = 2, RULE_method = 3, RULE_predcl = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_action = 7, RULE_strategy = 8, RULE_behavior = 9, 
		RULE_fcall = 10, RULE_dcl = 11, RULE_argmnt = 12, RULE_type = 13, RULE_ref = 14, 
		RULE_assign = 15, RULE_bexpr = 16, RULE_b2expr = 17, RULE_expr = 18, RULE_term = 19, 
		RULE_factor = 20;
	public static final String[] ruleNames = {
		"prog", "setup", "gameloop", "method", "predcl", "block", "stmt", "action", 
		"strategy", "behavior", "fcall", "dcl", "argmnt", "type", "ref", "assign", 
		"bexpr", "b2expr", "expr", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'setup'", "'game-loop'", "'function'", "'('", "','", "')'", "'event'", 
		"'->'", "'end'", "'if'", "'else'", "'do'", "'while'", "'return'", "'.'", 
		"'strategy'", "'behavior'", "'bool'", "'int'", "'text'", "'char'", "'decimal'", 
		"'['", "']'", "'='", "'&&'", "'||'", "'=='", "'>='", "'<='", "'<'", "'>'", 
		"'!'", "'+'", "'-'", "'++'", "'--'", "'*'", "'/'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NEWLINE", "ID", "BOOL_VALUE", "INT_NUM", "DECIMAL_NUM", 
		"CHAR_VALUE", "WS", "COMMENTS"
	};
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
	public String getGrammarFileName() { return "antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public antlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public GameloopContext gameloop() {
			return getRuleContext(GameloopContext.class,0);
		}
		public List<PredclContext> predcl() {
			return getRuleContexts(PredclContext.class);
		}
		public PredclContext predcl(int i) {
			return getRuleContext(PredclContext.class,i);
		}
		public List<StrategyContext> strategy() {
			return getRuleContexts(StrategyContext.class);
		}
		public StrategyContext strategy(int i) {
			return getRuleContext(StrategyContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(42);
				predcl();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			setup();
			setState(49);
			gameloop();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__15) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(50);
					strategy();
					}
					break;
				case T__2:
					{
					setState(51);
					method();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SetupContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			block();
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

	public static class GameloopContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GameloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterGameloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitGameloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitGameloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameloopContext gameloop() throws RecognitionException {
		GameloopContext _localctx = new GameloopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gameloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			block();
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ArgmntContext> argmnt() {
			return getRuleContexts(ArgmntContext.class);
		}
		public ArgmntContext argmnt(int i) {
			return getRuleContext(ArgmntContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__2);
			setState(64);
			match(ID);
			setState(65);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(66);
				argmnt();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(67);
					match(T__4);
					setState(68);
					argmnt();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(T__5);
			setState(77);
			block();
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

	public static class PredclContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public PredclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterPredcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitPredcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitPredcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredclContext predcl() throws RecognitionException {
		PredclContext _localctx = new PredclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_predcl);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				dcl();
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(NEWLINE);
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__6);
				setState(86);
				match(T__3);
				setState(87);
				bexpr();
				setState(88);
				match(T__5);
				setState(89);
				match(T__7);
				setState(90);
				match(ID);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					match(NEWLINE);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				match(NEWLINE);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(103);
				stmt();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__8);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(NEWLINE);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoStmtContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterDoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitDoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitDoStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclStmtContext extends StmtContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public DclStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterDclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitDclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitDclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionStmtContext extends StmtContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public ActionStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterActionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitActionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitActionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				dcl();
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					match(NEWLINE);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				assign();
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					match(NEWLINE);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 3:
				_localctx = new ActionStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				action();
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(NEWLINE);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__9);
				setState(134);
				match(T__3);
				setState(135);
				bexpr();
				setState(136);
				match(T__5);
				setState(137);
				block();
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						match(T__10);
						setState(139);
						match(T__9);
						setState(140);
						match(T__3);
						setState(141);
						bexpr();
						setState(142);
						match(T__5);
						setState(143);
						block();
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(150);
					match(T__10);
					setState(151);
					block();
					}
				}

				}
				break;
			case 5:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(T__11);
				setState(155);
				match(T__3);
				setState(156);
				assign();
				setState(157);
				match(T__4);
				setState(158);
				bexpr();
				setState(159);
				match(T__4);
				setState(160);
				bexpr();
				setState(161);
				match(T__4);
				setState(162);
				bexpr();
				setState(163);
				match(T__5);
				setState(164);
				block();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(T__12);
				setState(167);
				match(T__3);
				setState(168);
				bexpr();
				setState(169);
				match(T__5);
				setState(170);
				block();
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(T__13);
				setState(173);
				expr();
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

	public static class ActionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(antlrParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(antlrParser.ID, i);
		}
		public FcallContext fcall() {
			return getRuleContext(FcallContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ID);
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						match(T__14);
						setState(178);
						match(ID);
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(184);
				match(T__14);
				setState(185);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				fcall();
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

	public static class StrategyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public List<BehaviorContext> behavior() {
			return getRuleContexts(BehaviorContext.class);
		}
		public BehaviorContext behavior(int i) {
			return getRuleContext(BehaviorContext.class,i);
		}
		public StrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyContext strategy() throws RecognitionException {
		StrategyContext _localctx = new StrategyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_strategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__15);
			setState(190);
			match(ID);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				match(NEWLINE);
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				behavior();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
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

	public static class BehaviorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitBehavior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitBehavior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorContext behavior() throws RecognitionException {
		BehaviorContext _localctx = new BehaviorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_behavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__16);
			setState(202);
			match(ID);
			setState(203);
			block();
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

	public static class FcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitFcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitFcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcallContext fcall() throws RecognitionException {
		FcallContext _localctx = new FcallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(T__3);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << ID) | (1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << CHAR_VALUE))) != 0)) {
				{
				setState(207);
				expr();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(208);
					match(T__4);
					setState(209);
					expr();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(217);
			match(T__5);
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

	public static class DclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dcl);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				type();
				setState(220);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				type();
				setState(223);
				ref();
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

	public static class ArgmntContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ArgmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterArgmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitArgmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitArgmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgmntContext argmnt() throws RecognitionException {
		ArgmntContext _localctx = new ArgmntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			type();
			setState(228);
			ref();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ref);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__22);
				setState(235);
				expr();
				setState(236);
				match(T__23);
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

	public static class AssignContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			ref();
			setState(241);
			match(T__24);
			setState(242);
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

	public static class BexprContext extends ParserRuleContext {
		public B2exprContext b2expr() {
			return getRuleContext(B2exprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitBexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bexpr);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				b2expr();
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				bexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				b2expr();
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

	public static class B2exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public B2exprContext b2expr() {
			return getRuleContext(B2exprContext.class,0);
		}
		public B2exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b2expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterB2expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitB2expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitB2expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B2exprContext b2expr() throws RecognitionException {
		B2exprContext _localctx = new B2exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_b2expr);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				expr();
				setState(252);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				b2expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__32);
				setState(256);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionExprContext extends ExprContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterActionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitActionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitActionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixExprContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InfixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermExprContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new InfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				term();
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				expr();
				}
				break;
			case 2:
				_localctx = new TermExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				term();
				}
				break;
			case 3:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__22);
				setState(267);
				expr();
				setState(268);
				match(T__23);
				}
				break;
			case 4:
				_localctx = new ActionExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				action();
				}
				break;
			case 5:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				factor();
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				factor();
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public TerminalNode INT_NUM() { return getToken(antlrParser.INT_NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(antlrParser.BOOL_VALUE, 0); }
		public TerminalNode DECIMAL_NUM() { return getToken(antlrParser.DECIMAL_NUM, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(antlrParser.CHAR_VALUE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__3);
				setState(284);
				bexpr();
				setState(285);
				match(T__5);
				}
				break;
			case ID:
			case BOOL_VALUE:
			case INT_NUM:
			case DECIMAL_NUM:
			case CHAR_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << CHAR_VALUE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\5\5M\n\5\3\5\3\5\3\5\3\6"+
		"\3\6\6\6T\n\6\r\6\16\6U\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6_\n\6\r\6\16\6"+
		"`\5\6c\n\6\3\7\6\7f\n\7\r\7\16\7g\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7"+
		"\6\7r\n\7\r\7\16\7s\3\b\3\b\6\bx\n\b\r\b\16\by\3\b\3\b\6\b~\n\b\r\b\16"+
		"\b\177\3\b\3\b\6\b\u0084\n\b\r\b\16\b\u0085\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\3\b\5\b\u009b"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\t\3\t\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9"+
		"\13\t\3\t\3\t\3\t\5\t\u00be\n\t\3\n\3\n\3\n\6\n\u00c3\n\n\r\n\16\n\u00c4"+
		"\3\n\6\n\u00c8\n\n\r\n\16\n\u00c9\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\5\f\u00da\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00e4\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00fc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0105\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0115\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u011c\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0123\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\t\3\2\24\30\3\2\34\35\3\2\36\"\3\2$%\3\2&\'\3\2"+
		"()\3\2+/\2\u0136\2/\3\2\2\2\4;\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nb\3\2\2"+
		"\2\fe\3\2\2\2\16\u00b0\3\2\2\2\20\u00bd\3\2\2\2\22\u00bf\3\2\2\2\24\u00cb"+
		"\3\2\2\2\26\u00cf\3\2\2\2\30\u00e3\3\2\2\2\32\u00e5\3\2\2\2\34\u00e8\3"+
		"\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2\"\u00fb\3\2\2\2$\u0104\3\2\2\2"+
		"&\u0114\3\2\2\2(\u011b\3\2\2\2*\u0122\3\2\2\2,.\5\n\6\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\5\4\3\2"+
		"\638\5\6\4\2\64\67\5\22\n\2\65\67\5\b\5\2\66\64\3\2\2\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;<\7\3\2\2<=\5"+
		"\f\7\2=\5\3\2\2\2>?\7\4\2\2?@\5\f\7\2@\7\3\2\2\2AB\7\5\2\2BC\7+\2\2CL"+
		"\7\6\2\2DI\5\32\16\2EF\7\7\2\2FH\5\32\16\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LD\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\b\2"+
		"\2OP\5\f\7\2P\t\3\2\2\2QS\5\30\r\2RT\7*\2\2SR\3\2\2\2TU\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2Vc\3\2\2\2WX\7\t\2\2XY\7\6\2\2YZ\5\"\22\2Z[\7\b\2\2[\\\7"+
		"\n\2\2\\^\7+\2\2]_\7*\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2bQ\3\2\2\2bW\3\2\2\2c\13\3\2\2\2df\7*\2\2ed\3\2\2\2fg\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hl\3\2\2\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oq\7\13\2\2pr\7*\2\2qp\3\2\2\2rs\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2uw\5\30\r\2vx\7*\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z\u00b1\3\2\2\2{}\5 \21\2|~\7*\2\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u00b1\3\2\2\2\u0081\u0083"+
		"\5\20\t\2\u0082\u0084\7*\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u00b1\3\2\2\2\u0087\u0088\7\f"+
		"\2\2\u0088\u0089\7\6\2\2\u0089\u008a\5\"\22\2\u008a\u008b\7\b\2\2\u008b"+
		"\u0095\5\f\7\2\u008c\u008d\7\r\2\2\u008d\u008e\7\f\2\2\u008e\u008f\7\6"+
		"\2\2\u008f\u0090\5\"\22\2\u0090\u0091\7\b\2\2\u0091\u0092\5\f\7\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008c\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\r\2\2\u0099\u009b\5\f\7\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u00b1\3\2\2\2\u009c\u009d\7\16\2\2\u009d\u009e\7\6\2\2\u009e"+
		"\u009f\5 \21\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\7"+
		"\7\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5\"\22\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00b1\3\2\2\2\u00a8\u00a9\7\17"+
		"\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\b\2\2\u00ac"+
		"\u00ad\5\f\7\2\u00ad\u00b1\3\2\2\2\u00ae\u00af\7\20\2\2\u00af\u00b1\5"+
		"&\24\2\u00b0u\3\2\2\2\u00b0{\3\2\2\2\u00b0\u0081\3\2\2\2\u00b0\u0087\3"+
		"\2\2\2\u00b0\u009c\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\17\3\2\2\2\u00b2\u00b7\7+\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b6\7+\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\21\2\2"+
		"\u00bb\u00be\5\26\f\2\u00bc\u00be\5\26\f\2\u00bd\u00b2\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c2\7+\2\2\u00c1"+
		"\u00c3\7*\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5\24\13\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\23\2\2\u00cc\u00cd\7+\2\2\u00cd\u00ce"+
		"\5\f\7\2\u00ce\25\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0\u00d9\7\6\2\2\u00d1"+
		"\u00d6\5&\24\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\5&\24\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\27\3\2\2\2\u00dd\u00de"+
		"\5\34\17\2\u00de\u00df\5 \21\2\u00df\u00e4\3\2\2\2\u00e0\u00e1\5\34\17"+
		"\2\u00e1\u00e2\5\36\20\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e4\31\3\2\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00e7\5\36"+
		"\20\2\u00e7\33\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9\35\3\2\2\2\u00ea\u00f1"+
		"\7+\2\2\u00eb\u00ec\7+\2\2\u00ec\u00ed\7\31\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\u00ef\7\32\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3"+
		"\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7\33\2\2\u00f4"+
		"\u00f5\5&\24\2\u00f5!\3\2\2\2\u00f6\u00f7\5$\23\2\u00f7\u00f8\t\3\2\2"+
		"\u00f8\u00f9\5\"\22\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\5$\23\2\u00fb\u00f6"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc#\3\2\2\2\u00fd\u00fe\5&\24\2\u00fe"+
		"\u00ff\t\4\2\2\u00ff\u0100\5$\23\2\u0100\u0105\3\2\2\2\u0101\u0102\7#"+
		"\2\2\u0102\u0105\5&\24\2\u0103\u0105\5&\24\2\u0104\u00fd\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0104\u0103\3\2\2\2\u0105%\3\2\2\2\u0106\u0107\5(\25\2"+
		"\u0107\u0108\t\5\2\2\u0108\u0109\5&\24\2\u0109\u0115\3\2\2\2\u010a\u0115"+
		"\5(\25\2\u010b\u010c\7+\2\2\u010c\u010d\7\31\2\2\u010d\u010e\5&\24\2\u010e"+
		"\u010f\7\32\2\2\u010f\u0115\3\2\2\2\u0110\u0115\5\20\t\2\u0111\u0112\5"+
		"*\26\2\u0112\u0113\t\6\2\2\u0113\u0115\3\2\2\2\u0114\u0106\3\2\2\2\u0114"+
		"\u010a\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2"+
		"\2\2\u0115\'\3\2\2\2\u0116\u0117\5*\26\2\u0117\u0118\t\7\2\2\u0118\u0119"+
		"\5(\25\2\u0119\u011c\3\2\2\2\u011a\u011c\5*\26\2\u011b\u0116\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c)\3\2\2\2\u011d\u011e\7\6\2\2\u011e\u011f\5\"\22\2"+
		"\u011f\u0120\7\b\2\2\u0120\u0123\3\2\2\2\u0121\u0123\t\b\2\2\u0122\u011d"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123+\3\2\2\2 /\668ILU`bglsy\177\u0085\u0095"+
		"\u009a\u00b0\u00b7\u00bd\u00c4\u00c9\u00d6\u00d9\u00e3\u00f0\u00fb\u0104"+
		"\u0114\u011b\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}