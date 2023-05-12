package com.company;

import java.util.Scanner;

public class last_digit {
    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    static int firstDigit1(int n) {
        int digits = (int) (Math.log10(n));
        n = (n / (int) (Math.pow(10, digits)));
        return n;
    }

    public static int lastDigit(int n) {
        return (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("First digit: " + firstDigit(n) + ", Last digit: " + lastDigit(n));
        System.out.println("First digit: " + firstDigit1(n) + ", Last digit: " + lastDigit(n));
        int x = lastDigit(n);
        if (x == 0 || x == 1){
            System.out.println("You are verified");
        }
        else {
            System.out.println("You are not verified");
        }
        System.out.print("The sum of the digits " + n + " is: ");
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
