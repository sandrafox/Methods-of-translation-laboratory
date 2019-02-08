package ru.ifmo.rain.lisicyna;

import org.antlr.v4.runtime.*;
import ru.ifmo.rain.lisicyna.antlr.ProgramLexer;
import ru.ifmo.rain.lisicyna.antlr.ProgramParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tests\\" + "Calc" + ".in")));
            System.out.println("Test " + "calc" + ": " + reader.readLine());
            CharStream input = new ANTLRFileStream("tests\\Calc.in");
            TokenSource lexer = new ProgramLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            ProgramParser parser = new ProgramParser(tokens);
            Parser p = new Parser();
            p.generate("Calc", parser.program());
        } catch (IOException | ParserException e) {
            System.out.print(e.getMessage());
        }
        /*try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tests\\" + "LR" + ".in")));
            System.out.println("Test " + "lr" + ": " + reader.readLine());
            CharStream input = new ANTLRFileStream("tests\\LR.in");
            TokenSource lexer = new ProgramLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            ProgramParser parser = new ProgramParser(tokens);
            Parser p = new Parser();
            p.generate("LR", parser.program());
        } catch (IOException | ParserException e) {
            System.out.println(e.getMessage());
        }
        try {
            Integer.
            Pattern pat = Pattern.compile("-");
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tests\\" + "RB" + ".in")));
            System.out.println("Test " + "rb" + ": " + reader.readLine());
            CharStream input = new ANTLRFileStream("tests\\RB.in");
            TokenSource lexer = new ProgramLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            ProgramParser parser = new ProgramParser(tokens);
            Parser p = new Parser();
            p.generate("RB", parser.program());
        } catch (IOException | ParserException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
