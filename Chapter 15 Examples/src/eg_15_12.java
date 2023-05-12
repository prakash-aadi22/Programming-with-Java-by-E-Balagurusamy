import java.awt.*;

public class eg_15_12 {
    public eg_15_12() {
        Frame f = new Frame("AWT Labels");
        Label l1 = new Label("First Label");
        l1.setBounds(10, 40, 160, 30);
        Label l2 = new Label("Second Label");
        l2.setBounds(10, 90, 160, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(400, 150);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new eg_15_12();
    }
}
