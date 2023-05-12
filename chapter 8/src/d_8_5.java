public class d_8_5 {
//    public String draw(String s) {
//        System.out.println("draw string = " + s);
//        return "Figure Drawn";
//    }
    public void draw(String s) {
        System.out.println("Figure Drawn");
        System.out.println("draw string = " + s);
    }

    public void draw1(String s) {
        System.out.println("draw1 = " + s);
    }

    public void draw(double f) {
        System.out.println("draw double = " + f);
    }

    public static void main(String[] args) {
        d_8_5 d = new d_8_5();
        d.draw("s");
        d.draw1("w1");
        d.draw(1.230);
    }
}
