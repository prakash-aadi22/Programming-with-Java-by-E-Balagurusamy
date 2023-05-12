public class d_13_1 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int n1 = Integer.parseInt(args[1]);
            int n2 = n + n1;
            System.out.println(n2);
        } catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception block 1");
        } catch (Exception ex){
            System.out.println("Arithmetic Exception block 2");
        }
    }
}
