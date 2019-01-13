// Generated from C:/Users/1/Documents/MTLabs/Lab04/src/ru/ifmo/rain/lisicyna/antlr\Program.g4 by ANTLR 4.7
package ru.ifmo.rain.lisicyna.antlr;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(ProgramParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(ProgramParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#nameRule}.
	 * @param ctx the parse tree
	 */
	void enterNameRule(ProgramParser.NameRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#nameRule}.
	 * @param ctx the parse tree
	 */
	void exitNameRule(ProgramParser.NameRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link ProgramParser#description}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ProgramParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link ProgramParser#description}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ProgramParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ProgramParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ProgramParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#nameID}.
	 * @param ctx the parse tree
	 */
	void enterNameID(ProgramParser.NameIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#nameID}.
	 * @param ctx the parse tree
	 */
	void exitNameID(ProgramParser.NameIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneSymbol}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void enterOneSymbol(ProgramParser.OneSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneSymbol}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void exitOneSymbol(ProgramParser.OneSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interval}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ProgramParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interval}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ProgramParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ProgramParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ProgramParser.SymbolContext ctx);
}