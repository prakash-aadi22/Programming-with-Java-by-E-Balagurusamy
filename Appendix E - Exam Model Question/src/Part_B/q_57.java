package Part_B;

class base {
    int x = 10;
}

class derived extends base {
    int x = 20;
}

public class q_57 {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
        base bd = new derived();
        System.out.println(b.x + " " + d.x + " " + bd.x);
        System.out.println("b.x = " + b.x);
        System.out.println("d.x = " + d.x);
        System.out.println("bd.x = " + bd.x);
    }
}
