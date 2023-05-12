import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


public class eg_17_8 {
    public static void main(String[] args) {
/*
//        LinkedList l = new LinkedList();
//        l.add(new String("Java"));
//        l.add(new String("is"));
//        l.add(new String("platform"));
//        l.add(new String("Independent"));
//        Comparator r = Collections.reverseOrder();
//        Collections.sort(l, r);
//        Iterator itr = l.iterator();
//        System.out.println("List sorted in reverse order");
//        while (itr.hasNext()) {
//            System.out.println(itr.next() + "");
//        }
//        Collections.shuffle(l);
//        itr = l.iterator();
//        System.out.println();
//        System.out.println("List shuffled: ");
//        while (itr.hasNext()) {
//            System.out.println(itr.next() + "");
//        }
//        System.out.println();
//        System.out.println("Minimum: " + Collections.min(l));
//        System.out.println("Maximum: " + Collections.max(l));
*/

        LinkedList<String> l = new LinkedList<>();
        l.add("Java");
        l.add("is");
        l.add("platform");
        l.add("Independent");
        Comparator<String> r = Collections.reverseOrder();
        l.sort(r);
        Iterator<String> itr = l.iterator();
        System.out.println("List sorted in reverse order: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        Collections.shuffle(l);
        itr = l.iterator();
        System.out.println();
        System.out.println("List shuffled: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + Collections.min(l));
        System.out.println("Maximum: " + Collections.max(l));
    }
}
