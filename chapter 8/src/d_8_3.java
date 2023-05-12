class noDefConst {
    noDefConst(String s) {
        System.out.println("Aditya Prakash");
    }
}

class subClass extends noDefConst {

    subClass(String s) {
        super(s);
    }
}

public class d_8_3 {
    public static void main(String[] args) {
        subClass sbc = new subClass("Rishu");
    }
}
