package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = sc.nextInt();
        System.out.println("The integer: " + a);
        System.out.print("Enter the double: ");
        double b = sc.nextDouble();
        System.out.println("The double: " + b);
        System.out.print("Enter the string: ");
        sc.nextLine();
        String c = sc.nextLine();
        System.out.println("The string: " + c);
    }
}
