package Part_B;

class maths {
    Students1 student1;
}

class Students1 {
    String name;
}

public class q_26 {
    public static void main(String[] args) {
        maths m = new maths();
        Students1 s1 = new Students1();
        Students1 m1 = m.student1;
        String n = s1.name;
        System.out.println(m1);
        System.out.println(m.student1);
        System.out.println(n);
        System.out.println(s1.name);
    }
}
