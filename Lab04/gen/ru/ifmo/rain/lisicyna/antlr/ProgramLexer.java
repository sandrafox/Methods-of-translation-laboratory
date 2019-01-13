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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, String=12, NameChar=13, NameRuleStart=14, NameIDStart=15, 
		Symbol=16, WhiteSpace=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "String", "NameChar", "NameRuleStart", "NameIDStart", 
		"Symbol", "WhiteSpace", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "'\n'", "':'", "'|'", "';\n'", "'+'", "'*'", 
		"'?'", "'''", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"String", "NameChar", "NameRuleStart", "NameIDStart", "Symbol", "WhiteSpace", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\6\r"+
		"G\n\r\r\r\16\rH\3\16\3\16\3\16\5\16N\n\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\5\21V\n\21\3\22\3\22\3\23\6\23[\n\23\r\23\16\23\\\3\23\3\23\2\2\24\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\3\2\5\4\2\62;aa\5\2\n\f\17\17\"\"\5\2\13\f\17\17\"\"\2"+
		"d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65"+
		"\3\2\2\2\r\67\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2"+
		"\27B\3\2\2\2\31F\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37Q\3\2\2\2!U\3\2\2\2"+
		"#W\3\2\2\2%Z\3\2\2\2\'(\7i\2\2()\7t\2\2)*\7c\2\2*+\7o\2\2+,\7o\2\2,-\7"+
		"c\2\2-.\7t\2\2.\4\3\2\2\2/\60\7=\2\2\60\6\3\2\2\2\61\62\7\f\2\2\62\b\3"+
		"\2\2\2\63\64\7<\2\2\64\n\3\2\2\2\65\66\7~\2\2\66\f\3\2\2\2\678\7=\2\2"+
		"89\7\f\2\29\16\3\2\2\2:;\7-\2\2;\20\3\2\2\2<=\7,\2\2=\22\3\2\2\2>?\7A"+
		"\2\2?\24\3\2\2\2@A\7)\2\2A\26\3\2\2\2BC\7\60\2\2CD\7\60\2\2D\30\3\2\2"+
		"\2EG\5!\21\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\32\3\2\2\2JN\5\35"+
		"\17\2KN\5\37\20\2LN\t\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\34\3\2\2\2"+
		"OP\4c|\2P\36\3\2\2\2QR\4C\\\2R \3\2\2\2SV\4#\u0080\2TV\5#\22\2US\3\2\2"+
		"\2UT\3\2\2\2V\"\3\2\2\2WX\t\3\2\2X$\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[\\\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\23\2\2_&\3\2\2\2\7\2HMU\\\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}