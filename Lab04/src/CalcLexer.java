import java.util.*;
import java.util.regex.*;

public class CalcLexer {
    private String input;
    private List<Map.Entry<String, String>> terminals = Arrays.asList(new AbstractMap.SimpleEntry<String, String>("Plus", "\\+"),new AbstractMap.SimpleEntry<String, String>("Minus", "\\-"),new AbstractMap.SimpleEntry<String, String>("Mul", "\\*"),new AbstractMap.SimpleEntry<String, String>("Pow", "\\^"),new AbstractMap.SimpleEntry<String, String>("Number", "[0-9]+"));
    private List<Map.Entry<String, Pattern>> regexp = new ArrayList<>();
    public CalcLexer(String input) {
        this.input = input;
        for (Map.Entry<String, String> s : terminals) {
            regexp.add(new AbstractMap.SimpleEntry<>(s.getKey(), Pattern.compile(s.getValue())));
        }
    }
    public List<Map.Entry<String, String>> streamToken() throws Exception {
        int i = 0;
        List<Map.Entry<String, String>> res = new ArrayList<>();
        while (i < input.length()) {
            Map.Entry<String, String> result = null;
            for (Map.Entry<String, Pattern> s : regexp) {
                Matcher matcher = s.getValue().matcher(input);
                if (matcher.find(i)) {
                    int index = matcher.start();
                    if (index != i) continue;
                    if (result == null || result.getValue().length() < matcher.group().length())
                        result = new AbstractMap.SimpleEntry<>(s.getKey(), matcher.group());
                }
            }
            if (result == null)
                throw new Exception();
            res.add(result);
            i += result.getValue().length();
        }
        res.add(new AbstractMap.SimpleEntry<>("EOF", ""));
        return res;
    }
}