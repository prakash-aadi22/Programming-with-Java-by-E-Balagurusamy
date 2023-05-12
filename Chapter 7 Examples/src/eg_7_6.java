public class eg_7_6 {
    public static void main(String[] args) {
        fun: //LOOP1 or OUTER or ANY VARIABLE NAME CAN BE GIVEN
        for (int i = 1; i < 100; i++) {
            System.out.println(" ");
            if (i >= 10) {
                break;
            }
            for (int j = 1; j < 100; j++) {
                System.out.print(" * ");
                if (j == i) {
                    continue fun;
                }
            }
        }
        System.out.println("Termination by Break");
    }
}
