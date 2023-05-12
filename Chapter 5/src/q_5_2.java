import java.util.Scanner;

public class q_5_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Question (a)");
            System.out.println("Area = π * r^2 + 2 * π * r * h");
            System.out.print("Enter the value of radius (in meter): ");
            float radius = sc.nextFloat();
            System.out.print("Enter the value of height (in meter): ");
            float height1 = sc.nextFloat();
            double area = ((Math.PI * radius * radius) + (2 * Math.PI * radius * height1));
            System.out.println("Area = " + area + " m^2");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (b)");
            System.out.println("Torque = (2 * M * m / M + m) * g");
            float g = 9.8f;
            System.out.print("Enter the value of M: ");
            float m1 = sc.nextFloat();
            System.out.print("Enter the value of m: ");
            float m2 = sc.nextFloat();
            double torque = (((2 * m1 * m2) / (m1 + m2)) * g);
            System.out.println("Torque = " + torque + " N⋅m or kg⋅m^2⋅s^2");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (c)");
            System.out.println("Side = √a^2 + b^2 - 2 * a * b * cos(x)");
            System.out.print("Enter the value of a: ");
            float a = sc.nextFloat();
            System.out.print("Enter the value of b: ");
            float b = sc.nextFloat();
            System.out.print("Enter the value of x: ");
            float x = sc.nextFloat();
            double side = Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(x)));
            System.out.println("Side = " + side);
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Question (d)");
            System.out.println("Energy = mass * (acceleration * height + (velocity^2 / 2))");
            System.out.print("Enter the value of mass: ");
            float mass = sc.nextFloat();
            System.out.print("Enter the value of acceleration: ");
            float acceleration = sc.nextFloat();
            System.out.print("Enter the value of height: ");
            float height = sc.nextFloat();
            System.out.print("Enter the value of velocity: ");
            float velocity = sc.nextFloat();
            double energy = mass * (acceleration * height + ((velocity * velocity) / 2));
            System.out.println("Energy = " + energy);
            System.out.println("-----------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
