package javaprogrammes;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_UseAHashMap {

    public void hashMapObject() {
        // Create the hash map object as Months

        HashMap<Integer, String> months = new HashMap<>();
        // Adding the value
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");

        // for each loop to iterate the value from Map
        for (Map.Entry<Integer, String> monthsName : months.entrySet()) {
            System.out.println(monthsName.getKey() + " = " + monthsName.getValue());
        }
    }

    public static void main(String[] args) {
        // Creating object for calling instance method into main method
        Programme_9_UseAHashMap obj = new Programme_9_UseAHashMap();
        obj.hashMapObject();
    }
}
