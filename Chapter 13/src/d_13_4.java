class myException extends Exception {
    myException(String s) {
        super(s);
    }
}

public class d_13_4 {
    public static void main(String[] args) {
        if (args[0].equals("Hello")) {
            System.out.println("String is right");
        } else {
            try {
                throw new myException("Invalid String");
            } catch (myException ex) {
                System.out.println("Does not print: " + ex.getMessage());
            }  catch (Exception e) {
                System.out.println("Does print: " + e);
            }
        }
    }
}
