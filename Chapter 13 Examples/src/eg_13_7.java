class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class eg_13_7 {
    public static void main(String[] args) {
        int x = 5, y = 1000;
        try {
            float z = (float) x / (float) y;
            if (z < 0.01) {
                throw new MyException("Number is too small");
            } else {
                System.out.println(z);
            }
        } catch (MyException e) {
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am always here");
        }
        System.out.println("------------------------------------------------------------------------------------");
        int a = 5, b = 1000;
        try {
            float z1 = (float) a / (float) b;
            if (z1 < 0.01) {
                System.out.println("Number is too small");
            } else {
                System.out.println(z1);
            }
        } catch (Exception ex) {
            System.out.println("Caught my exception\n" + ex);
        } finally {
            System.out.println("I am always here");
        }
    }
}
