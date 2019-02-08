import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.in")));
        CalcLexer lexer = new CalcLexer("2^3*3^2");
        CalcParser parser = new CalcParser(lexer.streamToken());
        parser.parse();
    }
}
