import java.util.Enumeration;
import java.util.Hashtable;

public class eg_17_7 {
    public static void main(String[] args) {
//        Hashtable ht = new Hashtable();
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Item1", "Apple");
        ht.put("Item2", "Orange");
        ht.put("Item3", "Grapes");
        ht.put("Item4", "Pine");
        Enumeration<String> e = ht.keys();
        while (e.hasMoreElements()) {
//            String str = (String) e.nextElement();
            String str = e.nextElement();
            System.out.println(ht.get(str));
        }
    }
}
