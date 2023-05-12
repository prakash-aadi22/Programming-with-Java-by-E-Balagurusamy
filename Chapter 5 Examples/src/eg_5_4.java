public class eg_5_4 {
    public static void main(String[] args) {
        float sum = 0.0f;
        int i;
        for (i = 1; i<= 10; i++){
            sum = sum + 1 / (float) i;
            System.out.print(" i = " + i);
            System.out.println("    sum = " + sum);
        }
    }
}
