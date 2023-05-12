package Part_B;

class base1 {
    void display() {
        System.out.println("Base");
    }
}

class derived1 extends base1 {
    void display() {
        System.out.println("Derived");
    }
}

public class q_58 {
    public static void main(String[] args) {
        base1 b1 = new base1();
        derived1 d1 = new derived1();
        base1 bd1 = new derived1();
        b1.display();
        d1.display();
        bd1.display();
    }
}
