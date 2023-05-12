package cricket;

import java.util.Scanner;

/**
 * Entry point of application, Main method
 **/
public class App {
    public static void main(String[] args) throws Exception {
        CricBuzz c = new CricBuzz();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \n 1. Get Details of Live Matches \n 2. If you already know matchID, press 2 \\n Enter your input ...");
        System.out.println();
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                    // If choice = 1, print summary of live matches and exit
                    c.printLiveMatches();
            case 2 -> {
                /*
                 * If choice =2, ask user to enter the ID of desired match
                 * If ID is correct,
                 * print the detailed score of the match
                 */
                System.out.println("Enter the ID of the match, to see its score ...");
                String matchId = sc.next();
                c.printScoreOfSelectedMatch(matchId);
            }
            default -> throw new IllegalArgumentException(String.format("Choice % d is invalid", choice));
        }
        System.out.println("********************END OF PROGRAM *************************");
    }
}