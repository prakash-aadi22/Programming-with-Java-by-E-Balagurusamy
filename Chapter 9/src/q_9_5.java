import java.util.Scanner;

public class q_9_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n1 = sc.nextInt();
            int n = n1 + 1;
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++, i++) {
                    x[i] = i;
                    y[j] = j;
                    if (i == n1 && j == n1) {
                        System.out.println("i = " + i);
                        System.out.println("j = " + j);
                    }
                }
            }
            System.out.println(x[n1]);
            System.out.println(y[n1]);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
