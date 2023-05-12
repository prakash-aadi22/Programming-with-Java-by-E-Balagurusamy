package Part_B;

class B {
    public B(int x, int y) {
    }

    B() {
    }
}

class A extends B {
    public A(int x) {
    }

    public A(int x, int y) {
        super(x, y);
    }
}

public class q_27 {
    public static void main(String[] args) {
        A a = new A(5, 6);
        A a1 = new A(10);
    }
}
