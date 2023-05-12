import java.io.*;
import java.util.*;

class copying {
    public void display() {
        File inFile = new File("input.txt");
        File outFile = new File("output.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        } catch (IOException e) {
            System.out.println("First: " + e);
            System.exit(-1);
        } finally {
            try {
                assert ins != null;
                ins.close();
                Objects.requireNonNull(ins).close();
                assert outs != null;
                outs.close();
                Objects.requireNonNull(outs).close();
            } catch (IOException e) {
                System.out.println("Second: " + e);
            }
        }
    }
}

public class eg_16_1 {
    public static void main(String[] args) {
        copying cpy = new copying();
        cpy.display();
        System.out.println("--> Open output.txt to access <--");
        System.out.println("   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾   ");
    }
}
