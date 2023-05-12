package Part_C;

public class q_32 {
    public static void main(String[] args) {
        int result = result(10);
        System.out.println("Result = " + result);
    }

    static int result(int m) {
        if (m <= 2) {
            return m;
        } else {
            return m + result(m - 2);
        }
    }
}
