import java.util.HashSet;
import java.util.Set;

public class d_17_2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        System.out.println("Set1 is: " + set1);
        set1.remove("c");
        System.out.println("Set1 after removing 'c': " + set1);
        int size = set1.size();
        System.out.println("Size of Set1 is: " + size);
        set1.add("a");
        size = set1.size();
        System.out.println("SIze of set1 after adding duplicate item: " + size);
        boolean b = set1.contains("a");
        System.out.println("Is Set1 contains 'a': " + b);
        System.out.println("Is Set1 contains 'c': " + set1.contains("c"));
        Set<String> set2 = new HashSet<>();
        set2.add("e");
        set2.add("d");
        set2.add("f");
        System.out.println("Set2 is: " + set2);
        set2.addAll(set1);
        System.out.println("Set2 after merging set1 elements: " + set2);
        set2.removeAll(set1);
        System.out.println("Set2 is after deleting set1 elements: " + set2);
        set2.addAll(set1);
        set2.retainAll(set1);
        System.out.println("Ste2 is after deleting all elements except set1 elements: " + set2);
    }
}
