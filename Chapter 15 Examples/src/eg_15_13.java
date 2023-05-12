import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg_15_13 implements ItemListener {

    private final Checkbox cbJava, cbPython, cbCPlusPlus;
    private final Label messageLabel;

    public eg_15_13() {
        Frame f = new Frame("Awt CheckBox");

        Font fo = new Font("SansSerif", Font.BOLD, 12);

        cbJava = new Checkbox("Java");
        cbPython = new Checkbox("Python");
        cbCPlusPlus = new Checkbox("C++");
        messageLabel = new Label();

        cbJava.setBounds(10, 40, 160, 30);
        cbPython.setBounds(10, 80, 160, 30);
        cbCPlusPlus.setBounds(10, 120, 160, 30);
        messageLabel.setBounds(10, 160, 160, 100);

        cbJava.setFont(fo);
        cbPython.setFont(fo);
        cbCPlusPlus.setFont(fo);

        f.add(cbJava);
        f.add(cbPython);
        f.add(cbCPlusPlus);
        f.add(messageLabel);

        cbJava.addItemListener(this);
        cbPython.addItemListener(this);
        cbCPlusPlus.addItemListener(this);

        f.setSize(400, 350);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new eg_15_13();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String text = "";
        text += "Language:";
        text += "Java: " + cbJava.getState();
        text += "Python: " + cbPython.getState();
        text += "C++: " + cbCPlusPlus.getState();
        messageLabel.setText(text);
    }
}
