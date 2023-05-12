package Part_B;

public class q_53 {
    public static void main(String[] args) {
        String s1 = "A", s2 = "b", s3;
        System.out.println("a");
        s3 = s1 + s2;
        System.out.println(s3);
        System.out.println("b");
//        s3 = s1 - s2;
        System.out.println("error");
        System.out.println("c");
//        s1 <= s2;
        System.out.println("error");
        System.out.println("d");
        System.out.println(s1.compareTo(s2));
        System.out.println("e");
        int m = s1.length();
        System.out.println(m);
    }
}
