import javax.swing.*;
import java.awt.*;

public class eg_15_14 {
    public eg_15_14(){
        Frame f = new Frame("Menu and Menu Bars");

        MenuBar mb = new MenuBar();

        Menu fm = new Menu("File");
        Menu em = new Menu("Edit");
        Menu pm = new Menu("Paste");

        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("Open");
        MenuItem i3 = new MenuItem("Save");
        MenuItem i4 = new MenuItem("Save As");
        MenuItem i5 = new MenuItem("Exit");
        MenuItem i6 = new MenuItem("Cut");
        MenuItem i7 = new MenuItem("Copy");
        MenuItem i8 = new MenuItem("Plain Text Paste");
        MenuItem i9 = new MenuItem("Formatted Text Paste");

        pm.add(i8);
        pm.add(i9);
        fm.add(i1);
        fm.add(i2);
        fm.add(i3);
        fm.add(i4);
        fm.add(i5);

        em.add(i6);
        em.add(i7);
        em.add(pm);

        mb.add(fm);
        mb.add(em);

        f.setMenuBar(mb);

        f.setSize(400,150);
        f.setLayout(null);
        f.setVisible(true);

        i2.addActionListener(e -> {
            JFileChooser ch = new JFileChooser();
            ch.showOpenDialog(null);
        });
    }

    public static void main(String[] args) {
        new eg_15_14();
    }
}
