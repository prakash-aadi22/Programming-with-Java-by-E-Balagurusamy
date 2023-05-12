public class eg_4_3 {
    public static void main(String[] args) {
        System.out.println("Screen Display: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.print("\n");
        }
        System.out.println("-------------------- Screen Display Done --------------------");
    }
}
