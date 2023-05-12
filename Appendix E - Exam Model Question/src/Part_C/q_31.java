package Part_C;

public class q_31 {
    public static void main(String[] args) {
        int max = 10;
        max(max, 20, 30);
        System.out.println(max);
    }

    static void max(int max, int x1, int x2) {
        if (x1 > x2) {
            max = x1;
        } else {
            max = x2;
        }
    }
}
