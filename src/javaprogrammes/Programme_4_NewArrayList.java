package javaprogrammes;

import java.util.ArrayList;

/**
 * 4.Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class Programme_4_NewArrayList {

    public static void main(String[] args) {
        Programme_4_NewArrayList obj = new Programme_4_NewArrayList();
        obj.arrayList();
    }

    public void arrayList() {
        ArrayList<String> colours = new ArrayList<>();
        // Add some colours in the array
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Purple");
        colours.add("Black");
        colours.add("White");

        // Print out the collection using for each loop
        System.out.print("Colours in the array list: ");
        for (String colour : colours) {
            System.out.print(colour + "," + " ");

        }
    }

}
