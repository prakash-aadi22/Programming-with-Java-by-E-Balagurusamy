public class q_6_6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
