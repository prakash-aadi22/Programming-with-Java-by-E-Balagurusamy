import java.util.Scanner;

public class d_6_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose a number between 0 and 2: ");
            int i = sc.nextInt();
            if (i == 2) {
                System.out.println("CORRECT VALUE");
            } else {
                System.out.println("INCORRECT VALUE");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
