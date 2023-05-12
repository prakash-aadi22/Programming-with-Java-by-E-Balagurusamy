package Part_C;

public class q_28 {
    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.print(args[i]);
            if (i != args.length) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}
