import java.io.*;

class writing {
    public void display() {
        byte[] cities = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D', 'R', 'A', 'S', '\n', 'L', 'O', 'N', 'D', 'O', 'N', '\n'};
        FileOutputStream outFile;
        try {
            outFile = new FileOutputStream("city.txt");
            outFile.write(cities);
            outFile.close();
        } catch (IOException e) {
            System.out.println("" + e);
            System.exit(-1);
        }
    }
}

public class eg_16_2 {
    public static void main(String[] args) {
        writing wr = new writing();
        wr.display();
        System.out.println("--> Open city.txt to access <--");
        System.out.println("   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾  ");
    }
}
