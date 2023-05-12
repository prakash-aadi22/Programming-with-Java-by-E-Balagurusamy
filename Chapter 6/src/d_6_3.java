import java.util.Scanner;

public class d_6_3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose a number between 0 to 9: ");
            int number = sc.nextInt();
//            switch (number) {
//                case 0:
//                    System.out.println("Number is 0");
//                    break;
//                case 1:
//                    System.out.println("Number is 1");
//                    break;
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("Number is 2, 3 or 4");
//                    break;
//                default:
//                    System.out.println("Number is less than 0 or greater than 4");
//            }
            switch (number) {
                case 0 -> System.out.println("Number is 0");
                case 1 -> System.out.println("Number is 1");
                case 2, 3, 4 -> System.out.println("Number is 2, 3 or 4");
                default -> System.out.println("Number is less than 0 or greater than 4");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
