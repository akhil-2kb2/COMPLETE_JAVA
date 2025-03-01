import java.util.Scanner;

/*
 * Program Description:
 * This program calculates the Least Common Multiple (LCM) of two numbers.
 *
 * Brief Approach:
 * 1. Take two integers as input from the user.
 * 2. Use the formula LCM(a, b) = (a * b) / GCD(a, b).
 * 3. Display the LCM of the two numbers.
 */

class LCMCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The LCM Calculation Zone");
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int lcm = calculateLCM(num1, num2);
        displayResult(num1, num2, lcm);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void displayResult(int num1, int num2, int lcm) {
        System.out.println("The LCM Of " + num1 + " And " + num2 + " Is: " + lcm);
    }
}
