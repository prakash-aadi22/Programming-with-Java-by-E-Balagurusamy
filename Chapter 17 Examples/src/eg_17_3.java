import java.util.HashSet;

public class eg_17_3 {
    public static void main(String[] args) {
//        HashSet hs = new HashSet();
        HashSet<String> hs = new HashSet<>();
        hs.add("D");
        hs.add("A");
        hs.add("C");
        hs.add("B");
        hs.add("E");
        System.out.println("The elements available in the hash set are: " + hs);
    }
}
