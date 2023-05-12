interface newShape11{
    void draw11();
    int radius11 = 10;
}
class newCircle11 implements newShape11{
    @Override
    public void draw11(){
        int radius11 = 1;
        System.out.println("Radius is: " + radius11);
    }
}
public class d_10_5 {
    public static void main(String[] args) {
        newShape11 ns = new newCircle11();
        ns.draw11();
    }
}
