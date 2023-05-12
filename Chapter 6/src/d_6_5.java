import java.util.Scanner;

public class d_6_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the x: ");
            int x = sc.nextInt();
            System.out.print("Enter the y: ");
            int y = sc.nextInt();
            System.out.print("Enter the z: ");
            int z = sc.nextInt();
            if (x > y) {
                if (z < y) {
                    System.out.println("y is greater than z");
                } else if (y < z) {
                    System.out.println("z is greater than y");
                }
                System.out.println("x is greater than y");
            } else {
                if (y > z) {
                    System.out.println("y is greater than z");
                } else {
                    System.out.println("z is greater than y");
                }
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
