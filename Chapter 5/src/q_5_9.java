import java.util.Scanner;

public class q_5_9 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of demand rate: ");
            float dr = sc.nextFloat();
            System.out.print("Enter the value of setup costs: ");
            float scs = sc.nextFloat();
            System.out.print("Enter the value of holding cost per unit time: ");
            float hc = sc.nextFloat();
            double eoq = Math.sqrt((2 * dr * scs) / hc);
            double tbo = Math.sqrt(2 * scs / dr * hc);
            System.out.printf("Economic Order Quantity(EOQ): %.3f\n", eoq);
            System.out.printf("Time Between Orders(TBO): %.3f", tbo);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
