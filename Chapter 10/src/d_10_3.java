interface newShape {
    void draw();
}

interface circle extends newShape {
    void getRadius();

    int radius = 10;
}

class newCircle implements circle {
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public void getRadius() {
        System.out.println(radius);
    }
}

class extendInterface extends newCircle {
    public static void main(String[] args) {
        circle nc = new newCircle();
        System.out.println("Using POLYMORPHISM 3: ");
        nc.getRadius();
    }
}

//public class d_10_3 extends newCircle {
//    public static void main(String[] args) {
//        circle nc = new newCircle();
//        System.out.println("Using POLYMORPHISM: ");
//        nc.draw();
//        nc.getRadius();
//    }
//}

public class d_10_3 {
    public static void main(String[] args) {
        circle nc = new newCircle();
        System.out.println("Using POLYMORPHISM 1: ");
        nc.draw();
        nc.getRadius();
        System.out.println("Using POLYMORPHISM 2: ");
        newCircle ncy = new extendInterface();
        ncy.draw();
        ncy.getRadius();
        System.out.println("Without using POLYMORPHISM: ");
        extendInterface ei = new extendInterface();
        ei.draw();
        ei.getRadius();
    }
}
