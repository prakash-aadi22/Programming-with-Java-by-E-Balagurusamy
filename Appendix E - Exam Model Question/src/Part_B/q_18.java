package Part_B;

public class q_18 {
    public static void main(String[] args) {
        System.out.println("a");
//        while ( int i > 0){
//            i--;
//            System.out.println(i);
//        }
        System.out.println("error");
        System.out.println("b");
//        for (int i = 10, int j = 0;
//        i + j > 5;
//        i = i - 2, j++){
//            System.out.println(i);
//            System.out.println(j);
//        }
        System.out.println("error");
        System.out.println("c");
//        int i = 10;
//        while (i){
//            System.out.println(i);
//        }
        System.out.println("error");
        System.out.println("d");
        int i = 1, sum = 0;
        do {
            i++;
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        } while (sum < 10 || i < 5);
        System.out.println("done");
        int k, m;
        for (k = 10, m = 0; k + m > 5; k = m - 2, m++) {
            System.out.println(k);
            System.out.println(m);
        }
    }
}
