import java.util.Scanner;

public class d_6_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks: ");
            int result = sc.nextInt();
            char grade;
            if (result >= 90) {
                grade = 'A';
            } else if (result >= 80) {
                grade = 'B';
            } else if (result >= 70) {
                grade = 'C';
            } else if (result >= 60) {
                grade = 'D';
            } else if (result >= 50) {
                grade = 'F';
            } else {
                grade = 'G';
            }
            System.out.println("Grade of the Student_Part_C_q_16 is " + grade);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
