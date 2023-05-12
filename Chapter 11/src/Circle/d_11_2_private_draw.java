package Circle;

public class d_11_2_private_draw {
    public static void main(String[] args) {
        System.out.println("Package Creation Done");
        d_11_2 cir = new d_11_2();
        cir.draw();
        cir.getRadius();
    }

    private void draw() {
        System.out.println("Drawing");
    }

    public void getRadius() {
        System.out.println("Radius = Circumference/(2 x π)");
        System.out.println("Radius = √‾(Area/π)");
    }
}
