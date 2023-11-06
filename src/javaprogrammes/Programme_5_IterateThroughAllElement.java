package javaprogrammes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 Iterater.
 */
public class Programme_5_IterateThroughAllElement {

    public static void main(String[] args) {
        arraylist();
    }

    public static void arraylist() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Yellow");
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Orange");
        arrayList.add("Black");
        arrayList.add("White");

        // Iterate through all elements using the iterator
        Iterator<String> iterator = arrayList.iterator();
        {
            while (iterator.hasNext()) {
                String element = iterator.next().toString();
                System.out.print(element + "," + "");
            }

        }
    }


}
