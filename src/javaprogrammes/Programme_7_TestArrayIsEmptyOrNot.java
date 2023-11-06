package javaprogrammes;

import java.util.ArrayList;

//7. Write a Java program to test if an array list is empty or not
public class Programme_7_TestArrayIsEmptyOrNot {

    public static void main(String[] args) { // Main method
        // Creating an object to call instance method into main method
        Programme_7_TestArrayIsEmptyOrNot obj = new Programme_7_TestArrayIsEmptyOrNot();
        obj.method1();
    }

    public void method1() {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Before adding elements: ");
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty. ");
        } else {
            System.out.println("The ArrayList is not empty. ");
        }
        System.out.println();
        System.out.print("After adding elements: ");
        // Adding value in the  array list
        arrayList.add("BMW");
        arrayList.add("Tesla");
        arrayList.add("Audi");
        arrayList.add("Ford");
        arrayList.add("Toyota");
        System.out.print(arrayList);
        System.out.println();

        //Checking the array list is empty or not using if-else method
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty. ");
        } else {
            System.out.println("The ArrayList is not empty. ");
        }
    }
}


