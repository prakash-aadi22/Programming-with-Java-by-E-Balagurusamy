import java.util.Scanner;

public class q_7_7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long n = sc.nextLong();
            int sum = 0;
            System.out.print("The sum of the each digit of the number " + n + " is: ");
            for (int i = 0; i <= n; i++) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
