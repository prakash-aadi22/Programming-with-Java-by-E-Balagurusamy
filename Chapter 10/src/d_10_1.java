interface famousLine {
    void showLine();
}

class display implements famousLine {
    @Override
    public void showLine() {
        System.out.println("Show Line");
    }
}

public class d_10_1 {
    public static void main(String[] args) {
        System.out.println("Without using POLYMORPHISM: ");
        display d = new display();
        d.showLine();
        System.out.println("With using POLYMORPHISM: ");
        famousLine fl = new display();
        fl.showLine();
    }
}
