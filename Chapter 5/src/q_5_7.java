import java.util.Scanner;

public class q_5_7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("Smallest integer not less than the number  |  The given integer  |  Largest integer not greater than the number");
            System.out.println((number + 1) + " > " + number + " > " + (number - 1));
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
