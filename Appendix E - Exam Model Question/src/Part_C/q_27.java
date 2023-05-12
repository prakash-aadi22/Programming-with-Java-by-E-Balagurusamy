package Part_C;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class q_27 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
        raf.seek(raf.length());
        raf.close();
        File fRaf = new File("raf.txt");
        System.out.println("Created the File --> " + fRaf.getName());
        if (fRaf.delete()) {
            System.out.println("Deleted the File --> " + fRaf.getName());
        } else {
            System.out.println(fRaf.getName() + " --> was not found in the Folder");
        }
    }
}
