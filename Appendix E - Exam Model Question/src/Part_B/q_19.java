package Part_B;

import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            if (number >= 0) {
                if (number > 0) {
                    System.out.println("Number is positive");
                } else {
                    System.out.println("Number is negative");
                }
            } else {
                System.out.println("Number is negative.");
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e);
        }
    }
}
