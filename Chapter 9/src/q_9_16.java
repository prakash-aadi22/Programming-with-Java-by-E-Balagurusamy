import java.util.Scanner;

class statement {
    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String st = sc.nextLine();
        int l = st.length();
        st = st.toUpperCase();
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < l; j++) {
                char ch = st.charAt(j);
                if (i == ch)
                    System.out.print((char) i);
            }
        }
    }
}

public class q_9_16 {
    public static void main(String[] args) {
        try {
            statement stm = new statement();
            stm.display();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
