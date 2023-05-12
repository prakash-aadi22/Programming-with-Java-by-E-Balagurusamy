package Swing_Packages;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class eg_15_30 {
    public eg_15_30() throws MalformedURLException {
        JFrame jf = new JFrame("Swing Application");
        jf.setSize(300, 125);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String imageUrl = "https://upload.wikimedia.org/wikipedia/fr/thumb/2/2e/Java_Logo.svg/197px-Java_Logo.svg.png";
        URL domain = new URL(imageUrl);
        ImageIcon ic = new ImageIcon(domain, "Java");
        JLabel jl = new JLabel(ic, JLabel.CENTER);
        jf.add(jl);
        jf.setVisible(true);
    }

    public static void main(String[] args) throws MalformedURLException {
        new eg_15_30();
    }
}
