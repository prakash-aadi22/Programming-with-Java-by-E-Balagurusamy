package Part_C;

public class q_41 {
    public static void main(String[] args) {
        int m = 0;
        loop1:
        for (int i = 0; i < 10; i++) {
            loop2:
            for (int j = 0; j < 10; j++) {
                loop3:
                for (int k = 0; k < 10; k++) {
                    System.out.println(++m);
                    if ((k % 10) == 0) {
                        continue loop2;
                    }
                }
            }
        }
    }
}
