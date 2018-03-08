// Generated from C:/Users/mark/Documents/GitHub/P4q/Grammer1\grammer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammerParser extends Parser {
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
		CHAR_VALUE=45, WS=46;
	public static final int
		RULE_prog = 0, RULE_setup = 1, RULE_gameloop = 2, RULE_method = 3, RULE_predcl = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_action = 7, RULE_strategy = 8, RULE_behavior = 9, 
		RULE_fcall = 10, RULE_dcl = 11, RULE_type = 12, RULE_ref = 13, RULE_assign = 14, 
		RULE_expr = 15, RULE_term = 16, RULE_factor = 17;
	public static final String[] ruleNames = {
		"prog", "setup", "gameloop", "method", "predcl", "block", "stmt", "action", 
		"strategy", "behavior", "fcall", "dcl", "type", "ref", "assign", "expr", 
		"term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'setup'", "'game-loop'", "'function'", "'('", "','", "')'", "'event'", 
		"'->'", "'end'", "'if'", "'else'", "'do'", "'while'", "'return'", "'.'", 
		"'strategy'", "'behavior'", "'bool'", "'int'", "'text'", "'char'", "'decimal'", 
		"'['", "']'", "'='", "'+'", "'-'", "'=='", "'>='", "'<='", "'<'", "'>'", 
		"'&&'", "'||'", "'!'", "'++'", "'--'", "'*'", "'/'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NEWLINE", "ID", "BOOL_VALUE", "INT_NUM", "DECIMAL_NUM", 
		"CHAR_VALUE", "WS"
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
	public String getGrammarFileName() { return "grammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammerParser(TokenStream input) {
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitProg(this);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(36);
				predcl();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			setup();
			setState(43);
			gameloop();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__15) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(44);
					strategy();
					}
					break;
				case T__2:
					{
					setState(45);
					method();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterGameloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitGameloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitGameloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameloopContext gameloop() throws RecognitionException {
		GameloopContext _localctx = new GameloopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gameloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
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
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitMethod(this);
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
			setState(57);
			match(T__2);
			setState(58);
			match(ID);
			setState(59);
			match(T__3);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(60);
				dcl();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(61);
					match(T__4);
					setState(62);
					dcl();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__5);
			setState(71);
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
		public List<TerminalNode> NEWLINE() { return getTokens(grammerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(grammerParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public PredclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterPredcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitPredcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitPredcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredclContext predcl() throws RecognitionException {
		PredclContext _localctx = new PredclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_predcl);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				dcl();
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(NEWLINE);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__6);
				setState(80);
				match(T__3);
				setState(81);
				expr();
				setState(82);
				match(T__5);
				setState(83);
				match(T__7);
				setState(84);
				match(ID);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					match(NEWLINE);
					}
					}
					setState(88); 
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
		public List<TerminalNode> NEWLINE() { return getTokens(grammerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(grammerParser.NEWLINE, i);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(97);
				stmt();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__8);
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(grammerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(grammerParser.NEWLINE, i);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				dcl();
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				assign();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				action();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__9);
				setState(128);
				match(T__3);
				setState(129);
				expr();
				setState(130);
				match(T__5);
				setState(131);
				block();
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(T__10);
						setState(133);
						match(T__9);
						setState(134);
						match(T__3);
						setState(135);
						expr();
						setState(136);
						match(T__5);
						setState(137);
						block();
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(144);
					match(T__10);
					setState(145);
					block();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(T__11);
				setState(149);
				match(T__3);
				setState(150);
				dcl();
				setState(151);
				match(T__4);
				setState(152);
				expr();
				setState(153);
				match(T__4);
				setState(154);
				expr();
				setState(155);
				match(T__4);
				setState(156);
				expr();
				setState(157);
				match(T__5);
				setState(158);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(T__12);
				setState(161);
				match(T__3);
				setState(162);
				expr();
				setState(163);
				match(T__5);
				setState(164);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(T__13);
				setState(167);
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
		public List<TerminalNode> ID() { return getTokens(grammerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammerParser.ID, i);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		try {
			int _alt;
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(T__14);
						setState(172);
						match(ID);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(178);
				match(T__14);
				setState(179);
				fcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(grammerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(grammerParser.NEWLINE, i);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitStrategy(this);
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
			setState(183);
			match(T__15);
			setState(184);
			match(ID);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(NEWLINE);
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				behavior();
				}
				}
				setState(193); 
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
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitBehavior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitBehavior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorContext behavior() throws RecognitionException {
		BehaviorContext _localctx = new BehaviorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_behavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__16);
			setState(196);
			match(ID);
			setState(197);
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
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitFcall(this);
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
			setState(199);
			match(ID);
			setState(200);
			match(T__3);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__34) | (1L << ID) | (1L << BOOL_VALUE) | (1L << INT_NUM) | (1L << DECIMAL_NUM) | (1L << CHAR_VALUE))) != 0)) {
				{
				setState(201);
				expr();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(202);
					match(T__4);
					setState(203);
					expr();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(211);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dcl);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				type();
				setState(214);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				type();
				setState(217);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ref);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ID);
				setState(225);
				match(T__22);
				setState(226);
				expr();
				setState(227);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			ref();
			setState(232);
			match(T__24);
			setState(233);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				term();
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(ID);
				setState(241);
				match(T__22);
				setState(242);
				expr();
				setState(243);
				match(T__23);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(245);
					term();
					}
					break;
				case 2:
					{
					setState(246);
					action();
					}
					break;
				}
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				action();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				term();
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(T__34);
				setState(258);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				factor();
				setState(260);
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
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				factor();
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammerParser.ID, 0); }
		public TerminalNode INT_NUM() { return getToken(grammerParser.INT_NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(grammerParser.BOOL_VALUE, 0); }
		public TerminalNode DECIMAL_NUM() { return getToken(grammerParser.DECIMAL_NUM, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(grammerParser.CHAR_VALUE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammerVisitor ) return ((grammerVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__3);
				setState(272);
				expr();
				setState(273);
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
				setState(275);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0119\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5"+
		"\f\5\16\5E\13\5\5\5G\n\5\3\5\3\5\3\5\3\6\3\6\6\6N\n\6\r\6\16\6O\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\5\6]\n\6\3\7\6\7`\n\7\r\7\16"+
		"\7a\3\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\6\7l\n\7\r\7\16\7m\3\b\3\b\6\b"+
		"r\n\b\r\b\16\bs\3\b\3\b\6\bx\n\b\r\b\16\by\3\b\3\b\6\b~\n\b\r\b\16\b\177"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16"+
		"\b\u0091\13\b\3\b\3\b\5\b\u0095\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3"+
		"\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\3\t\3\t\5\t\u00b8\n\t\3\n\3\n"+
		"\3\n\6\n\u00bd\n\n\r\n\16\n\u00be\3\n\6\n\u00c2\n\n\r\n\16\n\u00c3\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f"+
		"\5\f\u00d4\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fa\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0109\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0117\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\t\3\2\24\30\3\2\34\35\3\2\36\"\3\2#$\3\2&\'\3\2()\3\2+/\2"+
		"\u012e\2)\3\2\2\2\4\65\3\2\2\2\68\3\2\2\2\b;\3\2\2\2\n\\\3\2\2\2\f_\3"+
		"\2\2\2\16\u00aa\3\2\2\2\20\u00b7\3\2\2\2\22\u00b9\3\2\2\2\24\u00c5\3\2"+
		"\2\2\26\u00c9\3\2\2\2\30\u00dd\3\2\2\2\32\u00df\3\2\2\2\34\u00e7\3\2\2"+
		"\2\36\u00e9\3\2\2\2 \u0108\3\2\2\2\"\u010f\3\2\2\2$\u0116\3\2\2\2&(\5"+
		"\n\6\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,"+
		"-\5\4\3\2-\62\5\6\4\2.\61\5\22\n\2/\61\5\b\5\2\60.\3\2\2\2\60/\3\2\2\2"+
		"\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2"+
		"\65\66\7\3\2\2\66\67\5\f\7\2\67\5\3\2\2\289\7\4\2\29:\5\f\7\2:\7\3\2\2"+
		"\2;<\7\5\2\2<=\7+\2\2=F\7\6\2\2>C\5\30\r\2?@\7\7\2\2@B\5\30\r\2A?\3\2"+
		"\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3\2"+
		"\2\2GH\3\2\2\2HI\7\b\2\2IJ\5\f\7\2J\t\3\2\2\2KM\5\30\r\2LN\7*\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P]\3\2\2\2QR\7\t\2\2RS\7\6\2\2ST\5"+
		" \21\2TU\7\b\2\2UV\7\n\2\2VX\7+\2\2WY\7*\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[]\3\2\2\2\\K\3\2\2\2\\Q\3\2\2\2]\13\3\2\2\2^`\7*\2\2_^"+
		"\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2ce\5\16\b\2dc\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ik\7\13\2\2jl\7*\2\2"+
		"kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2oq\5\30\r\2pr\7*\2"+
		"\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u00ab\3\2\2\2uw\5\36\20\2"+
		"vx\7*\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u00ab\3\2\2\2{}\5\20"+
		"\t\2|~\7*\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u00ab\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5 "+
		"\21\2\u0084\u0085\7\b\2\2\u0085\u008f\5\f\7\2\u0086\u0087\7\r\2\2\u0087"+
		"\u0088\7\f\2\2\u0088\u0089\7\6\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\b"+
		"\2\2\u008b\u008c\5\f\7\2\u008c\u008e\3\2\2\2\u008d\u0086\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0095\5\f\7\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00ab\3\2\2\2\u0096\u0097\7\16"+
		"\2\2\u0097\u0098\7\6\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\7\2\2\u009a"+
		"\u009b\5 \21\2\u009b\u009c\7\7\2\2\u009c\u009d\5 \21\2\u009d\u009e\7\7"+
		"\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\f\7\2\u00a1"+
		"\u00ab\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5"+
		" \21\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00ab\3\2\2\2\u00a8"+
		"\u00a9\7\20\2\2\u00a9\u00ab\5 \21\2\u00aao\3\2\2\2\u00aau\3\2\2\2\u00aa"+
		"{\3\2\2\2\u00aa\u0081\3\2\2\2\u00aa\u0096\3\2\2\2\u00aa\u00a2\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00b1\7+\2\2\u00ad\u00ae\7"+
		"\21\2\2\u00ae\u00b0\7+\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b8\5\26\f\2\u00b6\u00b8\5\26\f\2\u00b7"+
		"\u00ac\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7\22\2"+
		"\2\u00ba\u00bc\7+\2\2\u00bb\u00bd\7*\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\23\2\2\u00c6"+
		"\u00c7\7+\2\2\u00c7\u00c8\5\f\7\2\u00c8\25\3\2\2\2\u00c9\u00ca\7+\2\2"+
		"\u00ca\u00d3\7\6\2\2\u00cb\u00d0\5 \21\2\u00cc\u00cd\7\7\2\2\u00cd\u00cf"+
		"\5 \21\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6"+
		"\27\3\2\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\5\36\20\2\u00d9\u00de\3"+
		"\2\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\5\34\17\2\u00dc\u00de\3\2\2\2"+
		"\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\31\3\2\2\2\u00df\u00e0"+
		"\t\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e8\7+\2\2\u00e2\u00e3\7+\2\2\u00e3"+
		"\u00e4\7\31\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7\32\2\2\u00e6\u00e8\3"+
		"\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e8\35\3\2\2\2\u00e9"+
		"\u00ea\5\34\17\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\5 \21\2\u00ec\37\3\2"+
		"\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\t\3\2\2\u00ef\u00f0\5 \21\2\u00f0"+
		"\u0109\3\2\2\2\u00f1\u0109\5\"\22\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\7\31"+
		"\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f6\7\32\2\2\u00f6\u0109\3\2\2\2\u00f7"+
		"\u00fa\5\"\22\2\u00f8\u00fa\5\20\t\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc\u00fd\5 \21\2\u00fd"+
		"\u0109\3\2\2\2\u00fe\u0109\5\20\t\2\u00ff\u0100\5\"\22\2\u0100\u0101\t"+
		"\5\2\2\u0101\u0102\5 \21\2\u0102\u0109\3\2\2\2\u0103\u0104\7%\2\2\u0104"+
		"\u0109\5 \21\2\u0105\u0106\5$\23\2\u0106\u0107\t\6\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u00ed\3\2\2\2\u0108\u00f1\3\2\2\2\u0108\u00f2\3\2\2\2\u0108"+
		"\u00f9\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2"+
		"\2\2\u0108\u0105\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\5$\23\2\u010b\u010c"+
		"\t\7\2\2\u010c\u010d\5\"\22\2\u010d\u0110\3\2\2\2\u010e\u0110\5$\23\2"+
		"\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110#\3\2\2\2\u0111\u0112\7"+
		"\6\2\2\u0112\u0113\5 \21\2\u0113\u0114\7\b\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0117\t\b\2\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2\u0117%\3\2\2\2"+
		"\37)\60\62CFOZ\\afmsy\177\u008f\u0094\u00aa\u00b1\u00b7\u00be\u00c3\u00d0"+
		"\u00d3\u00dd\u00e7\u00f9\u0108\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}