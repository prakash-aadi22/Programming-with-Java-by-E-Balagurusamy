import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class d_17_4 {
    public static void main(String[] args) {
/*
//        Hashtable<String, Integer> hash = new Hashtable<String, Integer>(4);
//        String ob = "ABC";
//        Integer in = new Integer(563);
//        hash.put(ob,in);
//        ob = "XYZ";
//        in = new Integer(129);
//        hash.put(ob,in);
//        ob = "MNO";
//        in = new Integer(6564);
//        hash.put(ob,in);
//        System.out.println(hash);
//        Vector<String> v = new Vector<String>(hash.keySet());
//        Collections.sort(v);
//        for (Enumeration e = v.elements(); e.hasMoreElements();){
//            String key = (String) e.nextElement();
//            Integer val = (Integer) hash.get(key);
//            System.out.println("Key: " + key + "Val: " + val);
//        }
*/

        Hashtable<String, Integer> hash = new Hashtable<>(4);
        String ob = "ABC";
        int in = 563;
        hash.put(ob, in);
        ob = "XYZ";
        in = 129;
        hash.put(ob, in);
        ob = "MNO";
        in = 6564;
        hash.put(ob, in);
        System.out.println(hash);
        Vector<String> v = new Vector<>(hash.keySet());
        Collections.sort(v);
        for (Enumeration<String> e = v.elements(); e.hasMoreElements();){
            String key = e.nextElement();
            Integer val = hash.get(key);
            System.out.println("Key: " + key + ",  Val: " + val);
        }
    }
}
