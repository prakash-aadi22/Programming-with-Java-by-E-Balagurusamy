package Part_B;

public class q_84 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 50 / x;
            System.out.println("X = " + x + "Y = " + y);
            System.out.println("Division by Zero");
        } catch (Exception e) {
            System.out.println("Catch Block --> " + e);
        }
    }
}
