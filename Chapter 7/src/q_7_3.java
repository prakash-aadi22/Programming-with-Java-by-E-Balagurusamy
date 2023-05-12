public class q_7_3 {
    public static void main(String[] args) {
        System.out.println("QUESTION (a)");
        int count = 0, sum = 1, x = 1;
        while (count != 10) {
//            count = 1; // This is giving an infinite loop
            sum = sum + x;
            count = count + 1;
        }
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("----------------------------------------------");
        System.out.println("QUESTION (b)");
        int name = 0;
        do {
            name = name + 1;
            System.out.println("My name is Aditya Prakash\n");
        } while (name == 1);
        System.out.println("----------------------------------------------");
        System.out.println("QUESTION (c)");
//        for (int y = 1; y > 10; y = y + 1) {
        for (int y = 1; y < 10; y = y + 1) {
            System.out.print(y + ", ");
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("QUESTION (d)");
        int m = 1, n = 0;
        for (; m + n < 19; ++n) {
            System.out.println("Hello\n");
            m = m + 10;
        }
    }
}
