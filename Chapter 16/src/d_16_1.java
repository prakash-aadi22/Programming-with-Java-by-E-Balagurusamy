import java.io.FileReader;
import java.io.FileWriter;

public class d_16_1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("in.txt");
            FileWriter fw = new FileWriter("out.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        } catch (Exception ex) {
            System.out.println("--> " + ex);
        }
        System.out.println("--> Open out.txt to access <--");
        System.out.println("   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾   ");
    }
}
