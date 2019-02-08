// Generated from C:/Users/1/Documents/MTLabs/Lab04/src/ru/ifmo/rain/lisicyna/antlr\Program.g4 by ANTLR 4.7
package ru.ifmo.rain.lisicyna.antlr;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Regex=9, 
		AllCode=10, Start=11, NameRule=12, NameID=13, String=14, Code=15, Var=16, 
		NL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Regex", 
		"AllCode", "Start", "NameRule", "NameID", "String", "Code", "Var", "NL", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@header'", "'@members'", "'='", "';'", "':'", "'|'", "'@init'", 
		"'returns'", null, null, "'start'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Regex", "AllCode", 
		"Start", "NameRule", "NameID", "String", "Code", "Var", "NL", "WS"
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nS\n\n\f\n\16\nV\13"+
		"\n\3\n\3\n\3\13\3\13\6\13\\\n\13\r\13\16\13]\7\13`\n\13\f\13\16\13c\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\ro\n\r\f\r\16\rr\13\r"+
		"\3\16\3\16\7\16v\n\16\f\16\16\16y\13\16\3\17\3\17\3\17\3\17\7\17\177\n"+
		"\17\f\17\16\17\u0082\13\17\3\17\3\17\3\20\3\20\7\20\u0088\n\20\f\20\16"+
		"\20\u008b\13\20\3\20\3\20\3\21\3\21\7\21\u0091\n\21\f\21\16\21\u0094\13"+
		"\21\3\21\3\21\3\22\5\22\u0099\n\22\3\22\3\22\3\23\6\23\u009e\n\23\r\23"+
		"\16\23\u009f\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\13\5\2\f\f\17\17))"+
		"\3\2%%\3\2c|\6\2\62;C\\aac|\3\2C\\\3\2$$\4\2}}\177\177\4\2>>@@\5\2\13"+
		"\f\17\17\"\"\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\78\3\2\2\2"+
		"\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21F\3\2\2\2\23N\3\2\2\2"+
		"\25Y\3\2\2\2\27f\3\2\2\2\31l\3\2\2\2\33s\3\2\2\2\35z\3\2\2\2\37\u0085"+
		"\3\2\2\2!\u008e\3\2\2\2#\u0098\3\2\2\2%\u009d\3\2\2\2\'(\7B\2\2()\7j\2"+
		"\2)*\7g\2\2*+\7c\2\2+,\7f\2\2,-\7g\2\2-.\7t\2\2.\4\3\2\2\2/\60\7B\2\2"+
		"\60\61\7o\2\2\61\62\7g\2\2\62\63\7o\2\2\63\64\7d\2\2\64\65\7g\2\2\65\66"+
		"\7t\2\2\66\67\7u\2\2\67\6\3\2\2\289\7?\2\29\b\3\2\2\2:;\7=\2\2;\n\3\2"+
		"\2\2<=\7<\2\2=\f\3\2\2\2>?\7~\2\2?\16\3\2\2\2@A\7B\2\2AB\7k\2\2BC\7p\2"+
		"\2CD\7k\2\2DE\7v\2\2E\20\3\2\2\2FG\7t\2\2GH\7g\2\2HI\7v\2\2IJ\7w\2\2J"+
		"K\7t\2\2KL\7p\2\2LM\7u\2\2M\22\3\2\2\2NT\7)\2\2OS\n\2\2\2PQ\7^\2\2QS\7"+
		")\2\2RO\3\2\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3"+
		"\2\2\2WX\7)\2\2X\24\3\2\2\2Ya\7%\2\2Z\\\n\3\2\2[Z\3\2\2\2\\]\3\2\2\2]"+
		"[\3\2\2\2]^\3\2\2\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bd\3\2\2\2ca\3\2\2\2de\7%\2\2e\26\3\2\2\2fg\7u\2\2gh\7v\2\2hi\7c\2\2i"+
		"j\7t\2\2jk\7v\2\2k\30\3\2\2\2lp\t\4\2\2mo\t\5\2\2nm\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\32\3\2\2\2rp\3\2\2\2sw\t\6\2\2tv\t\5\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\34\3\2\2\2yw\3\2\2\2z\u0080\7$\2\2{"+
		"\177\n\7\2\2|}\7^\2\2}\177\7$\2\2~{\3\2\2\2~|\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7$\2\2\u0084\36\3\2\2\2\u0085\u0089\7}\2\2\u0086"+
		"\u0088\n\b\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\177\2\2\u008d \3\2\2\2\u008e\u0092\7>\2\2\u008f\u0091\n\t\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7@\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009b\7\f\2\2\u009b$\3\2\2\2\u009c\u009e"+
		"\t\n\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\23\2\2\u00a2&\3\2\2\2"+
		"\17\2RT]apw~\u0080\u0089\u0092\u0098\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}