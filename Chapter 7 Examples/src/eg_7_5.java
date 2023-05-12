import java.util.ArrayList;
import java.util.Collection;

public class eg_7_5 {
    public static void main(String[] args) {
        String[] states = {"Bihar", "Uttar Pradesh", "Jharkhand", "Tamil Nadu", "Rajasthan"};
        System.out.println("Standard 'for' loop");
        for (int i = 0; i < states.length; i++) {
            System.out.println("State Name: " + states[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Enhanced 'for' loop or 'for each' loop");
        for (String state : states) {
            System.out.println("State Name: " + state);
        }
        System.out.println();
        for (String i : states) {
            System.out.println("State Name: " + i);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("****************************************************************************************");
        System.out.println("----------------------------------------------------------------------------------------");
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Bokaro Steel City");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Chennai");
        System.out.println("Standard 'for' loop");
        for (int i = 0; i< cities.size();i++){
            System.out.println("City Name: " + cities.get(i));
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Enhanced 'for' loop or 'for each' loop");
        for (String city : cities) {
            System.out.println("City Name: " + city);
        }
        System.out.println();
        for (String i : cities) {
            System.out.println("City Name: " + i);
        }
        System.out.println("\nIn Collection\n");
        printCollection(cities);
    }
        public static<AnyType> void printCollection(Collection<AnyType> c){
            for (AnyType val: c) {
                System.out.println(val);
            }
    }
}
