import java.util.Scanner;

public class q_7_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long n = sc.nextLong();
            int reverse = 0;
            int remainder;
            while (n != 0) {
                remainder = (int) (n % 10);
                reverse = (reverse * 10 + remainder);
                n /= 10;
            }
            System.out.println(reverse);
            System.out.println("-----------------------------------------------------");
            System.out.print("Enter a number: ");
            long num = sc.nextLong();
            int reverseNumber = 0;
            while (num != 0) {
                reverseNumber = reverseNumber * 10;
                reverseNumber = (int) (reverseNumber + num % 10);
                num = num / 10;
            }
            System.out.println(reverseNumber);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
