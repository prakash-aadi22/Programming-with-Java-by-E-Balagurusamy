abstract class figure {
    int x, y;

    void changePosition(int newX, int newY) {
        System.out.println("Figure Method");
    }

    abstract void draw();
}

class circleObject extends figure {
    void draw() {
        System.out.println("Draw Method Called");
    }
}

abstract class rectangleObject extends figure {
    void changePosition(int newX, int newY) {
        System.out.println("Change Position Method  Called");
    }
}

public class d_8_4 {
    public static void main(String[] args) {
        circleObject co = new circleObject();
        co.changePosition(1, 2);
        co.draw();
        co.x = 8;
        co.y = 9;
        co.changePosition(co.x, co.y);
    }
}
