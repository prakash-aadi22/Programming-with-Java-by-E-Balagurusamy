class multi11 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\tFrom Thread 1 i = " + i);
        }
    }
}

class multi22 implements Runnable {
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("\tFrom Thread 1 j = " + j);
        }
    }
}

public class d_12_3 {
    public static void main(String[] args) {
        multi11 m11 = new multi11();
        m11.start();
    }
}
