package Part_B;

public class q_12 {
    public static void main(String[] args) {
        String b = "b";
        String c = "c";
        for (int i = 1; i <= 5; i++) {
            b = b + i;
            c += i;
        }
        System.out.println("b - " + b);
        System.out.println("c - " + c);

//        String a = "Adi" - "tya";
        System.out.println("a -- error");
        String b1 = "Adi" + "tya";
        System.out.println("b -- " + b);
        System.out.println("b1 -- " + b1);
//        String c1 = "Adi" += "tya";
        System.out.println("c -- " + c);
//        String d = "Adi" & "tya";
        System.out.println("d -- error");
//        String e = "Adi" << "tya";
        System.out.println("e -- error");
    }
}
