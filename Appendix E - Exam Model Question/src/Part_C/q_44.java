package Part_C;

public class q_44 {
    public static void main(String[] args) {
        try {
            double x = 0.0;
            throw (new Exception("Thrown"));
//            return;
        } catch (Exception e) {
            System.out.println("Exception caught");
            return;
        } finally {
            System.out.println("Finally");
        }
    }
}
