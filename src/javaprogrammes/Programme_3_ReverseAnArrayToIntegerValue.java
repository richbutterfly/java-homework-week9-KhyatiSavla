package javaprogrammes;

// 3.Write a Java program to reverse an array of integer values
public class Programme_3_ReverseAnArrayToIntegerValue {
    public void reverseArray() {
        int[] arr = {6, 7, 8, 9, 10}; // initialize array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print original array
        }
        System.out.println("");
        System.out.println("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); // Print reverse array
        }

    }
    public static void main(String[] args) { // main method to print statement
        //Object creation to call instance method into main method
        Programme_3_ReverseAnArrayToIntegerValue obj = new Programme_3_ReverseAnArrayToIntegerValue();
        obj.reverseArray();
    }
}