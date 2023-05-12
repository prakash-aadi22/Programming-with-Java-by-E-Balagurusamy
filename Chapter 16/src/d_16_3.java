import java.io.FileOutputStream;
import java.io.PrintStream;

public class d_16_3 {
    public static void main(String[] args) {
        FileOutputStream out;
        PrintStream p;
        try {
            out = new FileOutputStream("d_16_3.txt");
            p = new PrintStream(out);
            p.println("This is written to a file");
            System.out.println("Successfully written");
            p.close();
        } catch (Exception e) {
            System.err.println("Error writing to file");
        }
    }
}
