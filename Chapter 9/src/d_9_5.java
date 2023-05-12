public class d_9_5 {
    public static void main(String[] args) {
        try {
            String s = "ADMIN";
            int i = Integer.parseInt(s, 27);
            System.out.print("Hex Value of: " + s + " = " + i);
        } catch (Exception e){
            System.out.println("" + e);
        }
    }
}
