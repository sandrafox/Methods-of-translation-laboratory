package ru.ifmo.rain.lisicyna;

import ru.ifmo.rain.lisicyna.antlr.ProgramParser;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Parser {
    String name;
    String TAB = "    ";
    Map<String, Integer> indexOfNonTerm;
    List<Boolean> isBuildFirst;
    List<ProgramParser.Node> nonTerminals;
    List<Boolean> buildingFirst;
    List<Set<String>> firstsList;
    List<Set<String>> followsList;
    String start;
    List<ProgramParser.Node> terminals;
    String stringOfTokens;

    public void generate(String n, ProgramParser.ProgramContext a) throws IOException, ParserException {
        name = n;
        start = a.begin().nameRule().s;
        terminals = new ArrayList<>();
        isBuildFirst = new ArrayList<>();
        indexOfNonTerm = new HashMap<>();
        nonTerminals = new ArrayList<>();
        buildingFirst = new ArrayList<>();
        followsList = new ArrayList<>();
        firstsList = new ArrayList<>();
        for (ProgramParser.RuleContext r : a.rule()) {
            if (r.node.isTerminal) {
                terminals.add(r.node);
            } else {
                indexOfNonTerm.put(r.node.name, nonTerminals.size());
                nonTerminals.add(r.node);
                isBuildFirst.add(false);
                buildingFirst.add(false);
                firstsList.add(new HashSet<>());
            }
        }
        for (ProgramParser.Node node : nonTerminals) {
            if (!isBuildFirst.get(indexOfNonTerm.get(node.name))) {
                buildFirstOfNonTerminal(node);
            }
        }
        buildFollowsList();
        generateTokens(a);
        generateLexer(a);
        generateParser(a);
    }

    private void generateTokens(ProgramParser.ProgramContext a) throws IOException {
        List<Map.Entry<String, String>> tokens = new ArrayList<>();
        for (ProgramParser.Node node : terminals) {
            for (List<Map.Entry<String, Map.Entry<String, String>>> s : node.seqs) {
                tokens.add(new AbstractMap.SimpleEntry<String, String>(node.name, s.get(0).getKey().substring(1, s.get(0).getKey().length() - 1)));
            }
        }
        stringOfTokens = String.join(",", tokens.stream().map(s -> "new AbstractMap.SimpleEntry<String, String>(\"" + s.getKey() + "\", \"" + s.getValue() + "\")").collect(Collectors.toList()));
    }

    private void generateLexer(ProgramParser.ProgramContext a) throws IOException {
        String fileName = name + "Lexer";
        BufferedWriter writerL = Files.newBufferedWriter(Paths.get(fileName + ".java"), Charset.forName("UTF-8"));
        writerL.write("import java.util.*;\nimport java.util.regex.*;\n\n");
        writerL.write("public class " + fileName + " {\n");
        writerL.write(TAB);
        writerL.write("private String input;\n");
        writerL.write(TAB);
        List<Map.Entry<String, String>> as = Arrays.asList(new AbstractMap.SimpleEntry<String, String>("ab", "cd"));

        writerL.write("private List<Map.Entry<String, String>> terminals = Arrays.asList(" + stringOfTokens + ");\n");
        writerL.write(TAB);
        writerL.write("private List<Map.Entry<String, Pattern>> regexp = new ArrayList<>();\n");
        writerL.write(TAB);
        writerL.write("public " + fileName + "(String input) {\n");
        writerL.write(TAB + TAB);
        writerL.write("this.input = input;\n");
        writerL.write(TAB + TAB);
        writerL.write("for (Map.Entry<String, String> s : terminals) {\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("regexp.add(new AbstractMap.SimpleEntry<>(s.getKey(), Pattern.compile(s.getValue())));\n");
        writerL.write(TAB + TAB);
        writerL.write("}\n");
        writerL.write(TAB);
        writerL.write("}\n");
        writerL.write(TAB);
        writerL.write("public List<Map.Entry<String, String>> streamToken() throws Exception {\n");
        writerL.write(TAB + TAB);
        writerL.write("int i = 0;\n");
        writerL.write(TAB + TAB);
        writerL.write("List<Map.Entry<String, String>> res = new ArrayList<>();\n");
        writerL.write(TAB + TAB);
        writerL.write("while (i < input.length()) {\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("Map.Entry<String, String> result = null;\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("for (Map.Entry<String, Pattern> s : regexp) {\n");
        writerL.write(TAB + TAB + TAB + TAB);
        writerL.write("Matcher matcher = s.getValue().matcher(input);\n");
        writerL.write(TAB + TAB + TAB + TAB);
        writerL.write("if (matcher.find(i)) {\n");
        writerL.write(TAB + TAB + TAB + TAB + TAB);
        writerL.write("int index = matcher.start();\n");
        writerL.write(TAB + TAB + TAB + TAB + TAB);
        writerL.write("if (index != i) continue;\n");
        writerL.write(TAB + TAB + TAB + TAB + TAB);
        writerL.write("if (result == null || result.getValue().length() < matcher.group().length()) \n");
        writerL.write(TAB + TAB + TAB + TAB + TAB + TAB);
        writerL.write("result = new AbstractMap.SimpleEntry<>(s.getKey(), matcher.group());\n");
        writerL.write(TAB + TAB + TAB + TAB);
        writerL.write("}\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("}\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("if (result == null) \n");
        writerL.write(TAB + TAB + TAB + TAB);
        writerL.write("throw new Exception();\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("res.add(result);\n");
        writerL.write(TAB + TAB + TAB);
        writerL.write("i += result.getValue().length();\n");
        writerL.write(TAB + TAB);
        writerL.write("}\n");
        writerL.write(TAB + TAB);
        writerL.write("res.add(new AbstractMap.SimpleEntry<>(\"EOF\", \"\"));\n");
        writerL.write(TAB + TAB);
        writerL.write("return res;\n");
        writerL.write(TAB);
        writerL.write("}\n");
        writerL.write("}");
        writerL.close();
    }

    private Set<String> buildFirstOfNonTerminal(ProgramParser.Node node) throws ParserException {
        Set<String> result = new HashSet<>();
        isBuildFirst.set(indexOfNonTerm.get(node.name), true);
        buildingFirst.set(indexOfNonTerm.get(node.name), true);
        for (List<Map.Entry<String, Map.Entry<String, String>>> seq : node.seqs) {
            String start = seq.get(0).getKey();
            if (Character.isUpperCase(start.charAt(0))) {
                if (result.contains(start)) {
                    throw new ParserException("It is not LL(1) grammar: " + node.name);
                }
                result.add(start);
            } else {
                if (start.equals(node.name)) {
                    throw new ParserException("It is not LL(1) grammar: " + node.name);
                }
                Integer index = indexOfNonTerm.get(start);
                if (index == null) {
                    throw new ParserException("Unknown non terminal " + start);
                }
                if (buildingFirst.get(index)) {
                    throw new ParserException("It is not LL(1) grammar: " + node.name);
                }
                if (!isBuildFirst.get(index)) {
                    for (String s : buildFirstOfNonTerminal(nonTerminals.get(index))) {
                        if (result.contains(s)) {
                            throw new ParserException("It is not LL(1) grammar: " + node.name);
                        }
                        result.add(s);
                    }
                }
            }
        }
        buildingFirst.set(indexOfNonTerm.get(node.name), false);
        firstsList.set(indexOfNonTerm.get(node.name), result);
        return result;
    }

    private void buildFollowsList() {
        for (ProgramParser.Node node : nonTerminals) {
            followsList.add(new HashSet<>());
        }
        followsList.get(indexOfNonTerm.get(start)).add("EOF");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (ProgramParser.Node node : nonTerminals) {
                for (List<Map.Entry<String, Map.Entry<String, String>>> seq : node.seqs) {
                    int i;
                    for (i = 0; i + 1 < seq.size(); i++) {
                        if (Character.isLowerCase(seq.get(i).getKey().charAt(0))) {
                            if (Character.isUpperCase(seq.get(i + 1).getKey().charAt(0))) {
                                if (followsList.get(indexOfNonTerm.get(seq.get(i).getKey())).add(seq.get(i + 1).getKey())) {
                                    changed = true;
                                }
                            } else {
                                int index1 = indexOfNonTerm.get(seq.get(i).getKey());
                                int index2 = indexOfNonTerm.get(seq.get(i + 1).getKey());
                                int length = followsList.get(index1).size();
                                Set<String> withoutEps = firstsList.get(index2).stream().filter(s -> !s.equals("EPS")).collect(Collectors.toSet());
                                followsList.get(index1).addAll(withoutEps);
                                if (firstsList.get(index2).contains("EPS")) {
                                    followsList.get(index1).addAll(followsList.get(indexOfNonTerm.get(node.name)));
                                }
                                if (length != followsList.get(index1).size()) {
                                    changed = true;
                                }
                            }
                        }
                    }
                    if (Character.isLowerCase(seq.get(i).getKey().charAt(0))) {
                        int length = followsList.get(indexOfNonTerm.get(seq.get(i).getKey())).size();
                        if (Character.isLowerCase(seq.get(i).getKey().charAt(0))) {
                            followsList.get(indexOfNonTerm.get(seq.get(i).getKey())).addAll(followsList.get(indexOfNonTerm.get(node.name)));
                        }
                        if (length != followsList.get(indexOfNonTerm.get(seq.get(i).getKey())).size()) {
                            changed = true;
                        }
                    }
                }
            }
        }
    }

    private void generateParser(ProgramParser.ProgramContext a) throws IOException {
        String fileName = name + "Parser";
        BufferedWriter writerP = Files.newBufferedWriter(Paths.get(fileName + ".java"), Charset.forName("UTF-8"));
        writerP.write("import java.util.*;\n");
        if (a.header() != null) {
            writerP.write(a.header().Code().getText().replace("{", "").replace("}", ""));
        }
        writerP.write("\n");
        writerP.write("public class " + fileName + " {\n");
        if (a.members() != null) {
            writerP.write(a.members().s.replace("#", "").replace("\n", "\n" + TAB));
        }
        writerP.newLine();
        writerP.write(TAB);
        writerP.write("private List<Map.Entry<String, String>> input;\n");
        writerP.write(TAB);
        writerP.write("private int index;\n\n");
        writerP.write(TAB);
        writerP.write("public " + fileName + "(List<Map.Entry<String, String>> input) {\n");
        writerP.write(TAB + TAB);
        writerP.write("this.input = input;\n");
        writerP.write(TAB);
        writerP.write("}\n");
        writerP.write("\n");
        writerP.write(TAB);
        writerP.write("public void parse() throws Exception {\n");
        writerP.write(TAB + TAB);
        writerP.write("index = 0;\n");
        writerP.write(TAB + TAB);
        writerP.write(start + "();\n");
        writerP.write(TAB);
        writerP.write("}\n\n");
        for (ProgramParser.Node node : nonTerminals) {
            writerP.write(generateContext(node));
            writerP.write("\n");
        }
        writerP.write(TAB);
        writerP.write("interface Context { }\n}");

        writerP.close();
    }

    private String generateContext(ProgramParser.Node node) {
        StringBuilder sb = new StringBuilder();
        sb.append(TAB).append("class " + node.name + "Context implements Context {\n");
        if (node.inhVars != null) {
            node.inhVars = node.inhVars.replace("<", "").replace(">", "");
            sb.append(TAB).append(TAB);
            sb.append(node.inhVars).append(";\n\n");
            sb.append(TAB).append(TAB);
            sb.append("public ").append(node.name).append("Context (").append(node.inhVars.replace(";", ",")).
                    append(") {\n");
            sb.append(TAB).append(TAB).append(TAB);
            sb.append(String.join("; ", Arrays.stream(node.inhVars.split(";")).map((String s) -> {
                String a = s.split(" ")[1];
                return "this." + a + " = " + a;}).collect(Collectors.toList())));
            sb.append(";\n");
            sb.append(TAB).append(TAB);
            sb.append("}\n\n");
        }
        if (node.synVars != null) {
            node.synVars = node.synVars.replace("<", "").replace(">", "");
            sb.append(TAB).append(TAB);
            sb.append(node.synVars).append(";\n");
        }
        sb.append(TAB);
        sb.append("}\n");
        sb.append(TAB).append("public " + node.name + "Context ").append(node.name).append("(");
        if (node.inhVars != null) {
            sb.append(node.inhVars.replace(";", ","));
        }
        sb.append(") ").append("throws Exception {\n");
        sb.append(TAB).append(TAB).append(node.name + "Context ctx = new " + node.name + "Context(");
        if (node.inhVars != null) {
            sb.append(String.join(", ", Arrays.stream(node.inhVars.split(";")).map((String s) -> {
            String a = s.split(" ")[1];
            return a;
        }).collect(Collectors.toList())));
        }
        sb.append(");\n");
        int index = indexOfNonTerm.get(node.name);
        if (node.initCode != null) {
            sb.append(TAB).append(TAB);
            sb.append(rewriteCode(node, -1, node.initCode).replace("\n", "\n" + TAB + TAB)).append("\n");
        }
        sb.append(TAB).append(TAB).append("switch (input.get(index).getKey()) {\n");
        for (int i = 0; i < node.seqs.size(); i++) {
            List<Map.Entry<String, Map.Entry<String, String>>> seq = node.seqs.get(i);
            if (Character.isUpperCase(seq.get(0).getKey().charAt(0)) && !seq.get(0).getKey().equals("EPS")) {
                sb.append(TAB).append(TAB).append(TAB);
                sb.append("case \"" + seq.get(0).getKey() + "\":\n");
                sb.append(sequence(node, i));
            } else if (Character.isUpperCase(seq.get(0).getKey().charAt(0)) && seq.get(0).getKey().equals("EPS")) {
                for (String s : followsList.get(index)) {
                    sb.append(TAB).append(TAB).append(TAB);
                    sb.append("case \"").append(s).append("\":\n");
                }
                sb.append(TAB).append(TAB).append(TAB).append(TAB);
                sb.append(sequence(node, i));
            } else {
                int index1 = indexOfNonTerm.get(seq.get(0).getKey());
                if (firstsList.get(index1).contains("EPS")) {
                    for (String s : followsList.get(index1)) {
                        sb.append(TAB).append(TAB).append(TAB);
                        sb.append("case \"").append(s).append("\":\n");
                    }
                }
                for (String s : firstsList.get(index1).stream().filter(s -> !s.equals("EPS")).collect(Collectors.toSet())) {
                    sb.append(TAB).append(TAB).append(TAB);
                    sb.append("case \"").append(s).append("\":\n");
                }
                sb.append(sequence(node, i));
            }
        }
        sb.append(TAB).append(TAB).append(TAB).append("default: throw new Exception();\n");
        sb.append(TAB).append(TAB).append("}\n");
        sb.append(TAB).append(TAB).append("return ctx;\n");
        sb.append(TAB).append("}\n");
        return sb.toString();
    }

    private String sequence(ProgramParser.Node node, int index) {
        StringBuilder sb = new StringBuilder();
        List<Map.Entry<String, Map.Entry<String, String>>> seq = node.seqs.get(index);
        for (int i = 0; i < seq.size(); i++) {
            sb.append(TAB).append(TAB).append(TAB).append(TAB);
            if (Character.isUpperCase(seq.get(i).getKey().charAt(0))) {
                if (!seq.get(i).getKey().equals("EPS")) {
                    sb.append("if (!input.get(index).getKey().equals(\"").append(seq.get(i).getKey()).append("\")) throw new Exception();\n");
                }
                sb.append(TAB).append(TAB).append(TAB).append(TAB).append("Map.Entry<String, String> t").append(index).append(i).append(" = new AbstractMap.SimpleEntry(\"").append(seq.get(i).getKey()).append("\", input.get(index).getValue());\n");
                if (!seq.get(i).getKey().equals("EPS")) {
                    sb.append(TAB).append(TAB).append(TAB).append(TAB).append("index++;\n");
                }
            } else {
                sb.append(seq.get(i).getKey()).append("Context t").append(index).append(i).append(" = ").append(seq.get(i).getKey()).append("(");
                if (seq.get(i).getValue() != null && seq.get(i).getValue().getValue() != null) {

                    sb.append(rewriteCode(node, index, seq.get(i).getValue().getValue()).replace(";", ",").replace("<", "").replace(">", ""));
                }
                sb.append(");\n");
            }
            if (seq.get(i).getValue() != null && seq.get(i).getValue().getKey() != null) {
                sb.append(TAB).append(TAB).append(TAB).append(TAB);
                    sb.append(rewriteCode(node, index, seq.get(i).getValue().getKey()).replace("\n", "\n" + TAB + TAB + TAB + TAB));
                    sb.append("\n");
            }
        }
        sb.append(TAB).append(TAB).append(TAB).append(TAB);
        sb.append("break;\n");
        return sb.toString();
    }

    private String rewriteCode(ProgramParser.Node node, int index, String code) {
        String res = code.replace("{", "").replace("}", "");
        if (index != -1) {
            List<Map.Entry<String, Map.Entry<String, String>>> seq = node.seqs.get(index);
            for (int i = 0; i < seq.size(); i++) {
                if (Character.isUpperCase(seq.get(i).getKey().charAt(0))) {
                    res = res.replace("$" + i, "t" + index + i + ".getValue()");
                } else {
                    res = res.replace("$" + i, "t" + index + i);
                }
            }
        }
        res = res.replace("$" + node.name, "ctx");
        return res;
    }
}
