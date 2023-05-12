package Part_B;

public class q_47 {
    public static void main(String[] args) {
        int[][] table = new int[9][9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
