package Part_B;

public class q_52 {
    public static void main(String[] args) {
        String s1 = "yes";
        String s2 = "yes";
        String s3 = new String(s1);
        if (s1 == s2){
            System.out.println("s1 == s2");
        }
        if (s1.equals(s2)){
            System.out.println("s1.equals(s2)");
        }
        if (s1 == s3){
            System.out.println("s1 == s3");
        }
        if (s1.equals(s3)){
            System.out.println("s1.equals(s3)");
        }
        System.out.println("--------------------------------------------");
        if (s2 == s1){
            System.out.println("s2 == s1");
        }
        if (s2.equals(s1)){
            System.out.println("s2.equals(s1)");
        }
        if (s2 == s3){
            System.out.println("s2 == s3");
        }
        if (s2.equals(s3)){
            System.out.println("s2.equals(s3)");
        }
        System.out.println("--------------------------------------------");
        if (s3 == s1){
            System.out.println("s3 == s1");
        }
        if (s3.equals(s1)){
            System.out.println("s3.equals(s1)");
        }
        if (s3 == s2){
            System.out.println("s3 == s2");
        }
        if (s3.equals(s2)){
            System.out.println("s3.equals(s2)");
        }
    }
}
