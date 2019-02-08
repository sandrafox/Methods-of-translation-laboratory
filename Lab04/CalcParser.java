import java.util.*;

public class CalcParser {

    private List<Map.Entry<String, String>> input;
    private int index;

    public CalcParser(List<Map.Entry<String, String>> input) {
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
        switch (input.get(index).getKey()) {
            case "Min":
            case "Number":
            case "LParen":
                eContext t00 = e();
                System.out.println(t00.res);
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class eContext implements Context {
        int res;
    }
    public eContext e() throws Exception {
        eContext ctx = new eContext();
        switch (input.get(index).getKey()) {
            case "Min":
            case "Number":
            case "LParen":
                tContext t00 = t();
                e_Context t01 = e_(t00.res);
                ctx.res = t01.res;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class e_Context implements Context {
        int acc;

        public e_Context (int acc) {
            this.acc = acc;
        }

        int res;
    }
    public e_Context e_(int acc) throws Exception {
        e_Context ctx = new e_Context(acc);
        int r;
        switch (input.get(index).getKey()) {
            case "Plus":
                if (!input.get(index).getKey().equals("Plus")) throw new Exception();
                Map.Entry<String, String> t00 = new AbstractMap.SimpleEntry("Plus", input.get(index).getValue());
                index++;
                tContext t01 = t();
                r = t01.res + ctx.acc;
                e_Context t02 = e_(r);
                ctx.res = t02.res;
                break;
            case "Minus":
                if (!input.get(index).getKey().equals("Minus")) throw new Exception();
                Map.Entry<String, String> t10 = new AbstractMap.SimpleEntry("Minus", input.get(index).getValue());
                index++;
                tContext t11 = t();
                r = ctx.acc - t11.res;
                e_Context t12 = e_(r);
                ctx.res = t12.res;
                break;
            case "RParen":
            case "EOF":
                                                Map.Entry<String, String> t20 = new AbstractMap.SimpleEntry("EPS", input.get(index).getValue());
                ctx.res = ctx.acc;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class tContext implements Context {
        int res;
    }
    public tContext t() throws Exception {
        tContext ctx = new tContext();
        switch (input.get(index).getKey()) {
            case "Min":
            case "Number":
            case "LParen":
                fContext t00 = f();
                t_Context t01 = t_(t00.res);
                ctx.res = t01.res;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class t_Context implements Context {
        int acc;

        public t_Context (int acc) {
            this.acc = acc;
        }

        int res;
    }
    public t_Context t_(int acc) throws Exception {
        t_Context ctx = new t_Context(acc);
        int r;
        switch (input.get(index).getKey()) {
            case "Mul":
                if (!input.get(index).getKey().equals("Mul")) throw new Exception();
                Map.Entry<String, String> t00 = new AbstractMap.SimpleEntry("Mul", input.get(index).getValue());
                index++;
                fContext t01 = f();
                r = t01.res * ctx.acc;
                t_Context t02 = t_(r);
                ctx.res = t02.res;
                break;
            case "RParen":
            case "Plus":
            case "EOF":
            case "Minus":
                                                Map.Entry<String, String> t10 = new AbstractMap.SimpleEntry("EPS", input.get(index).getValue());
                ctx.res = ctx.acc;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class fContext implements Context {
        int res;
    }
    public fContext f() throws Exception {
        fContext ctx = new fContext();
        switch (input.get(index).getKey()) {
            case "Min":
            case "Number":
            case "LParen":
                pContext t00 = p();
                nContext t01 = n(t00.res);
                ctx.res = t01.res;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class nContext implements Context {
        int acc;

        public nContext (int acc) {
            this.acc = acc;
        }

        int res;
    }
    public nContext n(int acc) throws Exception {
        nContext ctx = new nContext(acc);
        switch (input.get(index).getKey()) {
            case "Pow":
                if (!input.get(index).getKey().equals("Pow")) throw new Exception();
                Map.Entry<String, String> t00 = new AbstractMap.SimpleEntry("Pow", input.get(index).getValue());
                index++;
                fContext t01 = f();
                ctx.res = (int) Math.pow(ctx.acc, t01.res);
                break;
            case "Mul":
            case "RParen":
            case "Plus":
            case "EOF":
            case "Minus":
                                                Map.Entry<String, String> t10 = new AbstractMap.SimpleEntry("EPS", input.get(index).getValue());
                ctx.res = ctx.acc;
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    class pContext implements Context {
        int res;
    }
    public pContext p() throws Exception {
        pContext ctx = new pContext();
        switch (input.get(index).getKey()) {
            case "Number":
                if (!input.get(index).getKey().equals("Number")) throw new Exception();
                Map.Entry<String, String> t00 = new AbstractMap.SimpleEntry("Number", input.get(index).getValue());
                index++;
                ctx.res = Integer.parseInt(t00.getValue());
                break;
            case "LParen":
                if (!input.get(index).getKey().equals("LParen")) throw new Exception();
                Map.Entry<String, String> t10 = new AbstractMap.SimpleEntry("LParen", input.get(index).getValue());
                index++;
                eContext t11 = e();
                if (!input.get(index).getKey().equals("RParen")) throw new Exception();
                Map.Entry<String, String> t12 = new AbstractMap.SimpleEntry("RParen", input.get(index).getValue());
                index++;
                ctx.res = t11.res;
                break;
            case "Min":
                if (!input.get(index).getKey().equals("Min")) throw new Exception();
                Map.Entry<String, String> t20 = new AbstractMap.SimpleEntry("Min", input.get(index).getValue());
                index++;
                if (!input.get(index).getKey().equals("Number")) throw new Exception();
                Map.Entry<String, String> t21 = new AbstractMap.SimpleEntry("Number", input.get(index).getValue());
                index++;
                ctx.res = - Integer.parseInt(t21.getValue());
                break;
            default: throw new Exception();
        }
        return ctx;
    }

    interface Context { }
}