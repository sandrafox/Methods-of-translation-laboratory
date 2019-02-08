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
	 * Enter a parse tree produced by {@link ProgramParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ProgramParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ProgramParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(ProgramParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(ProgramParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(ProgramParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(ProgramParser.BeginContext ctx);
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
	 * Enter a parse tree produced by {@link ProgramParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ProgramParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ProgramParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#synVar}.
	 * @param ctx the parse tree
	 */
	void enterSynVar(ProgramParser.SynVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#synVar}.
	 * @param ctx the parse tree
	 */
	void exitSynVar(ProgramParser.SynVarContext ctx);
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
	 * Enter a parse tree produced by {@link ProgramParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(ProgramParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(ProgramParser.DescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionID(ProgramParser.DescriptionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#descriptionID}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionID(ProgramParser.DescriptionIDContext ctx);
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