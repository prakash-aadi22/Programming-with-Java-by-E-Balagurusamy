class Rectangle {
    int length, breadth;

    void getData(int x, int y) {
        length = x;
        breadth = y;
    }

    int rectArea() {
// int area = length * breadth;
// return (area);
        return (length * breadth);
    }
}

public class eg_8_1 {
    public static void main(String[] args) {

        int area1, area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 15;
        rect1.breadth = 10;
        area1 = rect1.length * rect1.breadth;
        System.out.println("Area1 = " + area1);
        rect2.getData(20, 12);
        area2 = rect2.rectArea();
        System.out.println("Area2 = " + area2);
        rect1.getData(15, 10);
        area1 = rect1.rectArea();
        System.out.println("Area1 = " + area1);
    }
}
