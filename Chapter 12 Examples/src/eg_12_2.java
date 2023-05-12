class D extends Thread {
    public void run() {
        for (int l = 1; l <= 5; l++) {
            System.out.println("l = " + l);
        }
        System.out.println("Exit from D");
    }
}

class E extends Thread {
    public void run() {
        for (int m = 1; m <= 5; m++) {
            System.out.println("m = " + m);
        }
        System.out.println("Exit from E");
    }
}

class F extends Thread {
    public void run() {
        for (int n = 1; n <= 5; n++) {
            System.out.println("n = " + n);
        }
        System.out.println("Exit from F");
    }
}

public class eg_12_2 {
    public static void main(String[] args) {
        new D().run();
        new E().run();
        new F().run();
    }
}
