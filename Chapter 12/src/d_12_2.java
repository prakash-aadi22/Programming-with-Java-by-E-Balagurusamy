class multi1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread 1 i = " + i);
        }
    }
}

class multi2 implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom Thread 1 j = " + j);
        }
    }
}

public class d_12_2 {
    public static void main(String[] args) {
        multi1 m1 = new multi1();
        m1.start();
/*
        multi2 m2 = new multi2();
        m2.start();
*/
        new Thread(new multi2()).start();
    }
}
