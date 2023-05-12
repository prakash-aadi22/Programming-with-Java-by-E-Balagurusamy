package Part_C;

class A {
    void method(int x) {
        System.out.println("x = " + x);
    }
}

//class B extends A {
//    public static void main(String[] args) {
//        A a1 = new A();
//        A a2 = new B();
//        a1.method(10);
//        a2.method(20);
//    }
//
//    void method(int y) {
//        System.out.println("y = " + y);
//    }
//
//    void method(String s) {
//        System.out.println("s = " + s);
//    }
//}

public class q_21 extends A {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new q_21();
        a1.method(10);
        a2.method(20);
    }

    void method(int y) {
        System.out.println("y = " + y);
    }

    void method(String s) {
        System.out.println("s = " + s);
    }
}
