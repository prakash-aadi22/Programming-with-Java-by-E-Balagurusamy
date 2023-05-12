package Part_B;

public class q_17 {
    public static void main(String[] args) {
        byte b1 = 5, b2 = 3, b3;
        System.out.println("b1 - " + b1);
        System.out.println("b2 - " + b2);
        short s = 25;
        System.out.println("s - " + s);
//        b3 = b1 * b2; --> error
//        b2 = s;
//        b3 = b1 * b2; --> error
        b3 = (byte) (b1 * b2);
        System.out.println("b3 - error");
        System.out.println("b3 (byte) - " + b3);
    }
}
