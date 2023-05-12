package Part_B;

public class q_21 {
    public static void main(String[] args) {
        int j = 0;
        while (j < 10) {
            j++;
            if (j == 5) {
                continue;
            }
            System.out.println("j is " + j);
        }
    }
}
