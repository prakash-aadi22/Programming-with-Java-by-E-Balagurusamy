import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class d_15_6 {
    private d_15_6() throws MalformedURLException {
        JFrame jf = new JFrame("Title -- d_15_6");
        jf.setSize(300, 125);
        jf.setVisible(true);

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String imageUrl = "https://upload.wikimedia.org/wikipedia/fr/thumb/2/2e/Java_Logo.svg/197px-Java_Logo.svg.png";
        URL domain = new URL(imageUrl);
        ImageIcon ic = new ImageIcon(domain, "Java");
        JLabel jl = new JLabel(ic, JLabel.CENTER);
        jf.add(jl);
        jf.setVisible(true);
    }

    public static void main(String[] args) throws MalformedURLException {
        new d_15_6();
    }
}
