// Generated from C:/Users/1/Documents/MTLabs/Lab04/src/ru/ifmo/rain/lisicyna/antlr\Program.g4 by ANTLR 4.7
package ru.ifmo.rain.lisicyna.antlr;

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, String=15, NameChar=16, 
		NameRuleStart=17, NameIDStart=18, Symbol=19, WhiteSpace=20, WS=21;
	public static final int
		RULE_program = 0, RULE_rule = 1, RULE_nameRule = 2, RULE_description = 3, 
		RULE_alternative = 4, RULE_nameID = 5, RULE_descriptionID = 6, RULE_symbol = 7;
	public static final String[] ruleNames = {
		"program", "rule", "nameRule", "description", "alternative", "nameID", 
		"descriptionID", "symbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "'\n'", "':'", "'|'", "';\n'", "'+'", "'*'", 
		"'?'", "'('", "')'", "'-'", "'''", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "String", "NameChar", "NameRuleStart", "NameIDStart", 
		"Symbol", "WhiteSpace", "WS"
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
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	class Node {
	    String name;
	    List<List<String>> seqs = new ArrayList<>();
	    boolean isTerminal;

	    public Node(String name) {
	        this.name = name;
	    }
	}

	List<Node> terminals = new ArrayList<>();
	Map<String, Node> nodes = new HashMap<>();
	Map<String, String> literals = new HashMap<>();

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NameChar() { return getTokens(ProgramParser.NameChar); }
		public TerminalNode NameChar(int i) {
			return getToken(ProgramParser.NameChar, i);
		}
		public List<RuleContext> rule() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				match(NameChar);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NameChar );
			setState(22);
			match(T__1);
			setState(23);
			match(T__2);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				rule();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NameRuleStart || _la==NameIDStart );
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

	public static class RuleContext extends ParserRuleContext {
		public Node node;
		public NameRuleContext nameRule;
		public DescriptionContext description;
		public NameRuleContext nameRule() {
			return getRuleContext(NameRuleContext.class,0);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public NameIDContext nameID() {
			return getRuleContext(NameIDContext.class,0);
		}
		public List<DescriptionIDContext> descriptionID() {
			return getRuleContexts(DescriptionIDContext.class);
		}
		public DescriptionIDContext descriptionID(int i) {
			return getRuleContext(DescriptionIDContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NameRuleStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((RuleContext)_localctx).nameRule = nameRule();
				setState(30);
				match(T__3);
				setState(31);
				((RuleContext)_localctx).description = description();

				     Node node = new Node(((RuleContext)_localctx).nameRule.s);
				     node.seqs.add(((RuleContext)_localctx).description.s);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(33);
					match(T__2);
					setState(34);
					match(T__4);
					setState(35);
					((RuleContext)_localctx).description = description();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(T__5);
				}
				break;
			case NameIDStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				nameID();
				setState(44);
				match(T__3);
				setState(45);
				descriptionID();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(46);
					match(T__2);
					setState(47);
					match(T__4);
					setState(48);
					descriptionID();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__5);
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

	public static class NameRuleContext extends ParserRuleContext {
		public String s;
		public Token NameRuleStart;
		public Token NameChar;
		public TerminalNode NameRuleStart() { return getToken(ProgramParser.NameRuleStart, 0); }
		public List<TerminalNode> NameChar() { return getTokens(ProgramParser.NameChar); }
		public TerminalNode NameChar(int i) {
			return getToken(ProgramParser.NameChar, i);
		}
		public NameRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNameRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNameRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitNameRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameRuleContext nameRule() throws RecognitionException {
		NameRuleContext _localctx = new NameRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((NameRuleContext)_localctx).NameRuleStart = match(NameRuleStart);
			((NameRuleContext)_localctx).s =  ((NameRuleContext)_localctx).NameRuleStart.getText();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NameChar) {
				{
				{
				setState(60);
				((NameRuleContext)_localctx).NameChar = match(NameChar);
				_localctx.s += ((NameRuleContext)_localctx).NameChar.getText();
				}
				}
				setState(66);
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

	public static class DescriptionContext extends ParserRuleContext {
		public List<String> s;
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
	 
		public DescriptionContext() { }
		public void copyFrom(DescriptionContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class SequenceContext extends DescriptionContext {
		public NameIDContext nameID;
		public SymbolContext symbol;
		public NameRuleContext nameRule;
		public List<NameIDContext> nameID() {
			return getRuleContexts(NameIDContext.class);
		}
		public NameIDContext nameID(int i) {
			return getRuleContext(NameIDContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<NameRuleContext> nameRule() {
			return getRuleContexts(NameRuleContext.class);
		}
		public NameRuleContext nameRule(int i) {
			return getRuleContext(NameRuleContext.class,i);
		}
		public SequenceContext(DescriptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_description);

		                ((DescriptionContext)_localctx).s =  new ArrayList<>();
		            
		int _la;
		try {
			_localctx = new SequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NameIDStart:
					{
					setState(67);
					((SequenceContext)_localctx).nameID = nameID();
					_localctx.s.add(((SequenceContext)_localctx).nameID.s);
					}
					break;
				case T__12:
					{
					setState(70);
					((SequenceContext)_localctx).symbol = symbol();

					              if (literals.containsKey(((SequenceContext)_localctx).symbol.s)) {
					                  _localctx.s.add(literals.get(((SequenceContext)_localctx).symbol.s));
					              } else {
					                  Node node = new Node("T_" + literals.keySet().size());
					                  node.isTerminal = true;
					                  List<String> temp = new ArrayList<>();
					                  temp.add(((SequenceContext)_localctx).symbol.s);
					                  node.seqs.add(temp);
					                  literals.put(((SequenceContext)_localctx).symbol.s, node.name);
					                  nodes.put(node.name, node);
					              }
					              
					}
					break;
				case NameRuleStart:
					{
					setState(73);
					((SequenceContext)_localctx).nameRule = nameRule();
					_localctx.s.add(((SequenceContext)_localctx).nameRule.s);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(78);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << NameRuleStart) | (1L << NameIDStart))) != 0) );
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__9);
			setState(86);
			symbol();
			setState(87);
			match(T__4);
			setState(88);
			symbol();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(89);
				match(T__4);
				setState(90);
				symbol();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__10);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				setState(97);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class NameIDContext extends ParserRuleContext {
		public String s;
		public Token NameIDStart;
		public TerminalNode NameIDStart() { return getToken(ProgramParser.NameIDStart, 0); }
		public List<TerminalNode> NameChar() { return getTokens(ProgramParser.NameChar); }
		public TerminalNode NameChar(int i) {
			return getToken(ProgramParser.NameChar, i);
		}
		public NameIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNameID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNameID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitNameID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameIDContext nameID() throws RecognitionException {
		NameIDContext _localctx = new NameIDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nameID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((NameIDContext)_localctx).NameIDStart = match(NameIDStart);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NameChar) {
				{
				{
				setState(101);
				match(NameChar);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((NameIDContext)_localctx).s =  ((NameIDContext)_localctx).NameIDStart.getText();
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

	public static class DescriptionIDContext extends ParserRuleContext {
		public String s;
		public DescriptionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionID; }
	 
		public DescriptionIDContext() { }
		public void copyFrom(DescriptionIDContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class IntervalContext extends DescriptionIDContext {
		public Token a;
		public Token b;
		public List<TerminalNode> Symbol() { return getTokens(ProgramParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(ProgramParser.Symbol, i);
		}
		public IntervalContext(DescriptionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneSymbolContext extends DescriptionIDContext {
		public SymbolContext a;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public OneSymbolContext(DescriptionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterOneSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitOneSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitOneSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionIDContext descriptionID() throws RecognitionException {
		DescriptionIDContext _localctx = new DescriptionIDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_descriptionID);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new OneSymbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((OneSymbolContext)_localctx).a = symbol();

				              ((OneSymbolContext)_localctx).s =  ((OneSymbolContext)_localctx).a.s;
				              
				}
				break;
			case 2:
				_localctx = new IntervalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__12);
				setState(113);
				((IntervalContext)_localctx).a = match(Symbol);
				setState(114);
				match(T__12);
				setState(115);
				match(T__13);
				setState(116);
				match(T__12);
				setState(117);
				((IntervalContext)_localctx).b = match(Symbol);
				setState(118);
				match(T__12);
				((IntervalContext)_localctx).s =  "'" + ((IntervalContext)_localctx).a.getText() + "'..'" + ((IntervalContext)_localctx).b.getText() + "'";
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

	public static class SymbolContext extends ParserRuleContext {
		public String s;
		public Token String;
		public TerminalNode String() { return getToken(ProgramParser.String, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__12);
			setState(123);
			((SymbolContext)_localctx).String = match(String);
			setState(124);
			match(T__12);
			((SymbolContext)_localctx).s =  ((SymbolContext)_localctx).String.getText();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\7\4A\n\4\f"+
		"\4\16\4D\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\5\5R\n"+
		"\5\6\5T\n\5\r\5\16\5U\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6"+
		"\3\6\3\6\5\6e\n\6\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\t\2\2"+
		"\n\2\4\6\b\n\f\16\20\2\4\3\2\t\13\5\2\t\t\13\13\16\16\2\u0087\2\22\3\2"+
		"\2\2\4:\3\2\2\2\6<\3\2\2\2\bS\3\2\2\2\nW\3\2\2\2\ff\3\2\2\2\16z\3\2\2"+
		"\2\20|\3\2\2\2\22\24\7\3\2\2\23\25\7\22\2\2\24\23\3\2\2\2\25\26\3\2\2"+
		"\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\4\2\2\31\33\7\5\2"+
		"\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\3\3\2\2\2\37 \5\6\4\2 !\7\6\2\2!\"\5\b\5\2\"(\b\3\1\2#$\7\5\2\2"+
		"$%\7\7\2\2%\'\5\b\5\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2"+
		"\2*(\3\2\2\2+,\7\b\2\2,;\3\2\2\2-.\5\f\7\2./\7\6\2\2/\65\5\16\b\2\60\61"+
		"\7\5\2\2\61\62\7\7\2\2\62\64\5\16\b\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\b\2\29;\3\2\2\2:"+
		"\37\3\2\2\2:-\3\2\2\2;\5\3\2\2\2<=\7\23\2\2=B\b\4\1\2>?\7\22\2\2?A\b\4"+
		"\1\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\5"+
		"\f\7\2FG\b\5\1\2GO\3\2\2\2HI\5\20\t\2IJ\b\5\1\2JO\3\2\2\2KL\5\6\4\2LM"+
		"\b\5\1\2MO\3\2\2\2NE\3\2\2\2NH\3\2\2\2NK\3\2\2\2OQ\3\2\2\2PR\t\2\2\2Q"+
		"P\3\2\2\2QR\3\2\2\2RT\3\2\2\2SN\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\t\3\2\2\2WX\7\f\2\2XY\5\20\t\2YZ\7\7\2\2Z_\5\20\t\2[\\\7\7\2\2\\^\5"+
		"\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bd"+
		"\7\r\2\2ce\t\3\2\2dc\3\2\2\2de\3\2\2\2e\13\3\2\2\2fj\7\24\2\2gi\7\22\2"+
		"\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\b\7\1"+
		"\2n\r\3\2\2\2op\5\20\t\2pq\b\b\1\2q{\3\2\2\2rs\7\17\2\2st\7\25\2\2tu\7"+
		"\17\2\2uv\7\20\2\2vw\7\17\2\2wx\7\25\2\2xy\7\17\2\2y{\b\b\1\2zo\3\2\2"+
		"\2zr\3\2\2\2{\17\3\2\2\2|}\7\17\2\2}~\7\21\2\2~\177\7\17\2\2\177\u0080"+
		"\b\t\1\2\u0080\21\3\2\2\2\17\26\35(\65:BNQU_djz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}