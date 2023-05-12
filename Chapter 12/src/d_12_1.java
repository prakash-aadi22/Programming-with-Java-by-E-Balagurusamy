class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom threadA. i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class d_12_1 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}
