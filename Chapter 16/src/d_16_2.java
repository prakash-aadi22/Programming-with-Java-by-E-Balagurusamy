import java.io.DataInputStream;
import java.io.FileInputStream;

public class d_16_2 {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                FileInputStream fStream = new FileInputStream(args[0]);
                DataInputStream in = new DataInputStream(fStream);
                while (in.available() != 0) {
                    System.out.println(in.readLine());
                }
                in.close();
            } catch (Exception e) {
                System.err.println("File Input Error");
            }
        } else
            System.out.println("Invalid parameters");
    }
}
