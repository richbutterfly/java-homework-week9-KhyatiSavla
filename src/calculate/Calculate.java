package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */
public class Calculate { // Class name
    // Creating four instance method with no return type
    public void addition(int a, int b) {
        int x = a + b;
        System.out.println("Addition is: "+ x);
    }

    public void subtraction(int a, int b) {
        int y = a - b;
        System.out.println("Subtraction is: " + y);
    }

    public void multiplication(int a, int b) {
        int r = a * b;
        System.out.println("Multiplication is: " + r);
    }

    public void division(int a, int b) {
        int s = a / b;
        System.out.println("Division is: " + s);
    }
// Instance method for calculation using if-elseif method
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else { // If the condition is not true, defualt statement applies
            System.out.println("Please enter right symbol");
        }
    }
}