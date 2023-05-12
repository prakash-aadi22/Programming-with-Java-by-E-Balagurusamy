import java.util.Scanner;

public class q_5_8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of Initial Velocity (in meters per second): ");
            float u = sc.nextFloat();
            System.out.println("Initial Velocity = " + u + " m/s");
            System.out.print("Enter the value of Acceleration (in meters per second square): ");
            float a = sc.nextFloat();
            System.out.println("Acceleration = " + a + " m/s^2");
            System.out.print("Enter the value of Time Interval (in second): ");
            float t = sc.nextFloat();
            System.out.println("Time Interval = " + t + " s");
            double s = u * t + (a * t * t) / 2;
            System.out.println("The distance travelled (in meters): " + s + " m");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
