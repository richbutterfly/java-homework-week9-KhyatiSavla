package javaprogrammes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {

    public static void main(String[] args) { // main method
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index number to retrieve: ");
        int index = scanner.nextInt();
        Programme_6_RetrieveAnElement obj = new Programme_6_RetrieveAnElement(); // create object for calling instance method
        obj.arrayList(index); // calling instance method into the main method
        // Closing the scanner object
        scanner.close();
    }

    public void arrayList(int index) {

        ArrayList<String> daysList = new ArrayList<>();
        // Add elements in the array list
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        daysList.add("Sunday");
        // if else statement
        if (index < daysList.size()) {
            System.out.println(daysList.get(index)); // get method
        } else {
            System.out.println("Invalid Index"); // error message
        }

    }

}
