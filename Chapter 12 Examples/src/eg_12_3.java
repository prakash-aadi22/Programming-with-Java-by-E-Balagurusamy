class a1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            } else {
                System.out.println("\ti = " + i);
            }
        }
        System.out.println("Exit from a");
    }
}

class b1 extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tj = " + j);
            if (j == 3) {
                stop();
            }
        }
        System.out.println("Exit from b");
    }
}

class c1 extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\tk = " + k);
            if (k == 2) {
                try {
                    sleep(2500);
                    System.out.println("ruko jara sabar karo");
                    sleep(5000);
                } catch (Exception e) {
                    System.out.println("" + e);
                }
            }
        }
        System.out.println("Exit from c");
    }
}

public class eg_12_3 {
    public static void main(String[] args) {
        a1 threadA = new a1();
        b1 threadB = new b1();
        c1 threadC = new c1();
        System.out.println("Start thread a:");
        threadA.start();
        System.out.println("Start thread b:");
        threadB.start();
        System.out.println("Start thread c:");
        threadC.start();
    }
}
