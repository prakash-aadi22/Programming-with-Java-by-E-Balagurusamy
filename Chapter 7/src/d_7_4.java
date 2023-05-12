public class d_7_4 {
    public static void main(String[] args) {
        int num = 0, fact = 1;
        for (num = 5; num >= 1; num--) {
            fact *= num;
        }
        System.out.println("Factorial of 5 is " + fact);
    }
}
