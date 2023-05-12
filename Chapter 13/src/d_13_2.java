public class d_13_2 {
    public static void main(String[] args) {
        try {

            int n = Integer.parseInt(args[0]);
            int n1 = Integer.parseInt(args[1]);
            int n2 = n + n1;
            System.out.println("Sum is: " + n2);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Format Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
