import java.util.Scanner;

public class q_7_8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of terms upto you want the Fibonacci series: ");
            int n = sc.nextInt();
            System.out.println("Fibonacci Series till " + n + " terms:");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("USING WHILE LOOP");
            int whileFirstTerm = 0, whileSecondTerm = 1, whileI = 1, whileNextTerm;
            while (whileI <= n) {
                whileI++;
                System.out.print(whileFirstTerm + ", ");
                whileNextTerm = whileFirstTerm + whileSecondTerm;
                whileFirstTerm = whileSecondTerm;
                whileSecondTerm = whileNextTerm;
            }
            System.out.print("\b\b");
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("USING DO-WHILE LOOP");
            int doFirstTerm = 0, doSecondTerm = 1, doI = 1, doNextTerm;
            do {
                if (n == 0) {
                    System.out.print("");
                } else {
                    doI++;
                    System.out.print(doFirstTerm + ", ");
                    doNextTerm = doFirstTerm + doSecondTerm;
                    doFirstTerm = doSecondTerm;
                    doSecondTerm = doNextTerm;
                }
            } while (doI <= n);
            System.out.print("\b\b");
            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.println("USING FOR LOOP");
            int forFirstTerm = 0, forSecondTerm = 1, forNextTerm;
            for (int j = 1; j <= n; j++) {
                System.out.print(forFirstTerm + ", ");
                forNextTerm = forFirstTerm + forSecondTerm;
                forFirstTerm = forSecondTerm;
                forSecondTerm = forNextTerm;
            }
            System.out.print("\b\b");
            System.out.println("\n-----------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
