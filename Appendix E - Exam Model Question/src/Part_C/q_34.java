package Part_C;

public class q_34 {
    static int m = 0;
    static int n = 0;

    public static void main(String[] args) {
        int m = 10;
        int x = 20;
        {
            int n = 30;
            System.out.println("m + n = " + m + n);
            System.out.println("m + n = " + (m + n));
        }
        x = m + n;
        System.out.println("x = " + x);
    }
}
