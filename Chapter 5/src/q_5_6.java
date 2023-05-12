import java.util.Scanner;

public class q_5_6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of Depreciation: ");
            float dp = sc.nextFloat();
            System.out.print("Enter the value of Purchase Price: ");
            float pp = sc.nextFloat();
            System.out.print("Enter the value of Year of Service: ");
            float ys = sc.nextFloat();
            double sv = pp - (dp * ys);
            System.out.println("Salvage Value = " + sv);
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
