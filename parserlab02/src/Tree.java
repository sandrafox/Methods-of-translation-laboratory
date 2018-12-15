import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    private String node;
    private List<Tree> children;
    private String symbol;

    public Tree(String node, String symbol) {
        this.node = node;
        this.symbol = symbol;
        children = new ArrayList<>();
    }

    public String getSymbol() {
        if (symbol == null) {
            symbol = node;
        }
        return symbol;
    }

    public Tree(String node) {
        this.node = node;
        children = new ArrayList<>();
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public List<Tree> getChildren() {
        return children;
    }
}
