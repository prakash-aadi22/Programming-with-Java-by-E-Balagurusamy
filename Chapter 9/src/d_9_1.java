import java.util.Scanner;

public class d_9_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int len = sc.nextInt();
            int[] anArray = new int[len];
            for (int i = 0; i < anArray.length; i++) {
                anArray[i] = i;
                System.out.print(anArray[i] + ", ");
            }
            System.out.println(len);
        } catch (Exception e){
            System.out.println("Input Error\n" + e);
        }
    }
}
