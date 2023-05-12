import java.util.Scanner;

public class q_6_8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for the range 81 and 100");
            System.out.println("Enter 2 for the range 61 and 80");
            System.out.println("Enter 3 for the range 41 and 60");
            System.out.println("Enter 4 for the range 0 and 40");
            System.out.print("Enter the range of marks: ");
            int r = sc.nextInt();
            if (r == 1) {
                System.out.println("Number of students are: 20");
            } else if (r == 2) {
                System.out.println("Number of students are: 50");
            } else if (r == 3) {
                System.out.println("Number of students are: 25");
            } else if (r == 4) {
                System.out.println("Number of students are: 10");
            }else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
