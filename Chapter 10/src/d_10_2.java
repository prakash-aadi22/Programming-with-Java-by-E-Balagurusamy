interface famousLines {
    void showLines();
}

class novel1 implements famousLines {
    @Override
    public void showLines() {
        System.out.println("To be, not to be.");
    }
}

class novel2 {
    public void authorName() {
        System.out.println("Shakespeare");
    }
}

public class d_10_2 {
    public static void main(String[] args) {
        novel1 hamlet = new novel1();
        novel2 juliet = new novel2();
        hamlet.showLines();
        juliet.authorName();
    }
}
