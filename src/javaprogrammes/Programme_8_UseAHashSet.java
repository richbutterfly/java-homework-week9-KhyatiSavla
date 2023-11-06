package javaprogrammes;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_UseAHashSet {

    public static void integerObject() {
        // Creating a Hashset to store Integer Object

        HashSet<Integer> numberSet = new HashSet<>();
        // Store the number 4,7 and 8
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        //For loop method to check the number is between 1 to 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }

    public static void main(String[] args) { // Main method to print statement
        integerObject(); // Static to static method direct calling

    }
}
