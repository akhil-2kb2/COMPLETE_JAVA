//import java.util.Scanner;
//
///*
// * Program Description:
// * This program calculates the Greatest Common Divisor (GCD) of two integers.
// *
// * Brief Approach:
// * 1. Take two integers as input from the user.
// * 2. Use the Euclidean algorithm to compute the GCD.
// * 3. Display the GCD of the two numbers.
// */
//
//class GCDCalculator {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome To The GCD Calculation Zone");
//        System.out.print("Enter First Number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter Second Number: ");
//        int num2 = input.nextInt();
//
//        int gcd = calculateGCD(num1, num2);
//        displayResult(num1, num2, gcd);
//
//        System.out.println(".....Happy 😀 Coding.....");
//        System.out.println("......Enjoy Learning......");
//
//        input.close();
//    }
//
//    public static int calculateGCD(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//
//    public static void displayResult(int num1, int num2, int gcd) {
//        System.out.println("The GCD Of " + num1 + " And " + num2 + " Is: " + gcd);
//    }
//}
import java.util.Scanner;

/**
 * Program Description:
 * This program calculates the Greatest Common Divisor (GCD) of two numbers
 * using the Euclidean Algorithm.
 *
 * Approach:
 * 1. Take two positive integers as input.
 * 2. Use the Euclidean algorithm:
 *    - Replace a with b and b with a % b, until b becomes 0.
 * 3. Display the result.
 */

class GCDCalculator {
    private final int num1;
    private final int num2;

    // Constructor to initialize numbers
    public GCDCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to calculate GCD using the Euclidean Algorithm
    public int calculateGCD() {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to display the result
    public void displayResult() {
        int gcd = calculateGCD();
        System.out.println("The GCD Of " + num1 + " And " + num2 + " Is: " + gcd);
    }

    // Static method to take input and manage the program flow
    public static void startGCDCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    Welcome To The GCD Calculator   ");
        System.out.println("====================================");

        int firstNumber = getValidNumber(input, "Enter First Number: ");
        int secondNumber = getValidNumber(input, "Enter Second Number: ");

        // Create an object and compute the GCD
        GCDCalculator gcdCalculator = new GCDCalculator(firstNumber, secondNumber);
        gcdCalculator.displayResult();

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    // Method to get a valid positive integer from the user
    private static int getValidNumber(Scanner input, String message) {
        int number;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("⚠️ Please enter a positive integer.");
                }
            } else {
                System.out.println("⚠️ Invalid input! Please enter a valid integer.");
                input.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Main method to start the program
    public static void main(String[] args) {
        startGCDCalculator();
    }
}
