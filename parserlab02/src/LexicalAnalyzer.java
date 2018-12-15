import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class LexicalAnalyzer {
    private BufferedReader reader;
    private int curChar = 0;
    private int curPos;
    private int prevChar;
    private Token curToken;

    public LexicalAnalyzer(BufferedReader is) throws ParserException {
        reader = is;
        curPos = 0;
        nextChar();
    }

    private void nextChar() throws ParserException {
        curPos++;
        prevChar = curChar;
        try {
            curChar = reader.read();
        } catch (IOException e) {
            throw new ParserException("Sorry, cannot read from file", e);
        }
    }

    public void nextToken() throws ParserException {
        while (Character.isWhitespace(curChar)) {
            nextChar();
        }
        switch (curChar) {
            case 'a':
                nextChar();
                if (curChar == 'n') {
                    nextChar();
                    if (curChar == 'd') {
                        nextChar();
                        curToken = Token.AND;
                    } else {
                        throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                    }
                } else {
                    curToken = Token.VAR;
                }
                break;
            case 'x':
                nextChar();
                if (curChar == 'o') {
                    nextChar();
                    if (curChar == 'r') {
                        nextChar();
                        curToken = Token.XOR;
                    } else {
                        throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                    }
                } else {
                    curToken = Token.VAR;
                }
                break;
            case 'o':
                nextChar();
                if (curChar == 'r') {
                    nextChar();
                    curToken = Token.OR;
                } else {
                    curToken = Token.VAR;
                }
                break;
            case 'n':
                nextChar();
                if (curChar == 'o') {
                    nextChar();
                    if (curChar == 't') {
                        nextChar();
                        curToken = Token.NOT;
                    } else {
                        throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                    }
                } else {
                    curToken = Token.VAR;
                }
                break;
            case 't':
                nextChar();
                if (curChar == 'r') {
                    nextChar();
                    if (curChar == 'u') {
                        nextChar();
                        if (curChar == 'e') {
                            nextChar();
                            curToken = Token.TRUE;
                        } else {
                            throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                        }
                    } else {
                        throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                    }
                } else {
                    curToken = Token.VAR;
                }
                break;
            case 'f':
                nextChar();
                if (curChar == 'a') {
                    nextChar();
                    if (curChar == 'l') {
                        nextChar();
                        if (curChar == 's') {
                            nextChar();
                            if (curChar == 'e') {
                                nextChar();
                                curToken = Token.FALSE;
                            } else {
                                throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                            }
                        } else {
                            throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                        }
                    } else {
                        throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                    }
                } else {
                    curToken = Token.VAR;
                }
                break;
            case '(':
                nextChar();
                curToken = Token.LBRACKET;
                break;
            case ')':
                nextChar();
                curToken = Token.RBRACKET;
                break;
            case -1:
                curToken = Token.END;
                break;
            default:
                if (Character.isLetter(curChar)) {
                    nextChar();
                    curToken = Token.VAR;
                } else {
                    throw new ParserException("Sorry, incorrect symbol " + (char) curChar + " in pos = " + curPos);
                }
        }
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

    public String getCurChar() {
        return new String(new byte[]{(byte) prevChar});
    }
}


