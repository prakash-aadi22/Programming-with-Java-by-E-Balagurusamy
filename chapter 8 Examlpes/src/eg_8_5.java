import java.util.Scanner;

class nesting {
    int m, n;

    nesting(int x, int y) {
        m = x;
        n = y;
    }

    int largest() {
//        if (m > n) {
//            return m;
//        } else {
//            return n;
//        }
        return Math.max(m, n);
    }

    void display() {
        int large = largest();
        System.out.println("Largest value = " + large);
    }
}

public class eg_8_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your first number: ");
            int x = sc.nextInt();
            System.out.print("Enter your second number: ");
            int y = sc.nextInt();
            nesting nest = new nesting(x, y);
            nest.display();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
