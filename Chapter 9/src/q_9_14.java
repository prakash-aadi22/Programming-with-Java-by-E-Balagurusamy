import java.util.Scanner;

class inputString {
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string(of at least character 26): ");
        String in = sc.nextLine();
        int max = 25;
        int min = 0;
        int m = (min + (int) (Math.random() * ((max - min) + 1)));
        System.out.println(m);
        System.out.println(in.substring(m));
    }
}

public class q_9_14 {
    public static void main(String[] args) {
        try {
            inputString is = new inputString();
            is.input();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
