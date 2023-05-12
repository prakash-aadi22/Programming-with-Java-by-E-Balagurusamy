package Part_C;

class Square {
    private void square() {
    }

    int area(int side) {
        return (side * side);
    }
}

public class q_35 {
    public static void main(String[] args) {
        Square s1 = new Square();
        int area = s1.area(10);
        System.out.println(area);
    }
}
