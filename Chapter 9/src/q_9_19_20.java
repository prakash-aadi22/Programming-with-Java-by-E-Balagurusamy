import java.util.ArrayList;
import java.util.Scanner;

class shop {
    public void list() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of items of the shopping list: ");
        ArrayList<String> aList = new ArrayList<>();
        aList.add(sc.nextLine());
        aList.add(sc.nextLine());
        aList.add(sc.nextLine());
        aList.add(sc.nextLine());
        aList.add(sc.nextLine());

        System.out.println("Shopping List: " + aList);
        System.out.println("Delete an item: (Number should be between 0 and 5) ");
        System.out.print("Enter the rank number: ");
        aList.remove(sc.nextInt());
        System.out.println("Shopping List: " + aList);
        System.out.println("Add an item at specified location: (Number should be between 0 and 5) ");
        System.out.print("Enter the rank number first and then the name of of the item: ");
        aList.add(sc.nextInt(), sc.nextLine());
        System.out.println("Shopping List: " + aList);
        System.out.println("Add an item at the end of the list: ");
        System.out.print("Enter the name of the item: ");
        aList.add(sc.nextLine());
        System.out.println("Shopping List: " + aList);
    }
}

public class q_9_19_20 {
    public static void main(String[] args) {
        try {
            shop b = new shop();
            b.list();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
