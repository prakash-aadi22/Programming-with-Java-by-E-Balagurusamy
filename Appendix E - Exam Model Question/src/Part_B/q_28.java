package Part_B;


public class q_28 {
    public static void main(String[] args) {

    }

    int sum(int x, int y) {
        System.out.println("");
        return sum(22, 2);
    }

    int sum(int x, int y, int z) {
        System.out.println("a");
        return sum(1, 2, 3);
    }

    float sum1(int x, int y) {
        System.out.println("b");
        System.out.println("error");
        return sum(7, 8);
    }

    int sum(float x, float y) {
        System.out.println("c");
        return sum(4.5f, 2.6f);
    }

    //    int sum(int a, int b) {
    void sum2(int a, int b) {
        System.out.println("d");
        System.out.println("error");
//        return sum(9, 4);
    }

    float sum(int x, int y, float z) {
        System.out.println("e");
        return sum(1, 2, 3.5f);
    }
}
