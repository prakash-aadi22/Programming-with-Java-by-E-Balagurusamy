import java.util.Vector;

public class eg_17_5 {
    public static void main(String[] args) {
//        Vector f = new Vector();
        Vector<String> f = new Vector<>();
        f.add("Apple");
        f.add("Orange");
        f.add("Grapes");
        f.add("Pine");
/*
//        Iterator it = f.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        Iterator<String> it = f.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
*/
        for (String s : f) {
            System.out.println(s);
        }
    }
}
