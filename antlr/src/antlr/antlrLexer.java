// Generated from C:/Users/Casper/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrLexer extends Lexer {
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
		OP_GREATEREQUAL=38, OP_LESSEQUAL=39, NEWLINE=40, ID=41, BOOL_VALUE=42, 
		INT_NUM=43, DECIMAL_NUM=44, TEXT=45, WS=46, COMMENTS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "OP_ADD", "OP_SUB", "OP_UADD", "OP_USUB", "OP_MUL", "OP_DIV", 
		"OP_AND", "OP_OR", "OP_GREATER", "OP_LESS", "OP_EQUAL", "OP_GREATEREQUAL", 
		"OP_LESSEQUAL", "NEWLINE", "ID", "BOOL_VALUE", "INT_NUM", "DECIMAL_NUM", 
		"TEXT", "WS", "COMMENTS"
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
		"OP_LESSEQUAL", "NEWLINE", "ID", "BOOL_VALUE", "INT_NUM", "DECIMAL_NUM", 
		"TEXT", "WS", "COMMENTS"
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


	public antlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\6*\u0101\n*\r*\16*\u0102\3*\7*\u0106"+
		"\n*\f*\16*\u0109\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0114\n+\3,\6,\u0117"+
		"\n,\r,\16,\u0118\3-\6-\u011c\n-\r-\16-\u011d\3-\3-\6-\u0122\n-\r-\16-"+
		"\u0123\5-\u0126\n-\3.\3.\7.\u012a\n.\f.\16.\u012d\13.\3.\3.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\7\60\u0139\n\60\f\60\16\60\u013c\13\60\3\60\3\60"+
		"\3\u012b\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\5\2\13\13\17\17\"\"\4\2\f\f\17\17\2\u0147\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2"+
		"\2\5g\3\2\2\2\7q\3\2\2\2\tz\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3"+
		"\2\2\2\21\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008d\3\2\2\2\27\u0090\3\2"+
		"\2\2\31\u0095\3\2\2\2\33\u0098\3\2\2\2\35\u009e\3\2\2\2\37\u00a5\3\2\2"+
		"\2!\u00a7\3\2\2\2#\u00b0\3\2\2\2%\u00b9\3\2\2\2\'\u00be\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00cf\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2"+
		"\63\u00d8\3\2\2\2\65\u00da\3\2\2\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0"+
		"\3\2\2\2=\u00e3\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00f0\3\2\2\2I\u00f2\3\2\2\2K\u00f4\3\2\2\2M\u00f7\3\2"+
		"\2\2O\u00fa\3\2\2\2Q\u00fd\3\2\2\2S\u0100\3\2\2\2U\u0113\3\2\2\2W\u0116"+
		"\3\2\2\2Y\u011b\3\2\2\2[\u0127\3\2\2\2]\u0130\3\2\2\2_\u0134\3\2\2\2a"+
		"b\7u\2\2bc\7g\2\2cd\7v\2\2de\7w\2\2ef\7r\2\2f\4\3\2\2\2gh\7i\2\2hi\7c"+
		"\2\2ij\7o\2\2jk\7g\2\2kl\7/\2\2lm\7n\2\2mn\7q\2\2no\7q\2\2op\7r\2\2p\6"+
		"\3\2\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2tu\7e\2\2uv\7v\2\2vw\7k\2\2wx\7q\2"+
		"\2xy\7p\2\2y\b\3\2\2\2z{\7*\2\2{\n\3\2\2\2|}\7.\2\2}\f\3\2\2\2~\177\7"+
		"+\2\2\177\16\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7x\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7/\2\2\u0087\u0088\7@\2\2\u0088\22\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7f\2\2\u008c\24\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f"+
		"\7h\2\2\u008f\26\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093"+
		"\7u\2\2\u0093\u0094\7g\2\2\u0094\30\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097"+
		"\7q\2\2\u0097\32\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\34\3\2\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7\60\2\2"+
		"\u00a6 \3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2"+
		"\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7i\2\2\u00ae\u00af\7{\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7x\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd&\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2"+
		"\2\u00c1(\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7"+
		"z\2\2\u00c5\u00c6\7v\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce,\3\2\2\2\u00cf\u00d0\7x\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7f\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7]\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7\62\3\2\2\2\u00d8"+
		"\u00d9\7?\2\2\u00d9\64\3\2\2\2\u00da\u00db\7#\2\2\u00db\66\3\2\2\2\u00dc"+
		"\u00dd\7-\2\2\u00dd8\3\2\2\2\u00de\u00df\7/\2\2\u00df:\3\2\2\2\u00e0\u00e1"+
		"\7-\2\2\u00e1\u00e2\7-\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5"+
		"\7/\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7"+
		"\61\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ec\7(\2\2\u00ecD\3"+
		"\2\2\2\u00ed\u00ee\7~\2\2\u00ee\u00ef\7~\2\2\u00efF\3\2\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7"+
		"?\2\2\u00f5\u00f6\7?\2\2\u00f6L\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7?\2\2\u00fcP\3"+
		"\2\2\2\u00fd\u00fe\7\f\2\2\u00feR\3\2\2\2\u00ff\u0101\t\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0107\3\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108T\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u0114\7g\2\2\u010e\u010f\7h\2\2\u010f\u0110\7c\2\2\u0110\u0111\7n\2\2"+
		"\u0111\u0112\7u\2\2\u0112\u0114\7g\2\2\u0113\u010a\3\2\2\2\u0113\u010e"+
		"\3\2\2\2\u0114V\3\2\2\2\u0115\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119X\3\2\2\2"+
		"\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0125\3\2\2\2\u011f\u0121\7\60\2\2"+
		"\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126Z\3\2\2\2\u0127\u012b\7$\2\2\u0128\u012a\13\2\2\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7$\2\2\u012f"+
		"\\\3\2\2\2\u0130\u0131\t\5\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b/\2\2"+
		"\u0133^\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7\61\2\2\u0136\u013a"+
		"\3\2\2\2\u0137\u0139\n\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013e\b\60\2\2\u013e`\3\2\2\2\f\2\u0102\u0107\u0113\u0118\u011d"+
		"\u0123\u0125\u012b\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}