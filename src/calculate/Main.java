package calculate;
/** 4. Write a “main” method into the main class. It has a scanner that takes
 user input. Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 other symbols.
 5. With the result it’s also print one more message “Would you like to do
 more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 enter Y program asking the user to enter First Number, and if user enter
 N programme should terminate)
 */

import java.util.Scanner;

public class Main extends Calculate {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        char result;
        do {
            System.out.println("Please enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/");
            char symbol = scanner.next().charAt(0);
            Calculate obj = new Calculate();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N': ");
            result = scanner.next().charAt(0);
        }
        while (result == 'Y' || result == 'y'); // while loop method
        System.out.println("The program is terminated");
        // Closing the scanner object
        scanner.close();
    }


}








