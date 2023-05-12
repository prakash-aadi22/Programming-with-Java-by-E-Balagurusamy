package Part_C;

import java.io.*;

public class q_22 {
    public static void main(String[] args) throws IOException {
        File f = new File("q_22.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(9);
        fos.close();
        dos.close();
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("DataInputStream dis = new DataInputStream(fis)");
        System.out.println("dis.read()");
        System.out.println(dis.read());
        fis.close();
        dis.close();
        FileOutputStream fos1 = new FileOutputStream(f);
        DataOutput dot = new DataOutputStream(fos1);
        dot.write(2);
        fos1.close();
        FileInputStream fis1 = new FileInputStream(f);
        DataInput di = new DataInputStream(fis1);
        System.out.println("DataInput di = new DataInputStream(fis1)");
        System.out.println("dis.readBoolean()");
        System.out.println(di.readBoolean());
        fis1.close();
        RandomAccessFile raf = new RandomAccessFile(f,"rwd");
        System.out.println("RandomAccessFile raf = new RandomAccessFile(f,\"rwd\")");
        System.out.println("raf.read()");
        System.out.println(raf.read());
        raf.close();
        DataOutput dot1 = new RandomAccessFile(f,"rwd");
        dot1.write(1);
        DataInput di1 = new RandomAccessFile(f,"rwd");
        System.out.println("DataInput di1 = new RandomAccessFile(f,\"rwd\");");
        System.out.println("di1.readLine()");
        System.out.println(di1.readLine());
    }
}
