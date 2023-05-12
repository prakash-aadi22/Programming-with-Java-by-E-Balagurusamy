package Part_B;

public class q_4 {
    char name; //unassigned

    public static void main(String[] args) {
        char a = '\u0020';
        char b = '\u00ff';
//        char c = " ";
        char d = '\u0000';
        System.out.println("a - " + a);
        System.out.println("b - " + b);
        System.out.println("c - error");
        System.out.println("d - " + d);

        q_4 d1 = new q_4();
        d1.print();
    }

    public void print() {
        System.out.println("Default value of char num: " + name);
    }
}
