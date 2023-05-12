package Part_C;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q_25 {
    public static void main(String[] args) throws IOException {
        File myFile = new File("Part_C_q_25.txt");
        System.out.println("Creating the File");
        if (myFile.createNewFile()){
            System.out.println("Created the File --> " + myFile.getName());
        } else {
            System.out.println(myFile.getName() + " --> was already in the Folder");
        }
        FileWriter fw = new FileWriter("Part_C_q_25.txt");
        System.out.println("Writing in the File --> " + myFile.getName());
        fw.write("Part_C_q_25");
        fw.close();
        System.out.println("Written in the File --> " + myFile.getName());
        Scanner sc = new Scanner(myFile);
        System.out.println("Reading the File --> " + myFile.getName());
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
        System.out.println("the File " + myFile.getName());
        System.out.println("Deleting the File --> " + myFile.getName());
        if (myFile.delete()){
            System.out.println("Deleted the File --> " + myFile.getName());
        }
        else {
            System.out.println(myFile.getName() + " --> was not found in the Folder");
        }
    }
}
