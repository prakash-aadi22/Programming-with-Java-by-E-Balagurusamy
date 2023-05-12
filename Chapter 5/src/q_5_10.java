import java.util.Scanner;

public class q_5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value between 0.001 to 1");
            System.out.print("Enter the value of Inductance: ");
            float l = sc.nextFloat();
            System.out.print("Enter the value of Resistance: ");
            float r = sc.nextFloat();
            for (float c = 0.01f; c <= 0.1; c += 0.01) {
//            System.out.printf("%.2f\n",c);
                double f = Math.sqrt((1 / (l * c)) - ((r * r) / (4 * c * c)));
                System.out.printf("For capacitance: %.2f, Frequency = %.2f\n", c, f);
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
