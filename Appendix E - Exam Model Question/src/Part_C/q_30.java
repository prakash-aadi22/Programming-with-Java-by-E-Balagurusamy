package Part_C;

class thread1 extends Thread {
    public void run() {
        System.out.println("Begin");
//        suspend();
//        resume();
        System.out.println("End");
    }
}

public class q_30 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
    }
}
