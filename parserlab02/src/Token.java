public enum Token {
    AND, OR, XOR, NOT, VAR, END, LBRACKET, RBRACKET, TRUE, FALSE;

    public String toString() {
        switch (this) {
            case VAR:
                return "variable";
            case OR:
                return "or";
            case AND:
                return "and";
            case END:
                return "$";
            case NOT:
                return "not";
            case XOR:
                return "xor";
            case LBRACKET:
                return "(";
            case RBRACKET:
                return ")";
            case TRUE:
                return "true";
            case FALSE:
                return "false";
        }
        return "none";
    }
}
