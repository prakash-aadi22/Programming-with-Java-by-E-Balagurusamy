import java.util.Vector;

public class eg_9_5 {
    public static void main(String[] args) {
//        Vector list = new Vector();
        Vector<String> list = new Vector<>();
//        int length = args.length;
        for (String arg : args) {
            list.addElement(arg);
        }
        list.insertElementAt("COBOL", 0);
        int size = list.size();
        String[] listArray = new String[size];
        list.copyInto(listArray);
        System.out.println("List of Languages:");
        for (int i = 0; i < size; i++) {
            System.out.println(listArray[i]);
        }
    }
}
