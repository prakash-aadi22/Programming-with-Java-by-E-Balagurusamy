import java.util.Scanner;

class questions {
    public void question() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: Who is the inventor of java ?");
        System.out.print("Enter 'Y' for accepting the question or 'N' for rejecting: ");
        String ask = sc.nextLine();
        if (ask.equalsIgnoreCase("Y")) {
            System.out.print("Enter your answer here: ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("James Gosling")) {
                System.out.println("Good");
            } else {
                System.out.print("Try Again: ");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("James Gosling")) {
                    System.out.println("Good");
                } else {
                    System.out.print("Try Again: ");
                    ans = sc.nextLine();
                    if (ans.equalsIgnoreCase("James Gosling")) {
                        System.out.println("Good");
                    } else {
                        System.out.println("Your answer is wrong.\nCorrect answer is: James Gosling");
                    }
                }
            }
        } else if (ask.equalsIgnoreCase("N")){
            System.out.println("Thank you");
            System.exit(0);
        }
        else {
            System.out.println("Input Error");
        }
    }
}

public class q_9_13 {
    public static void main(String[] args) {
        try {
            questions q = new questions();
            q.question();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
