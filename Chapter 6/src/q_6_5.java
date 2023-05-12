public class q_6_5 {
    public static void main(String[] args) {
        System.out.println("Question (a): ");
        int grade = 55, second = 0;
        if (grade <= 59 && grade >= 50) {
            second += 1;
        }
        System.out.println("grade = " + grade);
        System.out.println("second = " + second);

        System.out.println("Question (b): ");
        int number = 50, sum = 50;
        if (number > 100 || number < 0) {
            System.out.println("Out of range");
        } else {
            sum = sum + number;
            System.out.println("Sum = " + sum);
        }

        System.out.println("Question (c): ");
        int m1 = 6, m2 = 6, t = 100, y;
        if ((m1 > 60 && m2 > 60) || t > 200) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println("y = " + y);
    }
}
