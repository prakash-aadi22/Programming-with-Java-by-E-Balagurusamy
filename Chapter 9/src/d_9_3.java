public class d_9_3 {
    public static void main(String[] args) {
        String palindrome = "rod saw I was doR";
        System.out.println("Palindrome: " + palindrome);
        int len = palindrome.length();
        StringBuilder dest = new StringBuilder();
        for (int i = (len - 1); i >= 0; i--) {
            dest.append(palindrome.charAt(i));
        }
        System.out.format("%s%n", dest);
        System.out.println("****************************************************************************");
        String palindrome1 = ("Rod saw I was Dor");
        System.out.println("Palindrome1: " + palindrome1);
        int len1 = palindrome.length();
        StringBuffer dest1 = new StringBuffer();
        for (int i = (len1 - 1); i >= 0; i--) {
            dest1.append(palindrome1.charAt(i));
        }
        System.out.format("%s%n", dest1.toString());
    }
}
