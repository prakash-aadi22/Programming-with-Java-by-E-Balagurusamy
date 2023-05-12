public class eg_13_8 {
    static void divide_m() throws ArithmeticException {
        int x = 22, y = 0, z;
        z = x / y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        try {
            divide_m();
        } catch (ArithmeticException e) {
            System.out.println("Caught my exception: " + e);
        } finally {
            System.out.println("you cannot divide a number by zero");
        }
    }
}
