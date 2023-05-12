public class q_7_9 {
    public static void main(String[] args) {
        try {
            int p, n;
            float r;
            double x, y, v;
            for (p = 1000; p <= 10000; p += 1000) {
                for (n = 1; n <= 10; n++, p += 1000) {
                    for (r = 0.10f; r <= 0.21f; r += 0.01, p += 1000, n++) {
                        if (p <= 11000 && n <= 11) {
                            x = (1 + r);
                            y = Math.pow(x, n);
                            v = p * y;
                            System.out.printf("For  p = %d,  n = %d  and  r = %.2f, the value of  v = ₹%.2f\n", p, n, r, v);
                        } else {
                            System.out.println("error");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
