public class q_6_10 {
    public static void main(String[] args) {
        System.out.println("SQUARE ROOT TABLE");
        for (float i = 0.0f; i <= 9.0; i += 1.0) {
            for (float j = 0.0f; j < 1; j += 0.1) {
                float s = i + j;
                System.out.printf("Square root of %.1f is: %.3f\n", s, Math.sqrt(s));
            }
            System.out.println("-------------------------------------------------------------");
        }
    }
}
