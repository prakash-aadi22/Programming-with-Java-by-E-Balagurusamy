import java.awt.*;

public class eg_15_10 {
//    private canvasDemo(){
    private eg_15_10(){
        Frame f = new Frame("AWT Canvas by Aditya Prakash");
        f.add(new awtCanvas());
        f.setSize(500,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
//        new canvasDemo();
        new eg_15_10();
    }
    static class awtCanvas extends Canvas{
        awtCanvas(){
            setBackground(Color.RED);
            setSize(400,300);
        }
    }
    public void paint(Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillRect(10,10,150,100);
    }
}
