import java.io.*;
import java.nio.charset.StandardCharsets;

public class d_16_4 {
    public static void main(String[] args) throws IOException {
//        RandomAccessFile raf = new RandomAccessFile("random.text","rwd");
        try (RandomAccessFile raf = new RandomAccessFile("random.text", "rwd")) {
//        try {
//            Writer out = new OutputStreamWriter(new FileOutputStream(raf.getFD()),"UTF-8");
            Writer out = new OutputStreamWriter(new FileOutputStream(raf.getFD()), StandardCharsets.UTF_8);
            out.write("Programming in C");
            out.flush();
            raf.seek(15);
            out.write("Java");
            out.flush();
        }
//        finally {
//            raf.close();
//        }
    }
}
