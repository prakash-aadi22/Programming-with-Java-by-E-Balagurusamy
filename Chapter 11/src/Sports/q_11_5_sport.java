package Sports;

import Students.q_11_5_student;

import java.util.Scanner;

interface sports1 {
    float sportWt1 = 6.0f;

//    void setWt1();
}

class result1 extends q_11_5_student implements sports1 {
    float total1;

//    @Override
    public void setWt1() {
        System.out.println("Sport Wt: " + sportWt1);
    }

    void display1() {
        total1 = part11 + part21 + sportWt1;
        setNo1();
        setMarks1();
        setWt1();
        System.out.println("Total Score: " + total1);
    }
}

public class q_11_5_sport {
    public static void main(String[] args) {
        System.out.println("Go to ");
        try {
            Scanner sc1 = new Scanner(System.in);
            result1 st11 = new result1();
            System.out.print("Enter the roll number: ");
            int a1 = sc1.nextInt();
            System.out.print("Enter the marks of part 1: ");
            float f11 = sc1.nextFloat();
            System.out.print("Enter the marks of part 2: ");
            float f21 = sc1.nextFloat();
            st11.getNo1(a1);
            st11.getMarks1(f11, f21);
            st11.display1();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
