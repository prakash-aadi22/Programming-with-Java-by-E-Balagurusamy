import java.util.Scanner;

public class q_6_7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Equations are:");
            System.out.println("ax + by = m  and  cx + dy = n");
            System.out.println("Unique Solution are: ");
            System.out.println("x = (m * d - b * n) / (a * d - c * d)");
            System.out.println("y = (n * a - m * c) / (a * d - c * d)");
            System.out.println("Provided the denominator a * d - c * d should not be equal to Zero(0).");
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();
            System.out.print("Enter the value of c: ");
            int c = sc.nextInt();
            System.out.print("Enter the value of d(d not equal to zero(0)): ");
            int d = sc.nextInt();
            System.out.print("Enter the value of m: ");
            int m = sc.nextInt();
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            int denominator = a * d - c * d;
            if (denominator == 0){
                System.out.println("The denominator a * d - c * d is equal to Zero(0).");
            }
            else {
                int x = (m * d - b * n) / denominator;
                int y = (n * a - m * c) / denominator;
                System.out.println("So, x = " + x);
                System.out.println("So, y = " + y);
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
