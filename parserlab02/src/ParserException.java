public class ParserException extends Exception {
    public ParserException(String message, Exception ex) {
        super(message, ex);
    }

    public ParserException(String message) {
        super(message);
    }
}
