public class eg_4_reading_input_keyboard {
    public static void main(String[] args) {
        System.out.print("What is your name: ");
        String name = System.console().readLine(); // The Console class can't be used in any IDEs
        System.out.println("Your name is: " + name);
    }
}
