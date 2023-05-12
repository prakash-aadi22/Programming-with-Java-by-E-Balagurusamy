import java.util.Scanner;

public class q_4_13 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            float sum = 0;
            for (float i = 1; i <= n; i++) {
                if (i == 1) {
                    System.out.print("1 + ");
                } else {
                    System.out.print("1/" + (int) i + " + ");
                }
                sum += (1 / i);
            }
            System.out.println("........");
            System.out.println("The sum of the above harmonic series is: " + sum);
        } catch (Exception e) {
            System.out.println("Input Error \n" + e);
        }
    }
}
