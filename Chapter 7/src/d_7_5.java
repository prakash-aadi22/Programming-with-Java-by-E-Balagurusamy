import java.util.Scanner;

public class d_7_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] array = {32, 87, 3, 586, 12, 1076, 2000, 8, 622, 127};
//        int searchVal = 12;
            System.out.print("Enter a number: ");
            int searchVal = sc.nextInt();
            int i = 0;
            boolean found = false;
            for (; i < array.length; i++) {
                if (array[i] == searchVal) {
                    found = true;
                    System.out.print("At Index " + i);
                }
            }
            if (found) {
                System.out.println(", " + searchVal + " is found.");
            } else {
                System.out.println(searchVal + " is not in the array");
            }
        } catch (Exception e) {
            System.out.println("I/O Error");
        }
    }
}
