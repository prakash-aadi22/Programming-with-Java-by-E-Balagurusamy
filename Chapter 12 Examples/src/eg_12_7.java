class m implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("\tThread " + i + " = " + (i * i));
        }
        System.out.println("End of Thread");
    }
}

public class eg_12_7 {
    public static void main(String[] args) {
/*
        m fun = new m();
        Thread t = new Thread(fun);
        t.start();
        System.out.println("End of main thread");
*/
//      Shortcut

        new Thread(new m()).start();
        System.out.println("End of main thread");
    }
}
