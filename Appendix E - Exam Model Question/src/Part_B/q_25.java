package Part_B;

abstract class XY {
    void sum(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
}

public class q_25 {
    public static void main(String[] args) {
        XY xy = new XY() {
            @Override
            void sum(int x, int y) {
                super.sum(x, y);
            }
        };
        xy.sum(22, 9);
    }
}
