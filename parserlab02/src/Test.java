import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Parser parser = new Parser();
        /*try {
            Visualizer.visualize(parser.parse(new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "UTF-8"))), 0);
        } catch (ParserException | IOException e) {
            System.out.println(e.getMessage());
        }*/
        for (int i = 17; i < 20; i++) {
            System.out.println("Test №" + (i + 1));
            try {
                Visualizer.visualize(parser.parse(new BufferedReader(new InputStreamReader(new FileInputStream("" + i + ".in"), "UTF-8"))), 0);
            } catch (ParserException | IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("----------------------------------------------");
        }
    }
}
