import java.util.Vector;

public class d_17_3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(15);
        int i;
        System.out.println("starting...");
        for (i = 0; i < 2; i++) {
            v.add(args[i]);
            System.out.println(args[i] + " added to vector");
        }
        System.out.println("Converting to array");
        String[] list = new String[v.size()];
        v.copyInto(list);
        System.out.println("Printing array");
        for (i = 0; i < v.size(); i++) {
            System.out.println("Element at " + i + " location is " + list[i]);
        }
    }
}
