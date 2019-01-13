package ru.ifmo.rain.lisicyna;

import jdk.nashorn.internal.ir.TernaryNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import ru.ifmo.rain.lisicyna.antlr.ProgramBaseVisitor;
import ru.ifmo.rain.lisicyna.antlr.ProgramParser;
import ru.ifmo.rain.lisicyna.antlr.ProgramVisitor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Parser extends ProgramBaseVisitor {
    BufferedWriter writer;
    Map<String, List<String>> terminals = new HashMap<>();
    Set<String> literals = new HashSet<>();
    String name;

    private void generateTokens() throws IOException {
        String fileName = name + "Tokens";
        BufferedWriter writerT = Files.newBufferedWriter(Paths.get(fileName + ".java"), Charset.forName("UTF-8"));
        writerT.write("enum " + fileName + " {");
        writerT.newLine();
        writerT.write("    ");

    }

    private void generateLexer() throws IOException {
        String fileName = name + "Lexer";
        BufferedWriter writerL = Files.newBufferedWriter(Paths.get(fileName + ".java"), Charset.forName("UTF-8"));
        String
    }

    @Override
    public Object visitProgram(ProgramParser.ProgramContext ctx) {
        try {
            name = "";
            for (TerminalNode s : ctx.NameChar()) {
                name += s.getSymbol().getText();
            }
            writer = Files.newBufferedWriter(Paths.get(name + ".java"), Charset.forName("UTF-8"));
            writer.write("public class " + name + " {\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Object visitRules(ProgramParser.RulesContext ctx) {
        return null;
    }

    @Override
    public Object visitId(ProgramParser.IdContext ctx) {
        List<String> descritions = new ArrayList<>();
        for (ProgramParser.DescriptionIDContext id : ctx.descriptionID()) {
            descritions.add(id.s);
        }
        terminals.put(ctx.nameID().s, descritions);
        return null;
    }

    @Override
    public Object visitNameRule(ProgramParser.NameRuleContext ctx) {
        return null;
    }

    @Override
    public Object visitSequence(ProgramParser.SequenceContext ctx) {
        for (ProgramParser.SymbolContext s : ctx.symbol()) {
            if (literals.add(s.s)) {
                List<String> temp = new ArrayList<>();
                temp.add(s.s);
                String name = "T_" + (literals.size() - 1);
                terminals.put(name, temp);
            }
            ctx.children.get(0);
        }
        return null;
    }

    @Override
    public Object visitAlternative(ProgramParser.AlternativeContext ctx) {
        return null;
    }

    @Override
    public Object visitNameID(ProgramParser.NameIDContext ctx) {
        for (TerminalNode c : ctx.NameChar()) {
            ctx.s += c.getText();
        }
        return null;
    }

    @Override
    public Object visitOneSymbol(ProgramParser.OneSymbolContext ctx) {
        return null;
    }

    @Override
    public Object visitInterval(ProgramParser.IntervalContext ctx) {
        return null;
    }

    @Override
    public Object visitSymbol(ProgramParser.SymbolContext ctx) {
        return null;
    }
}
