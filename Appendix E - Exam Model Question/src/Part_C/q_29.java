package Part_C;

public class q_29 {
    public static void main(String[] args) {
        StringBuffer city = new StringBuffer("Madras");
        StringBuffer string = new StringBuffer();
        string.append(new String(city));
        string.insert(0,"Central ");
        System.out.println(string);
    }
}
