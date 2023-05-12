import java.util.ArrayList;

public class eg_17_1 {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of ArrayList: " + al.size());
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println("Size of the ArrayList after adding the elements: " + al.size());
        System.out.println("Contents of ArrayList: " + al);
        al.add(2,"E");
        System.out.println("Changed contents of ArrayList by adding element at the given index: " + al);
        al.remove(3);
        al.remove("A");
        System.out.println("Changed contents of ArrayList by removing element form the list: " + al);
    }
}
