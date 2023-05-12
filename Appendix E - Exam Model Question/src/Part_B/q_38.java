package Part_B;

public class q_38 {
    public q_38(int x) {

    }

    public static void main(String[] args) {
        ClassB b = new ClassB(22);
    }
}

class ClassB extends q_38 {
    public ClassB(int x) {
        super(x);
    }
}