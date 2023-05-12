import java.util.Scanner;

public class q_6_11 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int r = sc.nextInt();
            System.out.println("Question (a)");
            System.out.println("Floyd's Triangle of Natural Numbers\n");
            int k = 1;
            for (int i = 0; i <= r; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(k + "\t");
                    k++;
                }
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Question (b)");
            System.out.println("Floyd's Triangle of 0 and 1");
            for (int i = 0; i <= r; i++) {
                for (int j = 0; j < i; j++) {
                    if (((i + j) % 2) == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Question (c)");
            System.out.println("Floyd's Triangle of 1 and 0");
            for (int i = 0; i <= r; i++) {
                for (int j = 0; j < i; j++) {
                    if (((i + j) % 2) != 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
