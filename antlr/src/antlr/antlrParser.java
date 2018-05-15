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
		T__24=25, T__25=26, OP_ADD=27, OP_SUB=28, OP_UADD=29, OP_USUB=30, OP_MUL=31, 
		OP_DIV=32, OP_AND=33, OP_OR=34, OP_GREATER=35, OP_LESS=36, OP_EQUAL=37, 
		OP_GREATEREQUAL=38, OP_LESSEQUAL=39, NEWLINE=40, BOOL_VALUE=41, ID=42, 
		INT_NUM=43, DECIMAL_NUM=44, ESC=45, TEXT=46, WS=47, COMMENTS=48;
	public static final int
		RULE_prog = 0, RULE_setup = 1, RULE_gameloop = 2, RULE_method = 3, RULE_predcl = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_elseif = 7, RULE_action = 8, RULE_strategy = 9, 
		RULE_behavior = 10, RULE_fcall = 11, RULE_dcl = 12, RULE_argmnt = 13, 
		RULE_type = 14, RULE_rtype = 15, RULE_ref = 16, RULE_assign = 17, RULE_aoexpr = 18, 
		RULE_bexpr = 19, RULE_expr = 20, RULE_term = 21, RULE_factor = 22;
	public static final String[] ruleNames = {
		"prog", "setup", "gameloop", "method", "predcl", "block", "stmt", "elseif", 
		"action", "strategy", "behavior", "fcall", "dcl", "argmnt", "type", "rtype", 
		"ref", "assign", "aoexpr", "bexpr", "expr", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'setup'", "'game-loop'", "'function'", "'('", "','", "')'", "'event'", 
		"'->'", "'end'", "'if'", "'else'", "'do'", "'while'", "'return'", "'.'", 
		"'strategy'", "'behavior'", "'bool'", "'int'", "'text'", "'decimal'", 
		"'void'", "'['", "']'", "'='", "'!'", "'+'", "'-'", "'++'", "'--'", "'*'", 
		"'/'", "'&&'", "'||'", "'>'", "'<'", "'=='", "'>='", "'<='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "OP_ADD", "OP_SUB", "OP_UADD", "OP_USUB", "OP_MUL", 
		"OP_DIV", "OP_AND", "OP_OR", "OP_GREATER", "OP_LESS", "OP_EQUAL", "OP_GREATEREQUAL", 
		"OP_LESSEQUAL", "NEWLINE", "BOOL_VALUE", "ID", "INT_NUM", "DECIMAL_NUM", 
		"ESC", "TEXT", "WS", "COMMENTS"
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
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(46);
				match(NEWLINE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(52);
				predcl();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			setup();
			setState(59);
			gameloop();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__15) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(60);
					strategy();
					}
					break;
				case T__2:
					{
					setState(61);
					method();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(69);
			match(T__0);
			setState(70);
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
			setState(72);
			match(T__1);
			setState(73);
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
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__2);
			setState(76);
			rtype();
			setState(77);
			match(ID);
			setState(78);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(79);
				argmnt();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(80);
					match(T__4);
					setState(81);
					argmnt();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(T__5);
			setState(90);
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
		public PredclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predcl; }
	 
		public PredclContext() { }
		public void copyFrom(PredclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EventDclContext extends PredclContext {
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(antlrParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public EventDclContext(PredclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterEventDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitEventDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitEventDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PdclContext extends PredclContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public PdclContext(PredclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterPdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitPdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitPdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredclContext predcl() throws RecognitionException {
		PredclContext _localctx = new PredclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_predcl);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				_localctx = new PdclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				dcl();
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					match(NEWLINE);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case T__6:
				_localctx = new EventDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__6);
				setState(99);
				match(T__3);
				setState(100);
				aoexpr();
				setState(101);
				match(T__5);
				setState(102);
				match(T__7);
				setState(103);
				match(ID);
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					match(NEWLINE);
					}
					}
					setState(107); 
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
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(NEWLINE);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				stmt();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__8);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				match(NEWLINE);
				}
				}
				setState(126); 
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
	public static class IncrStmtContext extends StmtContext {
		public Token op;
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(antlrParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrParser.NEWLINE, i);
		}
		public IncrStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterIncrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitIncrStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitIncrStmt(this);
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
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				dcl();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(NEWLINE);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				assign();
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					match(NEWLINE);
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 3:
				_localctx = new ActionStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				action();
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(NEWLINE);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(T__9);
				setState(147);
				match(T__3);
				setState(148);
				((IfStmtContext)_localctx).first = aoexpr();
				setState(149);
				match(T__5);
				setState(150);
				((IfStmtContext)_localctx).firstBlock = block();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						elseif();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(157);
					match(T__10);
					setState(158);
					((IfStmtContext)_localctx).secondBlock = block();
					}
				}

				}
				break;
			case 5:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(T__11);
				setState(162);
				match(T__3);
				setState(163);
				argmnt();
				setState(164);
				match(T__4);
				setState(165);
				((DoStmtContext)_localctx).firstAo = aoexpr();
				setState(166);
				match(T__4);
				setState(167);
				((DoStmtContext)_localctx).secondAo = aoexpr();
				setState(168);
				match(T__4);
				setState(169);
				((DoStmtContext)_localctx).thirdAo = aoexpr();
				setState(170);
				match(T__5);
				setState(171);
				block();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(T__12);
				setState(174);
				match(T__3);
				setState(175);
				aoexpr();
				setState(176);
				match(T__5);
				setState(177);
				block();
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(T__13);
				setState(180);
				expr();
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 8:
				_localctx = new IncrStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				ref();
				setState(187);
				((IncrStmtContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_UADD || _la==OP_USUB) ) {
					((IncrStmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					match(NEWLINE);
					}
					}
					setState(191); 
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
		enterRule(_localctx, 14, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__10);
			setState(196);
			match(T__9);
			setState(197);
			match(T__3);
			setState(198);
			aoexpr();
			setState(199);
			match(T__5);
			setState(200);
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
		enterRule(_localctx, 16, RULE_action);
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						match(T__14);
						setState(204);
						match(ID);
						}
						} 
					}
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(210);
				match(T__14);
				setState(211);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		enterRule(_localctx, 18, RULE_strategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__15);
			setState(216);
			match(ID);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NEWLINE);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				behavior();
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			setState(227);
			match(T__8);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				match(NEWLINE);
				}
				}
				setState(231); 
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
		enterRule(_localctx, 20, RULE_behavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__16);
			setState(234);
			match(ID);
			setState(235);
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
		enterRule(_localctx, 22, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(T__3);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << OP_SUB) | (1L << BOOL_VALUE) | (1L << ID) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << TEXT))) != 0)) {
				{
				setState(239);
				expr();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(240);
					match(T__4);
					setState(241);
					expr();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(249);
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
		enterRule(_localctx, 24, RULE_dcl);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				type();
				setState(252);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				type();
				setState(255);
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
		enterRule(_localctx, 26, RULE_argmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			type();
			setState(260);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_rtype);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__21);
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		enterRule(_localctx, 32, RULE_ref);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(ID);
				setState(270);
				match(T__22);
				setState(271);
				expr();
				setState(272);
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
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
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
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			ref();
			setState(277);
			match(T__24);
			setState(278);
			aoexpr();
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
		public Token op;
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
		enterRule(_localctx, 36, RULE_aoexpr);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				bexpr();
				setState(281);
				((AoexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_AND || _la==OP_OR) ) {
					((AoexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				aoexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
		public Token op;
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
		enterRule(_localctx, 38, RULE_bexpr);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expr();
				setState(288);
				((BoolexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_GREATER) | (1L << OP_LESS) | (1L << OP_EQUAL) | (1L << OP_GREATEREQUAL) | (1L << OP_LESSEQUAL))) != 0)) ) {
					((BoolexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				bexpr();
				}
				break;
			case 2:
				_localctx = new NotexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__25);
				setState(292);
				expr();
				}
				break;
			case 3:
				_localctx = new EmptyboolexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
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
		enterRule(_localctx, 40, RULE_expr);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new InfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				term();
				setState(297);
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
				setState(298);
				expr();
				}
				break;
			case 2:
				_localctx = new TermExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				term();
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
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				factor();
				setState(304);
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
				setState(305);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenFactorContext extends FactorContext {
		public AoexprContext aoexpr() {
			return getRuleContext(AoexprContext.class,0);
		}
		public ParenFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterParenFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitParenFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitParenFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends FactorContext {
		public Token op;
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public UnaryExprContext(FactorContext ctx) { copyFrom(ctx); }
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
	public static class ValueFactorContext extends FactorContext {
		public Token value;
		public TerminalNode INT_NUM() { return getToken(antlrParser.INT_NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(antlrParser.BOOL_VALUE, 0); }
		public TerminalNode DECIMAL_NUM() { return getToken(antlrParser.DECIMAL_NUM, 0); }
		public TerminalNode TEXT() { return getToken(antlrParser.TEXT, 0); }
		public ValueFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterValueFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitValueFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitValueFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeFactorContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NegativeFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterNegativeFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitNegativeFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitNegativeFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefFactorContext extends FactorContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public RefFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterRefFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitRefFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitRefFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionFactorContext extends FactorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterActionFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitActionFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitActionFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ParenFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(T__3);
				setState(311);
				aoexpr();
				setState(312);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ValueFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				((ValueFactorContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << TEXT))) != 0)) ) {
					((ValueFactorContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new NegativeFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(OP_SUB);
				setState(316);
				factor();
				}
				break;
			case 4:
				_localctx = new ActionFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				action();
				}
				break;
			case 5:
				_localctx = new RefFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				ref();
				}
				break;
			case 6:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				ref();
				setState(320);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0147\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\3\5\3\6\3\6\6\6a\n"+
		"\6\r\6\16\6b\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6l\n\6\r\6\16\6m\5\6p\n\6\3"+
		"\7\6\7s\n\7\r\7\16\7t\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\6\7\177\n\7"+
		"\r\7\16\7\u0080\3\b\3\b\6\b\u0085\n\b\r\b\16\b\u0086\3\b\3\b\6\b\u008b"+
		"\n\b\r\b\16\b\u008c\3\b\3\b\6\b\u0091\n\b\r\b\16\b\u0092\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\b\3\b\5\b\u00a2\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\6\b\u00b9\n\b\r\b\16\b\u00ba\3\b\3\b\3\b\6\b\u00c0\n\b\r\b"+
		"\16\b\u00c1\5\b\u00c4\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n"+
		"\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13"+
		"\6\13\u00dd\n\13\r\13\16\13\u00de\3\13\6\13\u00e2\n\13\r\13\16\13\u00e3"+
		"\3\13\3\13\6\13\u00e8\n\13\r\13\16\13\u00e9\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f5\n\r\f\r\16\r\u00f8\13\r\5\r\u00fa\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0104\n\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\5\21\u010d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0115\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0120\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0130\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0137\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0145\n\30\3\30\2\2\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\t\3\2\37 \3\2\24\27"+
		"\3\2#$\3\2%)\3\2\35\36\3\2!\"\5\2++-.\60\60\2\u015d\2\63\3\2\2\2\4G\3"+
		"\2\2\2\6J\3\2\2\2\bM\3\2\2\2\no\3\2\2\2\fr\3\2\2\2\16\u00c3\3\2\2\2\20"+
		"\u00c5\3\2\2\2\22\u00d7\3\2\2\2\24\u00d9\3\2\2\2\26\u00eb\3\2\2\2\30\u00ef"+
		"\3\2\2\2\32\u0103\3\2\2\2\34\u0105\3\2\2\2\36\u0108\3\2\2\2 \u010c\3\2"+
		"\2\2\"\u0114\3\2\2\2$\u0116\3\2\2\2&\u011f\3\2\2\2(\u0128\3\2\2\2*\u012f"+
		"\3\2\2\2,\u0136\3\2\2\2.\u0144\3\2\2\2\60\62\7*\2\2\61\60\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\n"+
		"\6\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2"+
		"<=\5\4\3\2=B\5\6\4\2>A\5\24\13\2?A\5\b\5\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\2\2\3F\3\3\2\2\2GH\7\3"+
		"\2\2HI\5\f\7\2I\5\3\2\2\2JK\7\4\2\2KL\5\f\7\2L\7\3\2\2\2MN\7\5\2\2NO\5"+
		" \21\2OP\7,\2\2PY\7\6\2\2QV\5\34\17\2RS\7\7\2\2SU\5\34\17\2TR\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YQ\3\2\2\2YZ\3\2\2\2"+
		"Z[\3\2\2\2[\\\7\b\2\2\\]\5\f\7\2]\t\3\2\2\2^`\5\32\16\2_a\7*\2\2`_\3\2"+
		"\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cp\3\2\2\2de\7\t\2\2ef\7\6\2\2fg\5&"+
		"\24\2gh\7\b\2\2hi\7\n\2\2ik\7,\2\2jl\7*\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2o^\3\2\2\2od\3\2\2\2p\13\3\2\2\2qs\7*\2\2rq\3"+
		"\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3\2\2\2vx\5\16\b\2wv\3\2\2\2x{"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|~\7\13\2\2}\177\7*\2"+
		"\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\r\3\2\2\2\u0082\u0084\5\32\16\2\u0083\u0085\7*\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u00c4"+
		"\3\2\2\2\u0088\u008a\5$\23\2\u0089\u008b\7*\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00c4\3\2"+
		"\2\2\u008e\u0090\5\22\n\2\u008f\u0091\7*\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00c4\3\2"+
		"\2\2\u0094\u0095\7\f\2\2\u0095\u0096\7\6\2\2\u0096\u0097\5&\24\2\u0097"+
		"\u0098\7\b\2\2\u0098\u009c\5\f\7\2\u0099\u009b\5\20\t\2\u009a\u0099\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a1\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a2\5\f"+
		"\7\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00c4\3\2\2\2\u00a3"+
		"\u00a4\7\16\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7"+
		"\7\7\2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5&\24\2\u00aa"+
		"\u00ab\7\7\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\5\f"+
		"\7\2\u00ae\u00c4\3\2\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\7\6\2\2\u00b1"+
		"\u00b2\5&\24\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00c4\3\2"+
		"\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b9\7*\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00c4\3\2\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00bf\t\2\2\2\u00be"+
		"\u00c0\7*\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u0082\3\2\2\2\u00c3"+
		"\u0088\3\2\2\2\u00c3\u008e\3\2\2\2\u00c3\u0094\3\2\2\2\u00c3\u00a3\3\2"+
		"\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c4"+
		"\17\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\7\6\2"+
		"\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\f\7\2\u00cb\21"+
		"\3\2\2\2\u00cc\u00d1\7,\2\2\u00cd\u00ce\7\21\2\2\u00ce\u00d0\7,\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\21\2\2\u00d5"+
		"\u00d8\5\30\r\2\u00d6\u00d8\5\30\r\2\u00d7\u00cc\3\2\2\2\u00d7\u00d6\3"+
		"\2\2\2\u00d8\23\3\2\2\2\u00d9\u00da\7\22\2\2\u00da\u00dc\7,\2\2\u00db"+
		"\u00dd\7*\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5\26\f\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\13\2\2\u00e6\u00e8\7*\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee"+
		"\5\f\7\2\u00ee\27\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f9\7\6\2\2\u00f1"+
		"\u00f6\5*\26\2\u00f2\u00f3\7\7\2\2\u00f3\u00f5\5*\26\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\31\3\2\2\2\u00fd\u00fe"+
		"\5\36\20\2\u00fe\u00ff\5$\23\2\u00ff\u0104\3\2\2\2\u0100\u0101\5\36\20"+
		"\2\u0101\u0102\5\"\22\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u0100\3\2\2\2\u0104\33\3\2\2\2\u0105\u0106\5\36\20\2\u0106\u0107\5\""+
		"\22\2\u0107\35\3\2\2\2\u0108\u0109\t\3\2\2\u0109\37\3\2\2\2\u010a\u010d"+
		"\7\30\2\2\u010b\u010d\5\36\20\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2"+
		"\2\u010d!\3\2\2\2\u010e\u0115\7,\2\2\u010f\u0110\7,\2\2\u0110\u0111\7"+
		"\31\2\2\u0111\u0112\5*\26\2\u0112\u0113\7\32\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0115#\3\2\2\2\u0116\u0117\5\"\22\2"+
		"\u0117\u0118\7\33\2\2\u0118\u0119\5&\24\2\u0119%\3\2\2\2\u011a\u011b\5"+
		"(\25\2\u011b\u011c\t\4\2\2\u011c\u011d\5&\24\2\u011d\u0120\3\2\2\2\u011e"+
		"\u0120\5(\25\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2\2\2\u0120\'\3\2\2\2"+
		"\u0121\u0122\5*\26\2\u0122\u0123\t\5\2\2\u0123\u0124\5(\25\2\u0124\u0129"+
		"\3\2\2\2\u0125\u0126\7\34\2\2\u0126\u0129\5*\26\2\u0127\u0129\5*\26\2"+
		"\u0128\u0121\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0127\3\2\2\2\u0129)\3"+
		"\2\2\2\u012a\u012b\5,\27\2\u012b\u012c\t\6\2\2\u012c\u012d\5*\26\2\u012d"+
		"\u0130\3\2\2\2\u012e\u0130\5,\27\2\u012f\u012a\3\2\2\2\u012f\u012e\3\2"+
		"\2\2\u0130+\3\2\2\2\u0131\u0132\5.\30\2\u0132\u0133\t\7\2\2\u0133\u0134"+
		"\5,\27\2\u0134\u0137\3\2\2\2\u0135\u0137\5.\30\2\u0136\u0131\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137-\3\2\2\2\u0138\u0139\7\6\2\2\u0139\u013a\5&\24\2"+
		"\u013a\u013b\7\b\2\2\u013b\u0145\3\2\2\2\u013c\u0145\t\b\2\2\u013d\u013e"+
		"\7\36\2\2\u013e\u0145\5.\30\2\u013f\u0145\5\22\n\2\u0140\u0145\5\"\22"+
		"\2\u0141\u0142\5\"\22\2\u0142\u0143\t\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0138\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013f\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0145/\3\2\2\2%\639@BVYb"+
		"moty\u0080\u0086\u008c\u0092\u009c\u00a1\u00ba\u00c1\u00c3\u00d1\u00d7"+
		"\u00de\u00e3\u00e9\u00f6\u00f9\u0103\u010c\u0114\u011f\u0128\u012f\u0136"+
		"\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}