interface newShapes {
    void draws();
}

class newCircle1 implements newShapes {
    @Override
    public void draws() {
        System.out.println("New Circle 1 Drawn");
    }
}

class newCircle2 implements newShapes {
    @Override
    public void draws() {
        System.out.println("New Circle 2 Drawn");
    }
}

public class d_10_4 {
    public static void main(String[] args) {
        newShapes nc1 = new newCircle1();
        newShapes nc2 = new newCircle2();
        nc1.draws();
        nc2.draws();
    }
}
