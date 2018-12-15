package ru.ifmo.rain.lisicyna;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import ru.ifmo.rain.lisicyna.antlr.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Translator {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        for (int i = 6; i < 7; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tests\\" + i + ".in")));
            System.out.println("Test " + i + ": " + reader.readLine());
            CharStream input = new ANTLRFileStream("tests\\" + i + ".in");
            TokenSource lexer = new ProgramLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            ProgramParser parser = new ProgramParser(tokens);
            parser.w = Files.newBufferedWriter(Paths.get("tests" + i + "\\Main.java"));
            parser.s();
            System.out.println("_________________________________________");
            System.out.println();
        }
    }
    int a = 1 >> 2;
}
