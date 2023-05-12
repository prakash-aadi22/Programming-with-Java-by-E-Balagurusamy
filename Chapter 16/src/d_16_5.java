import java.io.FileInputStream;
import java.io.IOException;

public class d_16_5 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = new FileInputStream("d_16_5.text");
        do {
            i = fin.read();
            System.out.println((char) i);
        } while (i !=-1);
        fin.close();
        fin = null;
    }
}
