import java.util.Scanner;

public class q_4_15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the temperature of FAHRENHEIT: ");
            float f = sc.nextFloat();
            System.out.println("The temperature in FAHRENHEIT: " + f + "°F");
            float c = (f - 32) / 1.8f;
            System.out.println("The temperature in CELSIUS: " + c + "°C");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("Enter the temperature of CELSIUS: ");
            float c1 = sc.nextFloat();
            System.out.println("The temperature in CELSIUS: " + c1 + "°C");
            float f1 = ((c1 * 1.8f) + 32);
            System.out.println("The temperature in FAHRENHEIT: " + f1 + "°F");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
