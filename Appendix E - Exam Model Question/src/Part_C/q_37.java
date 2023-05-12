package Part_C;

import java.applet.Applet;
import java.awt.*;

public class q_37 extends Applet {
    public static void main(String[] args) {
        System.out.println("""
                < applet
                                      WIDTH = 400  HEIGHT = 200
                                      CODE = HelloJava.Class > // This line will give error.
                < param
                                      NAME = "string"
                                      VALUE = "Hello" >
                </applet>
                """);
    }

    public void paint(Graphics g) {
//        <applet
//                WIDTH = 400 HEIGHT = 200
//        CODE = HelloJava.Class > // This line will give error.
//                <param
//                NAME = "string"
//        VALUE = "Hello" >
//                </applet >
    }
}
