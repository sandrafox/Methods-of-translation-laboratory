public class Visualizer {
    public static final String indent = "    ";

    public static void visualize(Tree tree, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(indent);
        }
        String symbol = tree.getSymbol();

        System.out.print(symbol);
        for (int i = 0; i < indent.length() - symbol.length(); i++) {
            System.out.print(" ");
        }
        System.out.println();
        for (Tree child : tree.getChildren()) {
            visualize(child, n + 1);
        }
    }
}
