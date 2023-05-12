import java.util.Scanner;

public class q_5_3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Question (a)");
            System.out.print("Enter the value of x: ");
            int xa = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int ya = sc.nextInt();
            System.out.print("Enter the value of z: ");
            int za = sc.nextInt();
            int a = ((xa - (ya / 5) + za) % 8) + 25;
            System.out.println("a = " + a);
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (b)");
            System.out.print("Enter the value of x: ");
            int xb = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int yb = sc.nextInt();
            System.out.print("Enter the value of p: ");
            int pb = sc.nextInt();
            System.out.print("Enter the value of q: ");
            int qb = sc.nextInt();
            int b = ((xb - yb) * pb) + qb;
            System.out.println("b = " + b);
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (c)");
            System.out.print("Enter the value of x: ");
            int xc = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int yc = sc.nextInt();
            System.out.print("Enter the value of m: ");
            int mc = sc.nextInt();
            System.out.print("Enter the value of n: ");
            int nc = sc.nextInt();
            int c = (mc * nc) + (-xc / yc);
            System.out.println("c = " + c);
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (d)");
            System.out.print("Enter the value of x: ");
            int xd = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int yd = sc.nextInt();
            int d = xd / (3 * yd);
            System.out.println("d = " + d);
            System.out.println("-----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
