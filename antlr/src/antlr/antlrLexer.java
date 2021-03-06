// Generated from C:/Users/mark/Documents/GitHub/P4/antlr/src\antlr.g4 by ANTLR 4.7
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
		OP_GREATEREQUAL=38, OP_LESSEQUAL=39, NEWLINE=40, BOOL_VALUE=41, ID=42, 
		INT_NUM=43, DECIMAL_NUM=44, ESC=45, TEXT=46, WS=47, COMMENTS=48;
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
		"OP_LESSEQUAL", "NEWLINE", "BOOL_VALUE", "ID", "INT_NUM", "DECIMAL_NUM", 
		"ESC", "TEXT", "WS", "COMMENTS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u010b\n*\3+\6+\u010e\n+\r+\16+\u010f\3+\7+\u0113\n+\f+\16+\u0116\13"+
		"+\3,\6,\u0119\n,\r,\16,\u011a\3-\6-\u011e\n-\r-\16-\u011f\3-\3-\6-\u0124"+
		"\n-\r-\16-\u0125\5-\u0128\n-\3.\3.\3.\3/\3/\3/\7/\u0130\n/\f/\16/\u0133"+
		"\13/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u013f\n\61\f\61"+
		"\16\61\u0142\13\61\3\61\3\61\3\u0131\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62\3\2\t\4\2C\\c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppt"+
		"tvv\3\2\f\f\5\2\13\13\17\17\"\"\4\2\f\f\17\17\2\u014e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2"+
		"\5i\3\2\2\2\7s\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0080\3\2\2\2\17\u0082"+
		"\3\2\2\2\21\u0088\3\2\2\2\23\u008b\3\2\2\2\25\u008f\3\2\2\2\27\u0092\3"+
		"\2\2\2\31\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u00a0\3\2\2\2\37\u00a7\3\2"+
		"\2\2!\u00a9\3\2\2\2#\u00b2\3\2\2\2%\u00bb\3\2\2\2\'\u00c0\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00d1\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00da\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u00f2\3\2\2\2I\u00f4\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2"+
		"\2\2O\u00fc\3\2\2\2Q\u00ff\3\2\2\2S\u010a\3\2\2\2U\u010d\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u0129\3\2\2\2]\u012c\3\2\2\2_\u0136\3\2\2\2a"+
		"\u013a\3\2\2\2cd\7u\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7r\2\2h\4\3\2\2\2"+
		"ij\7i\2\2jk\7c\2\2kl\7o\2\2lm\7g\2\2mn\7/\2\2no\7n\2\2op\7q\2\2pq\7q\2"+
		"\2qr\7r\2\2r\6\3\2\2\2st\7h\2\2tu\7w\2\2uv\7p\2\2vw\7e\2\2wx\7v\2\2xy"+
		"\7k\2\2yz\7q\2\2z{\7p\2\2{\b\3\2\2\2|}\7*\2\2}\n\3\2\2\2~\177\7.\2\2\177"+
		"\f\3\2\2\2\u0080\u0081\7+\2\2\u0081\16\3\2\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7x\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2"+
		"\u0087\20\3\2\2\2\u0088\u0089\7/\2\2\u0089\u008a\7@\2\2\u008a\22\3\2\2"+
		"\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\24\3"+
		"\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091\26\3\2\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096"+
		"\30\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7q\2\2\u0099\32\3\2\2\2\u009a"+
		"\u009b\7y\2\2\u009b\u009c\7j\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7g\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7"+
		"g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8 \3\2\2\2\u00a9\u00aa"+
		"\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7{\2\2"+
		"\u00b1\"\3\2\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7j"+
		"\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\u00ba\7t\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf&\3\2\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3(\3\2\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"*\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2"+
		"\u00d0,\3\2\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7k\2"+
		"\2\u00d4\u00d5\7f\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7]\2\2\u00d7\60\3\2\2"+
		"\2\u00d8\u00d9\7_\2\2\u00d9\62\3\2\2\2\u00da\u00db\7?\2\2\u00db\64\3\2"+
		"\2\2\u00dc\u00dd\7#\2\2\u00dd\66\3\2\2\2\u00de\u00df\7-\2\2\u00df8\3\2"+
		"\2\2\u00e0\u00e1\7/\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e4"+
		"\7-\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\7/\2\2\u00e7>\3"+
		"\2\2\2\u00e8\u00e9\7,\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7\61\2\2\u00ebB\3"+
		"\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7(\2\2\u00eeD\3\2\2\2\u00ef\u00f0"+
		"\7~\2\2\u00f0\u00f1\7~\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3H\3"+
		"\2\2\2\u00f4\u00f5\7>\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbN\3"+
		"\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00feP\3\2\2\2\u00ff\u0100"+
		"\7\f\2\2\u0100R\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7w\2\2\u0104\u010b\7g\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109\u010b\7g\2\2\u010a\u0101\3\2\2"+
		"\2\u010a\u0105\3\2\2\2\u010bT\3\2\2\2\u010c\u010e\t\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0114\3\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115V\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bX\3\2\2\2\u011c\u011e\t\4\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u0123\7\60\2\2\u0122\u0124\t\4\2\2"+
		"\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"Z\3\2\2\2\u0129\u012a\7^\2\2\u012a\u012b\t\5\2\2\u012b\\\3\2\2\2\u012c"+
		"\u0131\7$\2\2\u012d\u0130\5[.\2\u012e\u0130\n\6\2\2\u012f\u012d\3\2\2"+
		"\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7$\2\2\u0135"+
		"^\3\2\2\2\u0136\u0137\t\7\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\60\2\2"+
		"\u0139`\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7\61\2\2\u013c\u0140"+
		"\3\2\2\2\u013d\u013f\n\b\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0144\b\61\2\2\u0144b\3\2\2\2\r\2\u010a\u010f\u0114\u011a\u011f"+
		"\u0125\u0127\u012f\u0131\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}