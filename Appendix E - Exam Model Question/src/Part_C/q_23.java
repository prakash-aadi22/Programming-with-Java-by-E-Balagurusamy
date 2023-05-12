package Part_C;

public class q_23 {
    public static void main(String[] args) {
        short s1 = 3; // 0000  0011
        short s2 = 13; // 0000  1101
        s1 = (short) (s1 ^ s2);
        System.out.println("Result is " + s1);
    }
}
