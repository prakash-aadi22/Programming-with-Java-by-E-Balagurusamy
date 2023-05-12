import java.util.TreeSet;

public class eg_17_4 {
    public static void main(String[] args) {
//        TreeSet ts = new TreeSet();
        TreeSet<String> ts = new TreeSet<>();
        ts.add("B");
        ts.add("C");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        System.out.println("Teh elements in the TreeSet are: " + ts);
    }
}
