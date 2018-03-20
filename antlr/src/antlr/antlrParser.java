// Generated from C:/Users/Casper/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
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
		T__31=32, T__32=33, T__33=34, OP_ADD=35, OP_SUB=36, OP_UADD=37, OP_USUB=38, 
		OP_MUL=39, OP_DIV=40, NEWLINE=41, ID=42, BOOL_VALUE=43, INT_NUM=44, DECIMAL_NUM=45, 
		CHAR_VALUE=46, WS=47, COMMENTS=48;
	public static final int
		RULE_prog = 0, RULE_sm = 1, RULE_setup = 2, RULE_gameloop = 3, RULE_method = 4, 
		RULE_predcl = 5, RULE_block = 6, RULE_stmt = 7, RULE_elseif = 8, RULE_action = 9, 
		RULE_strategy = 10, RULE_behavior = 11, RULE_fcall = 12, RULE_dcl = 13, 
		RULE_argmnt = 14, RULE_type = 15, RULE_rtype = 16, RULE_ref = 17, RULE_assign = 18, 
		RULE_aoexpr = 19, RULE_bexpr = 20, RULE_expr = 21, RULE_term = 22, RULE_factor = 23;
	public static final String[] ruleNames = {
		"prog", "sm", "setup", "gameloop", "method", "predcl", "block", "stmt", 
		"elseif", "action", "strategy", "behavior", "fcall", "dcl", "argmnt", 
		"type", "rtype", "ref", "assign", "aoexpr", "bexpr", "expr", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'setup'", "'game-loop'", "'function'", "'('", "','", "')'", "'event'", 
		"'->'", "'end'", "'if'", "'else'", "'do'", "'while'", "'return'", "'.'", 
		"'strategy'", "'behavior'", "'bool'", "'int'", "'text'", "'char'", "'decimal'", 
		"'void'", "'['", "']'", "'='", "'&&'", "'||'", "'=='", "'>='", "'<='", 
		"'<'", "'>'", "'!'", "'+'", "'-'", "'++'", "'--'", "'*'", "'/'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "OP_ADD", 
		"OP_SUB", "OP_UADD", "OP_USUB", "OP_MUL", "OP_DIV", "NEWLINE", "ID", "BOOL_VALUE", 
		"INT_NUM", "DECIMAL_NUM", "CHAR_VALUE", "WS", "COMMENTS"
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
		public TerminalNode EOF() { return getToken(antlrParser.EOF, 0); }
		public List<PredclContext> predcl() {
			return getRuleContexts(PredclContext.class);
		}
		public PredclContext predcl(int i) {
			return getRuleContext(PredclContext.class,i);
		}
		public List<SmContext> sm() {
			return getRuleContexts(SmContext.class);
		}
		public SmContext sm(int i) {
			return getRuleContext(SmContext.class,i);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(48);
				predcl();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			setup();
			setState(55);
			gameloop();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__15) {
				{
				{
				setState(56);
				sm();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(EOF);
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

	public static class SmContext extends ParserRuleContext {
		public StrategyContext strategy() {
			return getRuleContext(StrategyContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public SmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterSm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitSm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitSm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmContext sm() throws RecognitionException {
		SmContext _localctx = new SmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sm);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				strategy();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				method();
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
		enterRule(_localctx, 4, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
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
		enterRule(_localctx, 6, RULE_gameloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__1);
			setState(72);
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
		public RtypeContext rtype() {
			return getRuleContext(RtypeContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			rtype();
			setState(76);
			match(ID);
			setState(77);
			match(T__3);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(78);
				argmnt();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(79);
					match(T__4);
					setState(80);
					argmnt();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(88);
			match(T__5);
			setState(89);
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
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
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
		enterRule(_localctx, 10, RULE_predcl);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				dcl();
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					match(NEWLINE);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(T__3);
				setState(99);
				aoexpr();
				setState(100);
				match(T__5);
				setState(101);
				match(T__7);
				setState(102);
				match(ID);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(NEWLINE);
					}
					}
					setState(106); 
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				stmt();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__8);
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
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
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
		public AoexprContext first;
		public BlockContext firstBlock;
		public BlockContext secondBlock;
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
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
		public AoexprContext firstAo;
		public AoexprContext secondAo;
		public AoexprContext thirdAo;
		public ArgmntContext argmnt() {
			return getRuleContext(ArgmntContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AoexprContext> aoexpr() {
			return getRuleContexts(AoexprContext.class);
		}
		public AoexprContext aoexpr(int i) {
			return getRuleContext(AoexprContext.class,i);
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
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
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
		enterRule(_localctx, 14, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				dcl();
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
			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				assign();
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(NEWLINE);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 3:
				_localctx = new ActionStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				action();
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					match(NEWLINE);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__9);
				setState(146);
				match(T__3);
				setState(147);
				((IfStmtContext)_localctx).first = aoexpr();
				setState(148);
				match(T__5);
				setState(149);
				((IfStmtContext)_localctx).firstBlock = block();
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						elseif();
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(156);
					match(T__10);
					setState(157);
					((IfStmtContext)_localctx).secondBlock = block();
					}
				}

				}
				break;
			case 5:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(T__11);
				setState(161);
				match(T__3);
				setState(162);
				argmnt();
				setState(163);
				match(T__4);
				setState(164);
				((DoStmtContext)_localctx).firstAo = aoexpr();
				setState(165);
				match(T__4);
				setState(166);
				((DoStmtContext)_localctx).secondAo = aoexpr();
				setState(167);
				match(T__4);
				setState(168);
				((DoStmtContext)_localctx).thirdAo = aoexpr();
				setState(169);
				match(T__5);
				setState(170);
				block();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(T__12);
				setState(173);
				match(T__3);
				setState(174);
				aoexpr();
				setState(175);
				match(T__5);
				setState(176);
				block();
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(T__13);
				setState(179);
				expr();
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					match(NEWLINE);
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
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

	public static class ElseifContext extends ParserRuleContext {
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__10);
			setState(188);
			match(T__9);
			setState(189);
			match(T__3);
			setState(190);
			aoexpr();
			setState(191);
			match(T__5);
			setState(192);
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
		enterRule(_localctx, 18, RULE_action);
		try {
			int _alt;
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						match(T__14);
						setState(196);
						match(ID);
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(202);
				match(T__14);
				setState(203);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
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
		enterRule(_localctx, 20, RULE_strategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__15);
			setState(208);
			match(ID);
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				match(NEWLINE);
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				behavior();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			setState(219);
			match(T__8);
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				match(NEWLINE);
				}
				}
				setState(223); 
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
		enterRule(_localctx, 22, RULE_behavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__16);
			setState(226);
			match(ID);
			setState(227);
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
		enterRule(_localctx, 24, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(T__3);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << ID) | (1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << CHAR_VALUE))) != 0)) {
				{
				setState(231);
				expr();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(232);
					match(T__4);
					setState(233);
					expr();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(241);
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
		enterRule(_localctx, 26, RULE_dcl);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				type();
				setState(244);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				type();
				setState(247);
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
		enterRule(_localctx, 28, RULE_argmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			type();
			setState(252);
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
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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

	public static class RtypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterRtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitRtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitRtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtypeContext rtype() throws RecognitionException {
		RtypeContext _localctx = new RtypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rtype);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__22);
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				type();
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
		enterRule(_localctx, 34, RULE_ref);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__23);
				setState(263);
				expr();
				setState(264);
				match(T__24);
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
		enterRule(_localctx, 36, RULE_assign);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				ref();
				setState(269);
				match(T__25);
				setState(270);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				ref();
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==OP_UADD || _la==OP_USUB) ) {
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

	public static class AoexprContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
		}
		public AoexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aoexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterAoexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitAoexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitAoexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AoexprContext aoexpr() throws RecognitionException {
		AoexprContext _localctx = new AoexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_aoexpr);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				bexpr();
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				aoexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				bexpr();
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

	public static class BexprContext extends ParserRuleContext {
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	 
		public BexprContext() { }
		public void copyFrom(BexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotexprContext extends BexprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotexprContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterNotexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitNotexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitNotexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyboolexprContext extends BexprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EmptyboolexprContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterEmptyboolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitEmptyboolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitEmptyboolexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolexprContext extends BexprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolexprContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bexpr);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				expr();
				setState(285);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				bexpr();
				}
				break;
			case 2:
				_localctx = new NotexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__33);
				setState(289);
				expr();
				}
				break;
			case 3:
				_localctx = new EmptyboolexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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
		public Token op;
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
		public Token op;
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
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new InfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				term();
				setState(294);
				((InfixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
					((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				expr();
				}
				break;
			case 2:
				_localctx = new TermExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				term();
				}
				break;
			case 3:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(ID);
				setState(299);
				match(T__23);
				setState(300);
				expr();
				setState(301);
				match(T__24);
				}
				break;
			case 4:
				_localctx = new ActionExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				action();
				}
				break;
			case 5:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				factor();
				setState(305);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_UADD || _la==OP_USUB) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		public Token op;
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
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				factor();
				setState(310);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
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
		public Token op;
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
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
		enterRule(_localctx, 46, RULE_factor);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__3);
				setState(317);
				aoexpr();
				setState(318);
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
				setState(320);
				((FactorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << CHAR_VALUE))) != 0)) ) {
					((FactorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0146\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6T\n\6\f\6\16\6W\13\6\5\6Y\n\6\3\6\3\6\3\6\3\7\3\7\6\7`\n\7\r"+
		"\7\16\7a\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\5\7o\n\7\3\b\6"+
		"\br\n\b\r\b\16\bs\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\6\b~\n\b\r\b\16"+
		"\b\177\3\t\3\t\6\t\u0084\n\t\r\t\16\t\u0085\3\t\3\t\6\t\u008a\n\t\r\t"+
		"\16\t\u008b\3\t\3\t\6\t\u0090\n\t\r\t\16\t\u0091\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\6\t\u00b8\n\t\r\t\16\t\u00b9\5\t\u00bc\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\13\3\13\3"+
		"\13\5\13\u00d0\n\13\3\f\3\f\3\f\6\f\u00d5\n\f\r\f\16\f\u00d6\3\f\6\f\u00da"+
		"\n\f\r\f\16\f\u00db\3\f\3\f\6\f\u00e0\n\f\r\f\16\f\u00e1\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\5\16"+
		"\u00f2\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fc\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0105\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u010d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0116"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u011d\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0126\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0136\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u013d\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0144\n\31\3\31\2\2\32\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3\2\24\30\3\2\'(\3\2"+
		"\35\36\3\2\37#\3\2%&\3\2)*\3\2,\60\2\u0158\2\65\3\2\2\2\4D\3\2\2\2\6F"+
		"\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fn\3\2\2\2\16q\3\2\2\2\20\u00bb\3\2\2\2"+
		"\22\u00bd\3\2\2\2\24\u00cf\3\2\2\2\26\u00d1\3\2\2\2\30\u00e3\3\2\2\2\32"+
		"\u00e7\3\2\2\2\34\u00fb\3\2\2\2\36\u00fd\3\2\2\2 \u0100\3\2\2\2\"\u0104"+
		"\3\2\2\2$\u010c\3\2\2\2&\u0115\3\2\2\2(\u011c\3\2\2\2*\u0125\3\2\2\2,"+
		"\u0135\3\2\2\2.\u013c\3\2\2\2\60\u0143\3\2\2\2\62\64\5\f\7\2\63\62\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2"+
		"\289\5\6\4\29=\5\b\5\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>@\3\2\2\2?=\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BE\5\26\f\2CE\5\n\6\2DB\3\2"+
		"\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\3\2\2GH\5\16\b\2H\7\3\2\2\2IJ\7\4\2\2JK"+
		"\5\16\b\2K\t\3\2\2\2LM\7\5\2\2MN\5\"\22\2NO\7,\2\2OX\7\6\2\2PU\5\36\20"+
		"\2QR\7\7\2\2RT\5\36\20\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2"+
		"\2\2WU\3\2\2\2XP\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\b\2\2[\\\5\16\b\2\\\13"+
		"\3\2\2\2]_\5\34\17\2^`\7+\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bo\3\2\2\2cd\7\t\2\2de\7\6\2\2ef\5(\25\2fg\7\b\2\2gh\7\n\2\2hj\7,\2\2"+
		"ik\7+\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n]\3\2\2\2"+
		"nc\3\2\2\2o\r\3\2\2\2pr\7+\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tx\3\2\2\2uw\5\20\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{}\7\13\2\2|~\7+\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081\u0083\5\34\17\2\u0082\u0084\7+\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u00bc\3\2\2\2\u0087\u0089\5&\24\2\u0088\u008a\7+\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u00bc\3\2\2\2\u008d\u008f\5\24\13\2\u008e\u0090\7+\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u00bc\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095\7\6\2\2\u0095"+
		"\u0096\5(\25\2\u0096\u0097\7\b\2\2\u0097\u009b\5\16\b\2\u0098\u009a\5"+
		"\22\n\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\r"+
		"\2\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00bc\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5"+
		"\36\20\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\7\7\2\2\u00a8"+
		"\u00a9\5(\25\2\u00a9\u00aa\7\7\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\7\b"+
		"\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00bc\3\2\2\2\u00ae\u00af\7\17\2\2\u00af"+
		"\u00b0\7\6\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\5\16"+
		"\b\2\u00b3\u00bc\3\2\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b7\5,\27\2\u00b6"+
		"\u00b8\7+\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u0081\3\2\2\2\u00bb"+
		"\u0087\3\2\2\2\u00bb\u008d\3\2\2\2\u00bb\u0093\3\2\2\2\u00bb\u00a2\3\2"+
		"\2\2\u00bb\u00ae\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be"+
		"\7\r\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5(\25\2\u00c1"+
		"\u00c2\7\b\2\2\u00c2\u00c3\5\16\b\2\u00c3\23\3\2\2\2\u00c4\u00c9\7,\2"+
		"\2\u00c5\u00c6\7\21\2\2\u00c6\u00c8\7,\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00d0\5\32\16\2\u00ce\u00d0"+
		"\5\32\16\2\u00cf\u00c4\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00d2\7\22\2\2\u00d2\u00d4\7,\2\2\u00d3\u00d5\7+\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\5\30\r\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\7\13\2\2\u00de\u00e0\7+\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\27\3\2\2\2\u00e3\u00e4"+
		"\7\23\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\5\16\b\2\u00e6\31\3\2\2\2\u00e7"+
		"\u00e8\7,\2\2\u00e8\u00f1\7\6\2\2\u00e9\u00ee\5,\27\2\u00ea\u00eb\7\7"+
		"\2\2\u00eb\u00ed\5,\27\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7\b\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\5&\24"+
		"\2\u00f7\u00fc\3\2\2\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\5$\23\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\35\3\2\2\2\u00fd"+
		"\u00fe\5 \21\2\u00fe\u00ff\5$\23\2\u00ff\37\3\2\2\2\u0100\u0101\t\2\2"+
		"\2\u0101!\3\2\2\2\u0102\u0105\7\31\2\2\u0103\u0105\5 \21\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105#\3\2\2\2\u0106\u010d\7,\2\2\u0107\u0108"+
		"\7,\2\2\u0108\u0109\7\32\2\2\u0109\u010a\5,\27\2\u010a\u010b\7\33\2\2"+
		"\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010d%\3"+
		"\2\2\2\u010e\u010f\5$\23\2\u010f\u0110\7\34\2\2\u0110\u0111\5,\27\2\u0111"+
		"\u0116\3\2\2\2\u0112\u0113\5$\23\2\u0113\u0114\t\3\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u010e\3\2\2\2\u0115\u0112\3\2\2\2\u0116\'\3\2\2\2\u0117\u0118"+
		"\5*\26\2\u0118\u0119\t\4\2\2\u0119\u011a\5(\25\2\u011a\u011d\3\2\2\2\u011b"+
		"\u011d\5*\26\2\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2\u011d)\3\2\2\2"+
		"\u011e\u011f\5,\27\2\u011f\u0120\t\5\2\2\u0120\u0121\5*\26\2\u0121\u0126"+
		"\3\2\2\2\u0122\u0123\7$\2\2\u0123\u0126\5,\27\2\u0124\u0126\5,\27\2\u0125"+
		"\u011e\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126+\3\2\2\2"+
		"\u0127\u0128\5.\30\2\u0128\u0129\t\6\2\2\u0129\u012a\5,\27\2\u012a\u0136"+
		"\3\2\2\2\u012b\u0136\5.\30\2\u012c\u012d\7,\2\2\u012d\u012e\7\32\2\2\u012e"+
		"\u012f\5,\27\2\u012f\u0130\7\33\2\2\u0130\u0136\3\2\2\2\u0131\u0136\5"+
		"\24\13\2\u0132\u0133\5\60\31\2\u0133\u0134\t\3\2\2\u0134\u0136\3\2\2\2"+
		"\u0135\u0127\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u0131"+
		"\3\2\2\2\u0135\u0132\3\2\2\2\u0136-\3\2\2\2\u0137\u0138\5\60\31\2\u0138"+
		"\u0139\t\7\2\2\u0139\u013a\5.\30\2\u013a\u013d\3\2\2\2\u013b\u013d\5\60"+
		"\31\2\u013c\u0137\3\2\2\2\u013c\u013b\3\2\2\2\u013d/\3\2\2\2\u013e\u013f"+
		"\7\6\2\2\u013f\u0140\5(\25\2\u0140\u0141\7\b\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0144\t\b\2\2\u0143\u013e\3\2\2\2\u0143\u0142\3\2\2\2\u0144\61\3\2\2"+
		"\2$\65=DUXalnsx\177\u0085\u008b\u0091\u009b\u00a0\u00b9\u00bb\u00c9\u00cf"+
		"\u00d6\u00db\u00e1\u00ee\u00f1\u00fb\u0104\u010c\u0115\u011c\u0125\u0135"+
		"\u013c\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}