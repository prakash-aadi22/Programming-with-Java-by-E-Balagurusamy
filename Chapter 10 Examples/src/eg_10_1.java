interface area {
    float pi = 3.14f;

    float compute(float x, float y);
}

class rectangle implements area {
    @Override
    public float compute(float x, float y) {
        return (x * y);
    }
}

class circle implements area {
    @Override
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

public class eg_10_1 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        circle cir = new circle();
        System.out.println("Area of Rectangle = " + rect.compute(10, 20));
        System.out.println("Area of Circle = " + cir.compute(10, 0));
    }
}
