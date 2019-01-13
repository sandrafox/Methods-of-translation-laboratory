// Generated from C:/Users/1/Documents/MTLabs/Lab04/src/ru/ifmo/rain/lisicyna/antlr\Program.g4 by ANTLR 4.7
package ru.ifmo.rain.lisicyna.antlr;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(ProgramParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#nameRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameRule(ProgramParser.NameRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link ProgramParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ProgramParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ProgramParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#nameID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameID(ProgramParser.NameIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneSymbol}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneSymbol(ProgramParser.OneSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interval}
	 * labeled alternative in {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(ProgramParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(ProgramParser.SymbolContext ctx);
}