import java.util.Scanner;

public class q_6_13 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Question (a)");
            System.out.print("Enter the value of x: ");
            int x1 = sc.nextInt();
            int y1 = 1;
            if ( x1 <= 0){
                y1 = 0;
                if ( x1 < 0){
                    y1 = -1;
                }
            }
            System.out.println("The value of y is " + y1);
            System.out.println("-------------------------------------------------------------");
            System.out.println("Question (b)");
            System.out.print("Enter the value of x: ");
            int x2 = sc.nextInt();
            if (x2 > 0) {
                System.out.println("The value of y is 1");
            } else if (x2 == 0) {
                System.out.println("The value of y is 0");
            } else {
                System.out.println("The value of y is -1");
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("Question (c)");
            System.out.print("Enter the value of x: ");
            int x3 = sc.nextInt();
//            int y3 = x3 != 0 ? ((x3 < 0) ? -1 : 1) : 0; // This can't be replaced with Integer.compare
//            int y3 = x3 == 0 ? 0 : ((x3 < 0) ? -1 : 1); // This can be replaced with Integer.compare
//            int y3 = (x3 > 0) ? (1) : ((x3 < 0) ? (-1): (0)); // This can be replaced with Integer.compare
            int y3 = Integer.compare(x3, 0);
            System.out.println("The value of y is " + y3);
            System.out.println("-------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
