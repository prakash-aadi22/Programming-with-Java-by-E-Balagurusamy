package Part_B;

import java.util.Locale;

public class q_54 {
    public static void main(String[] args) {
        String s = new String("abc");
        System.out.println("a");
        System.out.println(s.trim());
        System.out.println("b");
        System.out.println(s.replace('a', 'A'));
        System.out.println("c");
        System.out.println(s.substring(3));
        System.out.println("d");
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println("e");
//        System.out.println(s.setCharAt(1, 'A'));
        System.out.println("error");
        System.out.println("f");
//        System.out.println(s.append("xyz"));
        System.out.println("error");
    }
}
