import java.io.BufferedReader;
import java.io.InputStream;

public class Parser {
    private LexicalAnalyzer analyzer;

    public Tree parse(BufferedReader is) throws ParserException {
        analyzer = new LexicalAnalyzer(is);
        analyzer.nextToken();
        Tree res = E();
        if (analyzer.getCurToken() != Token.END) {
            throw new ParserException("Incorrect token " + analyzer.getCurToken() + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree E() throws ParserException {
        Tree res = new Tree("E");
        Token token = analyzer.getCurToken();
        switch (token) {
            case LBRACKET:
            case NOT:
            case VAR:
            case TRUE:
            case FALSE:
                //E -> TE'
                res.addChild(T());
                res.addChild(Eprime());
                break;
            case END:
                //E -> e
                res.addChild(new Tree("none", "eps"));
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree Eprime() throws ParserException {
        Tree res = new Tree("E'");
        Token token = analyzer.getCurToken();
        switch (token) {
            case OR:
            case XOR:
                //E' -> orTE'|xorTE'
                res.addChild(new Tree("none", token.toString()));
                analyzer.nextToken();
                res.addChild(T());
                res.addChild(Eprime());
                break;
            case RBRACKET:
            case END:
                //E' -> e
                res.addChild(new Tree("none", "eps"));
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree T() throws ParserException {
        Tree res = new Tree("T");
        Token token = analyzer.getCurToken();
        switch (token) {
            case NOT:
            case LBRACKET:
            case VAR:
            case TRUE:
            case FALSE:
                //T -> FT'
                res.addChild(F());
                res.addChild(Tprime());
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree Tprime() throws ParserException {
        Tree res = new Tree("T'");
        Token token = analyzer.getCurToken();
        switch (token) {
            case AND:
                //T' -> andFT'
                res.addChild(new Tree("none", token.toString()));
                analyzer.nextToken();
                res.addChild(F());
                res.addChild(Tprime());
                break;
            case END:
            case RBRACKET:
            case XOR:
            case OR:
                //T' -> e
                res.addChild(new Tree("none", "eps"));
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree F() throws ParserException {
        Tree res = new Tree("F");
        Token token = analyzer.getCurToken();
        switch (token) {
            case NOT:
                //F -> notN
                res.addChild(new Tree("none", token.toString()));
                analyzer.nextToken();
                res.addChild(N());
                break;
            case LBRACKET:
            case VAR:
            case FALSE:
            case TRUE:
                //F -> N
                res.addChild(N());
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }

    private Tree N() throws ParserException {
        Tree res = new Tree("N");
        Token token = analyzer.getCurToken();
        switch (token) {
            case LBRACKET:
                //N -> (E)
                res.addChild(new Tree("none", token.toString()));
                analyzer.nextToken();
                res.addChild(E());
                token = analyzer.getCurToken();
                if (token != Token.RBRACKET) {
                    throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
                }
                analyzer.nextToken();
                res.addChild(new Tree("none", token.toString()));
                break;
            case VAR:
                //N -> variable
                res.addChild(new Tree("none", analyzer.getCurChar()));
                analyzer.nextToken();
                break;
            case TRUE:
            case FALSE:
                //N -> true | false
                res.addChild(new Tree("none", token.toString()));
                analyzer.nextToken();
                break;
            default:
                throw new ParserException("Incorrect token " + token + " at position = " + analyzer.getCurPos());
        }
        return res;
    }
}
