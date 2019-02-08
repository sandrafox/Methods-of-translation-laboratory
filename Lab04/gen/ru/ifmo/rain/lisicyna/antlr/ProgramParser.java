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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Regex=9, 
		AllCode=10, Start=11, NameRule=12, NameID=13, String=14, Code=15, Var=16, 
		NL=17, WS=18;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_members = 2, RULE_begin = 3, RULE_rule = 4, 
		RULE_init = 5, RULE_synVar = 6, RULE_nameRule = 7, RULE_description = 8, 
		RULE_nameID = 9, RULE_descriptionID = 10, RULE_symbol = 11;
	public static final String[] ruleNames = {
		"program", "header", "members", "begin", "rule", "init", "synVar", "nameRule", 
		"description", "nameID", "descriptionID", "symbol"
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

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public class Node {
	    public String name;
	    public List<List<Map.Entry<String, Map.Entry<String, String>>>> seqs = new ArrayList<>();
	    public boolean isTerminal;
	    public String inhVars;
	    public String synVars;
	    public String initCode;

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
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
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
			setState(24);
			begin();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(25);
				header();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(28);
				members();
				}
			}

			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				rule();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NameRule || _la==NameID );
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

	public static class HeaderContext extends ParserRuleContext {
		public String s;
		public Token Code;
		public TerminalNode Code() { return getToken(ProgramParser.Code, 0); }
		public TerminalNode NL() { return getToken(ProgramParser.NL, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			((HeaderContext)_localctx).Code = match(Code);
			setState(38);
			match(T__0);
			setState(39);
			match(NL);
			((HeaderContext)_localctx).s =  ((HeaderContext)_localctx).Code.getText();
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

	public static class MembersContext extends ParserRuleContext {
		public String s;
		public Token a;
		public List<TerminalNode> NL() { return getTokens(ProgramParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ProgramParser.NL, i);
		}
		public TerminalNode AllCode() { return getToken(ProgramParser.AllCode, 0); }
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);

		        ((MembersContext)_localctx).s =  "";
		        
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			match(NL);
			{
			setState(44);
			((MembersContext)_localctx).a = match(AllCode);
			_localctx.s +=((MembersContext)_localctx).a.getText();
			}
			setState(47);
			match(NL);
			setState(48);
			match(T__1);
			setState(49);
			match(NL);
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

	public static class BeginContext extends ParserRuleContext {
		public NameRuleContext nameRule() {
			return getRuleContext(NameRuleContext.class,0);
		}
		public TerminalNode NL() { return getToken(ProgramParser.NL, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Start);
			setState(52);
			match(T__2);
			setState(53);
			nameRule();
			setState(54);
			match(T__3);
			setState(55);
			match(NL);
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
		public Token Var;
		public SynVarContext synVar;
		public InitContext init;
		public DescriptionContext description;
		public NameIDContext nameID;
		public DescriptionIDContext descriptionID;
		public NameRuleContext nameRule() {
			return getRuleContext(NameRuleContext.class,0);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ProgramParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ProgramParser.NL, i);
		}
		public TerminalNode Var() { return getToken(ProgramParser.Var, 0); }
		public SynVarContext synVar() {
			return getRuleContext(SynVarContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
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
		enterRule(_localctx, 8, RULE_rule);

		     String s = null, s1 = null;
		     
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NameRule:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((RuleContext)_localctx).nameRule = nameRule();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(58);
					((RuleContext)_localctx).Var = match(Var);
					}
				}

				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(61);
					((RuleContext)_localctx).synVar = synVar();
					s = ((RuleContext)_localctx).synVar.s;
					}
				}

				setState(66);
				match(T__4);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(67);
					((RuleContext)_localctx).init = init();
					s1 = ((RuleContext)_localctx).init.s;
					}
				}

				setState(72);
				((RuleContext)_localctx).description = description();

				     ((RuleContext)_localctx).node =  new Node(((RuleContext)_localctx).nameRule.s);
				     _localctx.node.isTerminal = false;
				     if (((RuleContext)_localctx).Var != null) _localctx.node.inhVars = ((RuleContext)_localctx).Var.getText();
				     _localctx.node.synVars = s;
				     _localctx.node.initCode = s1;
				     _localctx.node.seqs.add(((RuleContext)_localctx).description.s);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(74);
					match(NL);
					setState(75);
					match(T__5);
					setState(76);
					((RuleContext)_localctx).description = description();
					_localctx.node.seqs.add(((RuleContext)_localctx).description.s);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__3);
				setState(85);
				match(NL);
				}
				break;
			case NameID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((RuleContext)_localctx).nameID = nameID();
				setState(88);
				match(T__4);
				setState(89);
				((RuleContext)_localctx).descriptionID = descriptionID();

				      ((RuleContext)_localctx).node =  new Node(((RuleContext)_localctx).nameID.s);
				      _localctx.node.isTerminal = true;
				      _localctx.node.seqs.add(((RuleContext)_localctx).descriptionID.s);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(91);
					match(NL);
					setState(92);
					match(T__5);
					setState(93);
					((RuleContext)_localctx).descriptionID = descriptionID();
					_localctx.node.seqs.add(((RuleContext)_localctx).descriptionID.s);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__3);
				setState(102);
				match(NL);
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

	public static class InitContext extends ParserRuleContext {
		public String s;
		public Token Code;
		public TerminalNode Code() { return getToken(ProgramParser.Code, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__6);
			setState(107);
			((InitContext)_localctx).Code = match(Code);
			((InitContext)_localctx).s =  ((InitContext)_localctx).Code.getText();
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

	public static class SynVarContext extends ParserRuleContext {
		public String s;
		public Token Var;
		public TerminalNode Var() { return getToken(ProgramParser.Var, 0); }
		public SynVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSynVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSynVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSynVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynVarContext synVar() throws RecognitionException {
		SynVarContext _localctx = new SynVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_synVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__7);
			setState(111);
			((SynVarContext)_localctx).Var = match(Var);
			((SynVarContext)_localctx).s =  ((SynVarContext)_localctx).Var.getText();
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
		public Token NameRule;
		public TerminalNode NameRule() { return getToken(ProgramParser.NameRule, 0); }
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
		enterRule(_localctx, 14, RULE_nameRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((NameRuleContext)_localctx).NameRule = match(NameRule);
			((NameRuleContext)_localctx).s =  ((NameRuleContext)_localctx).NameRule.getText();
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
		public List<Map.Entry<String, Map.Entry<String, String>>> s;
		public NameRuleContext nameRule;
		public Token Var;
		public Token Code;
		public NameIDContext nameID;
		public List<NameRuleContext> nameRule() {
			return getRuleContexts(NameRuleContext.class);
		}
		public NameRuleContext nameRule(int i) {
			return getRuleContext(NameRuleContext.class,i);
		}
		public List<NameIDContext> nameID() {
			return getRuleContexts(NameIDContext.class);
		}
		public NameIDContext nameID(int i) {
			return getRuleContext(NameIDContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ProgramParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ProgramParser.Var, i);
		}
		public List<TerminalNode> Code() { return getTokens(ProgramParser.Code); }
		public TerminalNode Code(int i) {
			return getToken(ProgramParser.Code, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_description);

		                ((DescriptionContext)_localctx).s =  new ArrayList<>();
		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NameRule:
					{
					setState(117);
					((DescriptionContext)_localctx).nameRule = nameRule();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Var) {
						{
						setState(118);
						((DescriptionContext)_localctx).Var = match(Var);
						}
					}

					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Code) {
						{
						setState(121);
						((DescriptionContext)_localctx).Code = match(Code);
						}
					}


					              String s = null;
					              if (((DescriptionContext)_localctx).Code != null) s = ((DescriptionContext)_localctx).Code.getText();
					              String s1 = null;
					              if (((DescriptionContext)_localctx).Var != null) s1 = ((DescriptionContext)_localctx).Var.getText();
					              _localctx.s.add(new AbstractMap.SimpleEntry<>(((DescriptionContext)_localctx).nameRule.s, new AbstractMap.SimpleEntry<>(s, s1)));
					}
					break;
				case NameID:
					{
					setState(126);
					((DescriptionContext)_localctx).nameID = nameID();
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Code) {
						{
						setState(127);
						((DescriptionContext)_localctx).Code = match(Code);
						}
					}


					              String s = null;
					              if (((DescriptionContext)_localctx).Code != null) s = ((DescriptionContext)_localctx).Code.getText();
					              _localctx.s.add(new AbstractMap.SimpleEntry<>(((DescriptionContext)_localctx).nameID.s, new AbstractMap.SimpleEntry<>(s, null)));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NameRule || _la==NameID );
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
		public Token NameID;
		public TerminalNode NameID() { return getToken(ProgramParser.NameID, 0); }
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
		enterRule(_localctx, 18, RULE_nameID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((NameIDContext)_localctx).NameID = match(NameID);
			((NameIDContext)_localctx).s =  ((NameIDContext)_localctx).NameID.getText();
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
		public List<Map.Entry<String, Map.Entry<String, String>>> s;
		public Token Regex;
		public TerminalNode Regex() { return getToken(ProgramParser.Regex, 0); }
		public DescriptionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterDescriptionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitDescriptionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDescriptionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionIDContext descriptionID() throws RecognitionException {
		DescriptionIDContext _localctx = new DescriptionIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_descriptionID);

		              ((DescriptionIDContext)_localctx).s =  new ArrayList<>();
		              
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((DescriptionIDContext)_localctx).Regex = match(Regex);

			              _localctx.s.add(new AbstractMap.SimpleEntry<>(((DescriptionIDContext)_localctx).Regex.getText(), null));
			              
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
		enterRule(_localctx, 22, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((SymbolContext)_localctx).String = match(String);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\5\6C\n\6\3\6\3\6\3\6"+
		"\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6c\n\6\f\6\16\6f\13\6\3"+
		"\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\5\nz\n\n\3\n\5\n}\n\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n\6\n\u0087"+
		"\n\n\r\n\16\n\u0088\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u0095\2\32\3\2\2\2\4&\3\2\2\2\6,"+
		"\3\2\2\2\b\65\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2\20t\3\2\2\2\22"+
		"\u0086\3\2\2\2\24\u008a\3\2\2\2\26\u008d\3\2\2\2\30\u0090\3\2\2\2\32\34"+
		"\5\b\5\2\33\35\5\4\3\2\34\33\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36 \5"+
		"\6\4\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#\5\n\6\2\"!\3\2\2\2#$\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&\'\7\3\2\2\'(\7\21\2\2()\7\3\2\2"+
		")*\7\23\2\2*+\b\3\1\2+\5\3\2\2\2,-\7\4\2\2-.\7\23\2\2./\7\f\2\2/\60\b"+
		"\4\1\2\60\61\3\2\2\2\61\62\7\23\2\2\62\63\7\4\2\2\63\64\7\23\2\2\64\7"+
		"\3\2\2\2\65\66\7\r\2\2\66\67\7\5\2\2\678\5\20\t\289\7\6\2\29:\7\23\2\2"+
		":\t\3\2\2\2;=\5\20\t\2<>\7\22\2\2=<\3\2\2\2=>\3\2\2\2>B\3\2\2\2?@\5\16"+
		"\b\2@A\b\6\1\2AC\3\2\2\2B?\3\2\2\2BC\3\2\2\2CD\3\2\2\2DH\7\7\2\2EF\5\f"+
		"\7\2FG\b\6\1\2GI\3\2\2\2HE\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\22\n\2KS\b"+
		"\6\1\2LM\7\23\2\2MN\7\b\2\2NO\5\22\n\2OP\b\6\1\2PR\3\2\2\2QL\3\2\2\2R"+
		"U\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\6\2\2WX\7\23\2\2"+
		"Xk\3\2\2\2YZ\5\24\13\2Z[\7\7\2\2[\\\5\26\f\2\\d\b\6\1\2]^\7\23\2\2^_\7"+
		"\b\2\2_`\5\26\f\2`a\b\6\1\2ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2db\3\2\2\2de"+
		"\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\6\2\2hi\7\23\2\2ik\3\2\2\2j;\3\2\2\2"+
		"jY\3\2\2\2k\13\3\2\2\2lm\7\t\2\2mn\7\21\2\2no\b\7\1\2o\r\3\2\2\2pq\7\n"+
		"\2\2qr\7\22\2\2rs\b\b\1\2s\17\3\2\2\2tu\7\16\2\2uv\b\t\1\2v\21\3\2\2\2"+
		"wy\5\20\t\2xz\7\22\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\7\21\2\2|{\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\n\1\2\177\u0087\3\2\2\2\u0080\u0082\5"+
		"\24\13\2\u0081\u0083\7\21\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\b\n\1\2\u0085\u0087\3\2\2\2\u0086w\3"+
		"\2\2\2\u0086\u0080\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\b\13"+
		"\1\2\u008c\25\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\b\f\1\2\u008f\27"+
		"\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\b\r\1\2\u0092\31\3\2\2\2\20"+
		"\34\37$=BHSdjy|\u0082\u0086\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}