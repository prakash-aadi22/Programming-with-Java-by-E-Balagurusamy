import java.util.Scanner;

public class q_6_12 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter you purchase_Part_C_q_20 amount: ");
            float pa = sc.nextInt();
            sc.nextLine();
            if (pa > 0 && pa <= 100) {
                System.out.print("Enter the type of your cloth (Mill or Handloom): ");
                String s = sc.nextLine();
                if (s.equalsIgnoreCase("Mill")) {
                    System.out.println("Your discount is: 0%");
                    System.out.println("AMOUNT TO BE PAID: ₹" + pa);
                } else if (s.equalsIgnoreCase("Handloom")) {
                    System.out.println("Your discount is: 5.0%");
                    float amount = pa - (pa * (5.0f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else {
                    System.out.println("ERROR");
                }
            } else if (pa > 100 && pa <= 200) {
                System.out.print("Enter the type of your cloth (Mill or Handloom): ");
                String s = sc.nextLine();
                if (s.equalsIgnoreCase("Mill")) {
                    System.out.println("Your discount is: 5.0%");
                    float amount = pa - (pa * (5.0f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else if (s.equalsIgnoreCase("Handloom")) {
                    System.out.println("Your discount is: 7.5%");
                    float amount = pa - (pa * (7.5f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else {
                    System.out.println("ERROR");
                }
            } else if (pa > 200 && pa <= 300) {
                System.out.print("Enter the type of your cloth (Mill or Handloom): ");
                String s = sc.nextLine();
                if (s.equalsIgnoreCase("Mill")) {
                    System.out.println("Your discount is: 7.5%");
                    float amount = pa - (pa * (7.5f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else if (s.equalsIgnoreCase("Handloom")) {
                    System.out.println("Your discount is: 10.0%");
                    float amount = pa - (pa * (10.0f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else {
                    System.out.println("ERROR");
                }
            } else if (pa > 300) {
                System.out.print("Enter the type of your cloth (Mill or Handloom): ");
                String s = sc.nextLine();
                if (s.equalsIgnoreCase("Mill")) {
                    System.out.println("Your discount is: 10.0%");
                    float amount = pa - (pa * (10.0f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else if (s.equalsIgnoreCase("Handloom")) {
                    System.out.println("Your discount is: 15.0%");
                    float amount = pa - (pa * (15.0f / 100));
                    System.out.println("AMOUNT TO BE PAID: ₹" + amount);
                } else {
                    System.out.println("ERROR");
                }
            } else {
                System.out.println("ERROR");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
