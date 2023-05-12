import java.util.Scanner;

public class q_7_10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of columns: ");
            int n = sc.nextInt();
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (a)");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (b)");
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (c)");
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (extra)");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (b): with numbers");
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("QUESTION (a): another method");
            for (int i = 1; i <= n; i++) {
                System.out.println(Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) - 1)) * i + "  ");
            }
            System.out.println("-------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
