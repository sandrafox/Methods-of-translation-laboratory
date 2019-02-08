import java.util.*;

import java.util.concurrent.*;

public class AbParser {

    Map<String, String> value;
    
    String build(String s1, String s2) {
        String s = "";
        int i;
        for (i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            s += s1.charAt(i);
            s += s2.charAt(i);
        }
        for (int j = i; j < s1.length(); j++)
            s += s1.charAt(j);
        for (int j = i; j < s2.length(); j++)
            s += s2.charAt(j);
        return s;
    }
    
    private List<Map.Entry<String, String>> input;
    private int index;

    public AbParser(List<Map.Entry<String, String>> input) {
        this.input = input;
    }

    public void parse() throws Exception {
        index = 0;
        a();
    }

    class aContext implements Context {
    }
    public aContext a() throws Exception {
        aContext ctx = new aContext();
        System.out.println("Result:");
        if (index == input.size()) return ctx;
        switch (input.get(index).getKey()) {
            case "C":
                bContext t0 = b();
                System.out.println(t0.s);
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class bContext implements Context {
        String s;
    }
    public bContext b() throws Exception {
        bContext ctx = new bContext();
        if (index == input.size()) return ctx;
        switch (input.get(index).getKey()) {
            case "C":
                cContext t0 = c(0);
                if (!input.get(index).getKey().equals("D")) throw new Exception();
                Map.Entry<String, String> t1 = new AbstractMap.SimpleEntry("D", input.get(index).getValue());
                index++;
                cContext t2 = c(1);
                ctx.s = build(t0.s, t2.s);
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class cContext implements Context {
        int i;

        public cContext (int i) {
            this.i = i;
        }

        String s;
    }
    public cContext c(int i) throws Exception {
        cContext ctx = new cContext(i);
        if (index == input.size()) return ctx;
        switch (input.get(index).getKey()) {
            case "C":
                if (!input.get(index).getKey().equals("C")) throw new Exception();
                Map.Entry<String, String> t0 = new AbstractMap.SimpleEntry("C", input.get(index).getValue());
                index++;
                ctx.s = t0.getValue() + ctx.i;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    interface Context { }
}