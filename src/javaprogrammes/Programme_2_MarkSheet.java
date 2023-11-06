package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________
 * Write programme with if else and while loop.
 */
public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 'Y';
        while (continueCalculation == 'Y' || continueCalculation == 'y') {
            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter Maths Marks: ");
            double mathsMarks = scanner.nextDouble();
            System.out.println("Enter Science Marks");
            double scienceMarks = scanner.nextDouble();
            System.out.println("Enter English Marks");
            double englishMarks = scanner.nextDouble();
            result(mathsMarks, scienceMarks, englishMarks, name, rollNumber);
            System.out.println("Would you like to enter another student's details? (Please enter Y or N): ");
            continueCalculation = scanner.next().charAt(0);
            scanner.nextLine();
        }
        System.out.println("Program Terminated");
        scanner.close();
    }

    public static void result(double Maths, double Science, double English, String name, int rollNumber) {
        if (Maths < 0 || Maths > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) {
            System.out.println("Invalid input, Marks should be between 0 and 100");
        } else {
            //calculate total marks and result
            double totalMarks = Maths + Science + English;
            double percentage = (totalMarks / 300) * 100;
            String result = (percentage >= 35 && Maths >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail"; //used ternary operator

            //grade calculation
            String Grade = "-";
            if (Maths >= 35 && Science >= 35 && English >= 35) {
                if (percentage <= 100 && percentage >= 80) {
                    Grade = "A+";
                } else if (percentage < 80 && percentage >= 60) {
                    Grade = "A";
                } else if (percentage < 60 && percentage >= 50) {
                    Grade = "B";
                } else if (percentage < 50 && percentage >= 35) {
                    Grade = "C";
                } else {
                    Grade = "Fail";
                }
                //Display th result
                System.out.println("Pass");
                System.out.println("Percentage: " + percentage);
                System.out.println("Grade: " + Grade);
            } else {
                System.out.println("Fail");
            }

            //Print a Mark Sheet
            System.out.println("|_________________________________|");
            System.out.println("|                                 |");
            System.out.println("|           Mark Sheet            |");
            System.out.println("| Name          : " + name + "          |");
            System.out.println("| Roll Number   : " + rollNumber + "               |");
            System.out.println("|_________________________________|");
            System.out.println("| Subjects      : Marks           |");
            System.out.println("|_________________________________|");
            System.out.println("| Maths         : " + Maths + "            |");
            System.out.println("| Science       : " + Science + "            |");
            System.out.println("| English       : " + English + "            |");
            System.out.println("|_________________________________|");
            System.out.println("| Total         : " + totalMarks + "           |");
            System.out.println("|_________________________________|");
            System.out.println("| Percentage    : " + percentage + "            |");
            System.out.println("| Result        : " + result + "            |");
            System.out.println("| Grade         : " + Grade + "              |");
            System.out.println("|_________________________________|");
        }

    }
}
