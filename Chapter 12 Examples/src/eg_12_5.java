class A12 extends Thread {
    public void run() {
        System.out.println("This is Thread A1\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: " + Thread.currentThread().getPriority());
    }
}

class B12 extends Thread {
    public void run() {
        System.out.println("This is Thread B1\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: " + Thread.currentThread().getPriority());
    }
}

class C12 extends Thread {
    public void run() {
        System.out.println("This is Thread C1\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: " + Thread.currentThread().getPriority());
    }
}

public class eg_12_5 {
    public static void main(String[] args) {
        A12 x = new A12();
        B12 y = new B12();
        C12 z = new C12();
        x.setPriority(Thread.MIN_PRIORITY);
        y.setPriority(Thread.NORM_PRIORITY);
        z.setPriority(Thread.MAX_PRIORITY);
        System.out.println();
        System.out.println("This is the main Thread\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: " + Thread.currentThread().getPriority());
        System.out.println("Let's call the other threads in the sequence A->B->C");
        x.start();
        y.start();
        z.start();
    }
}
