import java.util.Scanner;

public class q_6_9 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks of Mathematics: ");
            int m = sc.nextInt();
            System.out.print("Enter your marks of Physics: ");
            int p = sc.nextInt();
            System.out.print("Enter your marks of Chemistry: ");
            int c = sc.nextInt();
            int t = m + p + c;
            int mp = m + p;
            if ((m >= 60 && p >= 50 && c >= 40 && t >= 200) || mp >= 150) {
                System.out.println("Your are eligible.");
            }
            else {
                System.out.println("Sorry,your are not eligible.");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
