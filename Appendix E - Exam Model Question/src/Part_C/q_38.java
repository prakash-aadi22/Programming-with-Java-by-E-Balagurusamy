package Part_C;

public class q_38 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("String");
        if ((s.length() > 5) && (s.append("Buffer").equals("X")))
            ;
        System.out.println(s);
    }
}
