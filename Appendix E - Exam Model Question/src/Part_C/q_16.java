package Part_C;

import EDU.Student_Part_C_q_16.test;

public class q_16 {
    public static void main(String[] args) {
        EDU.Student_Part_C_q_16.test.display1(); // static
        test.display2(); // static
        test t = new test();
        t.display3(); // not static
    }
}
