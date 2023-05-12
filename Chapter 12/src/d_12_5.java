class thread1 extends Thread {
    public void run() {
        System.out.println("This is Thread1 class");
    }
}

class thread2 extends Thread {
    public void run() {
        System.out.println("This is Thread2 class");
    }
}

public class d_12_5 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.run();
        t2.run();
        t1.start();
        t2.start();
    }
}
