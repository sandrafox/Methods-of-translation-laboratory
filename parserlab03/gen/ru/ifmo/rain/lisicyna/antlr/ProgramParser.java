// Generated from C:/Users/1/Documents/MTLabs/parserlab03/src/ru/ifmo/rain/lisicyna/antlr\Program.g4 by ANTLR 4.7
package ru.ifmo.rain.lisicyna.antlr;

import java.util.*;
import java.io.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		ID=10, WS=11, ST=12, AND=13, OR=14, XOR=15, NOT=16, ADD=17, SUB=18, MUL=19, 
		DIV=20, LT=21, TT=22, EQ=23, LTE=24, TTE=25, NE=26, SR=27, SL=28;
	public static final int
		RULE_s = 0, RULE_program = 1, RULE_ifend = 2, RULE_ifstat = 3, RULE_operation = 4, 
		RULE_assignment = 5, RULE_expr = 6, RULE_logExpr = 7, RULE_mtExpr = 8;
	public static final String[] ruleNames = {
		"s", "program", "ifend", "ifstat", "operation", "assignment", "expr", 
		"logExpr", "mtExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'if'", "'begin'", "'end'", "'print'", "'='", "'true'", "'false'", 
		null, null, null, null, "'&&'", "'||'", "'^'", "'!'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'>>'", "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INT", "ID", "WS", 
		"ST", "AND", "OR", "XOR", "NOT", "ADD", "SUB", "MUL", "DIV", "LT", "TT", 
		"EQ", "LTE", "TTE", "NE", "SR", "SL"
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


	String TAB = "    ";
	public BufferedWriter w;

	String eval2(int op, String left, String right) {
	    String res = "(" + left + " ";
	    switch (op) {
	        case MUL : res += "*"; break;
	        case DIV : res += "/"; break;
	        case ADD : res += "+"; break;
	        case SUB : res += "-"; break;
	        case AND : res += "&&"; break;
	        case OR : res += "||"; break;
	        case XOR : res += "^"; break;
	        case LT : res += ">"; break;
	        case TT : res += "<"; break;
	        case EQ : res += "=="; break;
	        case NE : res += "!="; break;
	        case LTE : res += ">="; break;
	        case TTE : res += "<="; break;
	        case SR : res += ">>"; break;
	        case SL : res += "<<"; break;
	    }
	    res += " " + right + ")";
	    return res;
	}

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProgramParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SContext)_localctx).program = program(2);
				setState(19);
				match(EOF);

				   try {
				       w.write("public class Main {\n    public static void main(String[] args){\n" + ((SContext)_localctx).program.v + "    }\n}\n");
				       w.close();
				   } catch (IOException e) {}
				   
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{

				     try {
				         w.write("public class Main {\n}\n");
				     } catch (IOException e) {}
				     
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

	public static class ProgramContext extends ParserRuleContext {
		public int tabs;
		public String v;
		public OperationContext operation;
		public ProgramContext program;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProgramContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program(int tabs) throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState(), tabs);
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((ProgramContext)_localctx).operation = operation(_localctx.tabs);

				                  ((ProgramContext)_localctx).v =  ((ProgramContext)_localctx).operation.v + "\n";
				                  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((ProgramContext)_localctx).operation = operation(_localctx.tabs);
				setState(29);
				match(T__0);
				setState(30);
				((ProgramContext)_localctx).program = program(_localctx.tabs);

				          ((ProgramContext)_localctx).v =  ((ProgramContext)_localctx).program.v + "\n" + ((ProgramContext)_localctx).operation.v;
				          
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

	public static class IfendContext extends ParserRuleContext {
		public int tabs;
		public String v;
		public boolean c;
		public OperationContext b;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public IfendContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfendContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_ifend; }
	}

	public final IfendContext ifend(int tabs) throws RecognitionException {
		IfendContext _localctx = new IfendContext(_ctx, getState(), tabs);
		enterRule(_localctx, 4, RULE_ifend);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				if (!(_localctx.start != null && _input.LT(_localctx.start.getTokenIndex() + 1).getType() != 4)) throw new FailedPredicateException(this, "$start != null && _input.LT($start.getTokenIndex() + 1).getType() != 4");
				setState(36);
				match(T__0);
				setState(37);
				((IfendContext)_localctx).b = operation(_localctx.tabs + 1);

				        ((IfendContext)_localctx).v =  "";
				        for (int i = 0; i < _localctx.tabs; i++) {
				                              _localctx.v += TAB;
				                 }
				                 _localctx.v += "else {\n" + ((IfendContext)_localctx).b.v + "\n";
				                 for (int i = 0; i < _localctx.tabs; i++) {
				                                               _localctx.v += TAB;
				                                  }
				                 _localctx.v += "}\n";
				                 ((IfendContext)_localctx).c =  ((IfendContext)_localctx).b.c;
				                 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((IfendContext)_localctx).v =  "";
				         ((IfendContext)_localctx).c =  false;
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

	public static class IfstatContext extends ParserRuleContext {
		public int tabs;
		public String v;
		public boolean c;
		public LogExprContext logExpr;
		public OperationContext a;
		public IfendContext ifend;
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public IfendContext ifend() {
			return getRuleContext(IfendContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfstatContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat(int tabs) throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState(), tabs);
		enterRule(_localctx, 6, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__1);
			setState(44);
			match(T__0);
			setState(45);
			((IfstatContext)_localctx).logExpr = logExpr();
			setState(46);
			match(T__0);
			setState(47);
			((IfstatContext)_localctx).a = operation(_localctx.tabs + 1);
			setState(48);
			((IfstatContext)_localctx).ifend = ifend(_localctx.tabs);

			         ((IfstatContext)_localctx).v =  "";
			         for (int i = 0; i < _localctx.tabs; i++) {
			             _localctx.v += TAB;
			         }
			         _localctx.v += "if (" + ((IfstatContext)_localctx).logExpr.v + ") {\n" + ((IfstatContext)_localctx).a.v + "\n";
			         for (int i = 0; i < _localctx.tabs; i++) {
			             _localctx.v += TAB;
			         }
			         _localctx.v += "}\n";
			         _localctx.v += ((IfstatContext)_localctx).ifend.v;
			         if (((IfstatContext)_localctx).ifend.v.equals(""))
			             ((IfstatContext)_localctx).c =  ((IfstatContext)_localctx).a.c;
			         else
			             ((IfstatContext)_localctx).c =  ((IfstatContext)_localctx).ifend.c;
			         
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

	public static class OperationContext extends ParserRuleContext {
		public int tabs;
		public String v;
		public boolean c;
		public AssignmentContext a;
		public ProgramContext b;
		public ExprContext expr;
		public IfstatContext ifstat;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OperationContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation(int tabs) throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState(), tabs);
		enterRule(_localctx, 8, RULE_operation);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((OperationContext)_localctx).a = assignment(_localctx.tabs);

				            ((OperationContext)_localctx).v =  ((OperationContext)_localctx).a.v + ";";
				            ((OperationContext)_localctx).c =  true;
				            
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__2);
				setState(55);
				match(T__0);
				setState(56);
				((OperationContext)_localctx).b = program(_localctx.tabs + 1);
				setState(57);
				match(T__0);
				setState(58);
				match(T__3);

				            ((OperationContext)_localctx).v =  "";
				            for (int i = 0; i < tabs; i++) {
				                _localctx.v += TAB;
				            }
				            _localctx.v += "{\n" + ((OperationContext)_localctx).b.v;
				            for (int i = 0; i < tabs; i++) {
				                _localctx.v += TAB;
				            }
				            _localctx.v += "}";
				            ((OperationContext)_localctx).c =  false;
				            
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__4);
				setState(62);
				match(T__0);
				setState(63);
				((OperationContext)_localctx).expr = expr();

				            ((OperationContext)_localctx).v =  "";
				            for (int i = 0; i < tabs; i++) {
				                _localctx.v += TAB;
				            }
				            _localctx.v += "System.out.println(" + ((OperationContext)_localctx).expr.v + ");";
				            ((OperationContext)_localctx).c =  true;
				            
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				((OperationContext)_localctx).ifstat = ifstat(_localctx.tabs);

				            ((OperationContext)_localctx).v =  ((OperationContext)_localctx).ifstat.v;
				            if (!((OperationContext)_localctx).ifstat.c)
				               _localctx.v += ";";
				            ((OperationContext)_localctx).c =  true;
				            
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

	public static class AssignmentContext extends ParserRuleContext {
		public int tabs;
		public String v;
		public Token ID;
		public LogExprContext logExpr;
		public MtExprContext mtExpr;
		public Token ST;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public MtExprContext mtExpr() {
			return getRuleContext(MtExprContext.class,0);
		}
		public TerminalNode ST() { return getToken(ProgramParser.ST, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignmentContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment(int tabs) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), tabs);
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__5);
				setState(72);
				match(T__0);
				setState(73);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(74);
				match(T__0);
				setState(75);
				((AssignmentContext)_localctx).logExpr = logExpr();

				             ((AssignmentContext)_localctx).v =  "";
				             for (int i = 0; i < tabs; i++) {
				                 _localctx.v += TAB;
				             }
				             _localctx.v += "boolean " + (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null) + " = " + ((AssignmentContext)_localctx).logExpr.v;
				             
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__5);
				setState(79);
				match(T__0);
				setState(80);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(81);
				match(T__0);
				setState(82);
				((AssignmentContext)_localctx).mtExpr = mtExpr();

				             ((AssignmentContext)_localctx).v =  "";
				             for (int i = 0; i < tabs; i++) {
				                 _localctx.v += TAB;
				             }
				             _localctx.v += "int " + (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null) + " = " + ((AssignmentContext)_localctx).mtExpr.v;
				             
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__5);
				setState(86);
				match(T__0);
				setState(87);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(88);
				match(T__0);
				setState(89);
				((AssignmentContext)_localctx).ST = match(ST);

				             ((AssignmentContext)_localctx).v =  "";
				             for (int i = 0; i < tabs; i++) {
				                 _localctx.v += TAB;
				             }
				             _localctx.v += "String " + (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null) + " = " + (((AssignmentContext)_localctx).ST!=null?((AssignmentContext)_localctx).ST.getText():null);
				             
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
		public String v;
		public LogExprContext logExpr;
		public MtExprContext mtExpr;
		public Token ST;
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public MtExprContext mtExpr() {
			return getRuleContext(MtExprContext.class,0);
		}
		public TerminalNode ST() { return getToken(ProgramParser.ST, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((ExprContext)_localctx).logExpr = logExpr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).logExpr.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((ExprContext)_localctx).mtExpr = mtExpr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).mtExpr.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				((ExprContext)_localctx).ST = match(ST);
				((ExprContext)_localctx).v =  (((ExprContext)_localctx).ST!=null?((ExprContext)_localctx).ST.getText():null);
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

	public static class LogExprContext extends ParserRuleContext {
		public String v;
		public Token op;
		public LogExprContext a;
		public LogExprContext b;
		public MtExprContext c;
		public MtExprContext d;
		public Token ID;
		public List<LogExprContext> logExpr() {
			return getRuleContexts(LogExprContext.class);
		}
		public LogExprContext logExpr(int i) {
			return getRuleContext(LogExprContext.class,i);
		}
		public List<MtExprContext> mtExpr() {
			return getRuleContexts(MtExprContext.class);
		}
		public MtExprContext mtExpr(int i) {
			return getRuleContext(MtExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public LogExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logExpr; }
	}

	public final LogExprContext logExpr() throws RecognitionException {
		LogExprContext _localctx = new LogExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logExpr);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((LogExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
					((LogExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				match(T__0);
				setState(105);
				((LogExprContext)_localctx).a = logExpr();
				setState(106);
				match(T__0);
				setState(107);
				((LogExprContext)_localctx).b = logExpr();
				((LogExprContext)_localctx).v =  eval2((((LogExprContext)_localctx).op!=null?((LogExprContext)_localctx).op.getType():0), ((LogExprContext)_localctx).a.v, ((LogExprContext)_localctx).b.v);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NOT);
				setState(111);
				match(T__0);
				setState(112);
				((LogExprContext)_localctx).a = logExpr();
				((LogExprContext)_localctx).v =  "!" + ((LogExprContext)_localctx).a.v;
				}
				break;
			case LT:
			case TT:
			case EQ:
			case LTE:
			case TTE:
			case NE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				((LogExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << TT) | (1L << EQ) | (1L << LTE) | (1L << TTE) | (1L << NE))) != 0)) ) {
					((LogExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(T__0);
				setState(117);
				((LogExprContext)_localctx).c = mtExpr();
				setState(118);
				match(T__0);
				setState(119);
				((LogExprContext)_localctx).d = mtExpr();
				((LogExprContext)_localctx).v =  eval2((((LogExprContext)_localctx).op!=null?((LogExprContext)_localctx).op.getType():0), ((LogExprContext)_localctx).c.v, ((LogExprContext)_localctx).d.v);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__6);
				((LogExprContext)_localctx).v =  "true";
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(T__7);
				((LogExprContext)_localctx).v =  "false";
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				((LogExprContext)_localctx).ID = match(ID);
				((LogExprContext)_localctx).v =  (((LogExprContext)_localctx).ID!=null?((LogExprContext)_localctx).ID.getText():null);
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

	public static class MtExprContext extends ParserRuleContext {
		public String v;
		public Token op;
		public MtExprContext a;
		public MtExprContext b;
		public Token INT;
		public Token ID;
		public List<MtExprContext> mtExpr() {
			return getRuleContexts(MtExprContext.class);
		}
		public MtExprContext mtExpr(int i) {
			return getRuleContext(MtExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(ProgramParser.INT, 0); }
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public MtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mtExpr; }
	}

	public final MtExprContext mtExpr() throws RecognitionException {
		MtExprContext _localctx = new MtExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mtExpr);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case SR:
			case SL:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((MtExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << SR) | (1L << SL))) != 0)) ) {
					((MtExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(T__0);
				setState(132);
				((MtExprContext)_localctx).a = mtExpr();
				setState(133);
				match(T__0);
				setState(134);
				((MtExprContext)_localctx).b = mtExpr();
				((MtExprContext)_localctx).v =  eval2((((MtExprContext)_localctx).op!=null?((MtExprContext)_localctx).op.getType():0), ((MtExprContext)_localctx).a.v, ((MtExprContext)_localctx).b.v);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((MtExprContext)_localctx).INT = match(INT);
				((MtExprContext)_localctx).v =  (((MtExprContext)_localctx).INT!=null?((MtExprContext)_localctx).INT.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((MtExprContext)_localctx).ID = match(ID);
				((MtExprContext)_localctx).v =  (((MtExprContext)_localctx).ID!=null?((MtExprContext)_localctx).ID.getText():null);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return ifend_sempred((IfendContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ifend_sempred(IfendContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.start != null && _input.LT(_localctx.start.getTokenIndex() + 1).getType() != 4;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6H"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bh\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0090\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\17"+
		"\21\3\2\27\34\4\2\23\26\35\36\2\u0099\2\31\3\2\2\2\4#\3\2\2\2\6+\3\2\2"+
		"\2\b-\3\2\2\2\nG\3\2\2\2\f]\3\2\2\2\16g\3\2\2\2\20\u0082\3\2\2\2\22\u008f"+
		"\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\27\b\2\1\2\27\32\3\2\2\2\30\32"+
		"\b\2\1\2\31\24\3\2\2\2\31\30\3\2\2\2\32\3\3\2\2\2\33\34\5\n\6\2\34\35"+
		"\b\3\1\2\35$\3\2\2\2\36\37\5\n\6\2\37 \7\3\2\2 !\5\4\3\2!\"\b\3\1\2\""+
		"$\3\2\2\2#\33\3\2\2\2#\36\3\2\2\2$\5\3\2\2\2%&\6\4\2\3&\'\7\3\2\2\'(\5"+
		"\n\6\2()\b\4\1\2),\3\2\2\2*,\b\4\1\2+%\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-."+
		"\7\4\2\2./\7\3\2\2/\60\5\20\t\2\60\61\7\3\2\2\61\62\5\n\6\2\62\63\5\6"+
		"\4\2\63\64\b\5\1\2\64\t\3\2\2\2\65\66\5\f\7\2\66\67\b\6\1\2\67H\3\2\2"+
		"\289\7\5\2\29:\7\3\2\2:;\5\4\3\2;<\7\3\2\2<=\7\6\2\2=>\b\6\1\2>H\3\2\2"+
		"\2?@\7\7\2\2@A\7\3\2\2AB\5\16\b\2BC\b\6\1\2CH\3\2\2\2DE\5\b\5\2EF\b\6"+
		"\1\2FH\3\2\2\2G\65\3\2\2\2G8\3\2\2\2G?\3\2\2\2GD\3\2\2\2H\13\3\2\2\2I"+
		"J\7\b\2\2JK\7\3\2\2KL\7\f\2\2LM\7\3\2\2MN\5\20\t\2NO\b\7\1\2O^\3\2\2\2"+
		"PQ\7\b\2\2QR\7\3\2\2RS\7\f\2\2ST\7\3\2\2TU\5\22\n\2UV\b\7\1\2V^\3\2\2"+
		"\2WX\7\b\2\2XY\7\3\2\2YZ\7\f\2\2Z[\7\3\2\2[\\\7\16\2\2\\^\b\7\1\2]I\3"+
		"\2\2\2]P\3\2\2\2]W\3\2\2\2^\r\3\2\2\2_`\5\20\t\2`a\b\b\1\2ah\3\2\2\2b"+
		"c\5\22\n\2cd\b\b\1\2dh\3\2\2\2ef\7\16\2\2fh\b\b\1\2g_\3\2\2\2gb\3\2\2"+
		"\2ge\3\2\2\2h\17\3\2\2\2ij\t\2\2\2jk\7\3\2\2kl\5\20\t\2lm\7\3\2\2mn\5"+
		"\20\t\2no\b\t\1\2o\u0083\3\2\2\2pq\7\22\2\2qr\7\3\2\2rs\5\20\t\2st\b\t"+
		"\1\2t\u0083\3\2\2\2uv\t\3\2\2vw\7\3\2\2wx\5\22\n\2xy\7\3\2\2yz\5\22\n"+
		"\2z{\b\t\1\2{\u0083\3\2\2\2|}\7\t\2\2}\u0083\b\t\1\2~\177\7\n\2\2\177"+
		"\u0083\b\t\1\2\u0080\u0081\7\f\2\2\u0081\u0083\b\t\1\2\u0082i\3\2\2\2"+
		"\u0082p\3\2\2\2\u0082u\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\t\4\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\7\3\2\2\u0088\u0089\5\22\n\2\u0089\u008a\b"+
		"\n\1\2\u008a\u0090\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u0090\b\n\1\2\u008d"+
		"\u008e\7\f\2\2\u008e\u0090\b\n\1\2\u008f\u0084\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\23\3\2\2\2\n\31#+G]g\u0082\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}