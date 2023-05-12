import static java.lang.Math.*;

public class eg_11_3 {
    public void circle(double r) {
        double area = PI * r * r;
        System.out.println("The Area of Circle is: " + area);
    }

    public static void main(String[] args) {
        eg_11_3 obj = new eg_11_3();
        obj.circle(2.3);
    }
}
