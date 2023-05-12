public class d_9_2 {
    public static void main(String[] args) {
        String[] stringArray = {"Java", "Visual Basic", "VC+ +", "C"};
        System.out.println("***********************************");
        for (String s : stringArray) {
            System.out.print(s + ", ");
        }
        System.out.println("\n---------------------------------");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println("\n---------------------------------");
        for (String s : stringArray) {
            System.out.print(s + ", ");
        }
        System.out.println("\n---------------------------------");
        for (int i = 0; i <= 3; i++) {
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println("\n---------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println("\n*********************************");
    }
}
