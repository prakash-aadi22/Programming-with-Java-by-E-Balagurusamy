import java.io.BufferedReader;
import java.io.InputStreamReader;

class election {
    public void voter() {
        try {
            int[] candidate = new int[6];
            int spoiltBallot = 0;
            int voters;
            int check, winner = 1, looser = 1;
            String str;
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("                =====ELECTION BOARD=====");
            System.out.print("Enter number of voters appeared for voting : ");
            System.out.flush();
            str = obj.readLine();
            voters = Integer.parseInt(str);
            System.out.println("*************************************************************************************");
            for (int i = 1; i <= voters; i++) {
                System.out.print("Vote given by voter(" + i + ") to Candidate Id : ");
                System.out.flush();
                str = obj.readLine();
                check = Integer.parseInt(str);
                if (check > 5 || check <= 0) {
//                    spoiltBallot = spoiltBallot + 1;
                    spoiltBallot += 1;
                } else {
//                    candidate[check] = candidate[check] + 1;
                    candidate[check] += 1;
                }
            }
            System.out.println("*************************************************************************************");
            System.out.println("VOTING RESULT ARE AS UNDER");
            for (int i = 1; i < 6; i++) {
                System.out.println("CANDIDATE ID : " + i + " has received " + candidate[i] + " Votes");
            }
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (i == 1) {
                        winner = i;
                        looser = i;
                    }
                    if (candidate[i] < candidate[j]) {
                        winner = j;
                    }
                    if (candidate[i] > candidate[j]) {
                        looser = j;
                    }
                }
            }
            System.out.println("*************************************************************************************");
            System.out.println("Conclusion:");
            System.out.println("Winner is Candidate " + winner + " received " + candidate[winner] + " votes.");
            System.out.println("Candidate " + looser + " received the lowest votes that is " + candidate[looser]);
            System.out.println("Spoilt Ballot are : " + spoiltBallot);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}

public class q_9_7 {
    public static void main(String[] args) {
        election e = new election();
        e.voter();
    }
}
