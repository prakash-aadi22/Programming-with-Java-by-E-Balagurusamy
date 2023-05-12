package Part_B;

abstract class Test {
    abstract void display();
}

public class q_29 {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            void display() {
                System.out.println("hello");
            }
        };
        t.display();
    }
}
