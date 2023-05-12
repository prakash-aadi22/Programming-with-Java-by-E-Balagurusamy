class rectangle {
    int length, breadth;

    rectangle(int x, int y) {
        length = x;
        breadth = y;
    }

    int rectArea() {
        return (length * breadth);
    }
}

public class eg_8_2 {
    public static void main(String[] args) {
        rectangle rect = new rectangle(15,10);
        int area = rect.rectArea();
        System.out.println("Area = " + area);
    }
}
