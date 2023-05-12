public class d_13_5 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int n1 = Integer.parseInt(args[1]);
            int n2 = n + n1;
            System.out.println("Sum is: " + n2);
            int n9 = 1, n19 = 0, n29 = n9 / n19;
            System.out.println("Answer: " + n29);
        } catch (NumberFormatException ex) {
            System.out.println("Does not print: " + ex);
        } catch (Exception e) {
            System.out.println("Does print: " + e);
        }
    }
}
