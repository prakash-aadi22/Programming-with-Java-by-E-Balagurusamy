import java.io.DataInputStream;

public class eg_4_1 {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        int intNumber = 0;
        float floatNumber = 0.0f;
        try {
            System.out.print("Enter an Integer: ");
            intNumber = Integer.parseInt(in.readLine());
            System.out.print("Enter a float number: ");
//            floatNumber = Float.valueOf(in.readLine()).floatValue();
//            floatNumber = Float.valueOf(in.readLine());
            floatNumber = Float.parseFloat(in.readLine());
        System.out.println("intNumber = " + intNumber);
        System.out.println("floatNumber = " + floatNumber);
        } catch (Exception e) {
            System.out.println("Input Error " + e);
        }
    }
}
