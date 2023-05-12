import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eg_4_use_BufferReader_class {
    public static void main(String[] args) throws IOException {
        System.out.print("Input an integer: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String input = br.readLine();
            int n = Integer.parseInt(input);
            System.out.println("Square is: " + n * n);
        } catch (IOException ioe) {
            System.out.println("Input Error" + ioe);
        }
        br.close();
    }
}
