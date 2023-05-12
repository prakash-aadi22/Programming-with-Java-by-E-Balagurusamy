class t1 extends Thread {
    public void run() {
        System.out.println("This is Thread1 class.");
    }
}

class t2 extends Thread {
    public void run() {
        System.out.println("This is Thread2 class.");
    }
}

public class d_12_4 {
    public static void main(String[] args) {
        t1 t = new t1();
        t2 tt = new t2();
        t.setPriority(Thread.MIN_PRIORITY);
        tt.setPriority(Thread.MAX_PRIORITY);
//        t1.run();
//        t2.run();
        t.run();
        t.run();
        t.start();
        tt.start();
    }
}
