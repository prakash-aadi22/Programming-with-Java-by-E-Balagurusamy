import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d_17_1 {
    public static void main(String[] args) {
/*
//        List<String> list;
//        list = new ArrayList<String>();
//        list.add("a");
//        list.add(0, "b");
//        list.add(1, "c");
//        list.add(1, "d");
//        list.add(3, "d");
//        System.out.println("List is: " + list);
//        int size = list.size();
//        Object element = list.get(list.size() - 1);
//        System.out.println("Element at: " + list.size() + ", location is: " + element);
//        element = list.get(0);
//        System.out.println("Element at 0 location is: " + element);
//        Collections.sort(list);
//        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
//        System.out.println("List after sort is: " + list);
//        boolean b = list.remove("c");
//        element = list.remove(0);
//        System.out.println("List after removal of c and 1st element: " + list);
*/
        List<String> list;
        list = new ArrayList<>();
        list.add("a");
        list.add(0, "b");
        list.add(1, "c");
        list.add(1, "d");
        list.add(3, "d");
        System.out.println("List is: " + list);
        Object element = list.get(list.size() - 1);
        System.out.println("Element at: " + list.size() + ", location is: " + element);
        element = list.get(0);
        System.out.println("Element at 0 location is: " + element);
        Collections.sort(list);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("List after sort is: " + list);
        list.remove("c");
        list.remove(0);
        System.out.println("List after removal of c and 1st element: " + list);
    }
}
