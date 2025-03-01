/*
 * Program Description:
 * This program calculates the sum of two numbers entered by the user.
 * It uses methods to display a greeting, read numbers, and calculate the sum.
 *
 * Brief Approach:
 * 1. The `greet()` method displays a welcome message to the user.
 * 2. The `readNumber()` method asks the user to input a number and returns the entered value.
 * 3. The `displayResult()` method calls `greet()` and `readNumber()` to compute and display the sum of the entered numbers.
 */

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object for user input
        displayResult(input);  // Passing the Scanner object to the displayResult method
        input.close();  // Closing the Scanner after all operations
    }

    // Method to greet the user
    public static void greet() {
        System.out.println("Welcome to Calculator");
    }

    // Method to read a number from user input and return it
    public static int readNumber(Scanner input) {
        System.out.print("Please Enter the Number: ");
        return input.nextInt();  // Directly returning the input value
    }

    // Method to display the result: it greets the user, reads two numbers, and displays their sum
    public static void displayResult(Scanner input) {
        greet();  // Calling greet to welcome the user
        int first = readNumber(input);  // Reading the first number
        int second = readNumber(input);  // Reading the second number
        int sum = first + second;  // Calculating the sum
        System.out.println("Sum of the Numbers is: " + sum);  // Displaying the result
        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");
    }
}
