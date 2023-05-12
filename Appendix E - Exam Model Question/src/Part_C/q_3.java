package Part_C;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        int b = (a < 0) ? -a : a;
        System.out.println("Absolute Value = " + b);
    }
}
