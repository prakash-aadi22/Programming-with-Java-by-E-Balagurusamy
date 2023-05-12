import java.util.Scanner;

public class q_7_6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int m = sc.nextInt();
            long factorial = 1;
            for (int i = 1; i <= m; ++i) {
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", m, factorial);
            System.out.println("Factorial of " + m + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
