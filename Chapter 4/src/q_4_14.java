public class q_4_14 {
    public static void main(String[] args) {
        try {
            float max = 1000f;
            float min = 1f;
            float price = (float) (min + (Math.random() * ((max - min) + 1)));
            System.out.printf("PRICE in RUPEES: ₹%.2f\n", price);
            int paise = (int) (price * 100);
            System.out.println("PRICE in PAISE: " + paise + " paise");
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
