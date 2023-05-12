import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class eg_15_15  extends WindowAdapter {
    private final Frame f;
    private eg_15_15(){
        f = new Frame("AWT Closing Frame");
        f.addWindowFocusListener(this);

        f.setSize(500,350);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        f.dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        new eg_15_15();
    }
}
