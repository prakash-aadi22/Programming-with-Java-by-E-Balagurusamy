package Part_C;

import java.util.Scanner;

public class q_15 {
    public static int fun(int x, int y) {
        return (x == y) ? x + y : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int c = q_15.fun(a, b);
        System.out.println("c = " + c);
    }
}
