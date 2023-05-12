import java.awt.*;

public class eg_15_11 {
    private eg_15_11(){
        Frame f = new Frame("AWT Frame and Button");
        Button b = new Button("I am Button");
        b.setBounds(30,50,150,50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new eg_15_11();
    }
}
