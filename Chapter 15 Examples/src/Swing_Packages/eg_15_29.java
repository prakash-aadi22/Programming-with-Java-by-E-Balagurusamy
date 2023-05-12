package Swing_Packages;

import javax.swing.*;

public class eg_15_29 {
    private eg_15_29() {
        JFrame jf = new JFrame("Swing Application");
        jf.setSize(300,125);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Simple Label with Swing");
        jf.add(jl);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new eg_15_29();
    }
}
