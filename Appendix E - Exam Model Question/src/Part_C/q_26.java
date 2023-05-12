package Part_C;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class q_26 {
    public static void main(String[] args) throws IOException {
        System.out.println("======================================================================");
        System.out.println("First Method");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        File file = new File("File.txt");
        if (file.createNewFile()) {
            System.out.println("Created the File --> " + file.getName());
        } else {
            System.out.println(file.getName() + " --> was already in the Folder");
        }
        if (file.delete()) {
            System.out.println("Deleted the File --> " + file.getName());
        } else {
            System.out.println(file.getName() + " --> was not found in the Folder");
        }
        System.out.println("======================================================================");
        System.out.println("Second Method");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        FileOutputStream fos = new FileOutputStream("FileOutputStream.txt");
        fos.write(22);
        fos.close();
        File fFos = new File("FileOutputStream.txt");
        System.out.println("Created the File --> " + fFos.getName());
        if (fFos.delete()) {
            System.out.println("Deleted the File --> " + fFos.getName());
        } else {
            System.out.println(fFos.getName() + " --> was not found in the Folder");
        }
        System.out.println("======================================================================");
        System.out.println("Third Method");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Path p = Paths.get("noi_file.txt");
        Files.createFile(p);
        System.out.println("Created the File --> " + p.getFileName());
        Files.deleteIfExists(p);
        System.out.println("Deleted the File --> " + p.getFileName());
        System.out.println("======================================================================");
        System.out.println("Forth Method");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        RandomAccessFile raf = new RandomAccessFile("RandomAccessFile.txt", "rw");
        raf.close();
        File fRaf = new File("RandomAccessFile.txt");
        System.out.println("Created the File --> " + fRaf.getName());
        if (fRaf.delete()) {
            System.out.println("Deleted the File --> " + fRaf.getName());
        } else {
            System.out.println(fRaf.getName() + " --> was not found in the Folder");
        }
        System.out.println("======================================================================");
    }
}
