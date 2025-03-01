import java.util.Scanner;

/*
 * Program Description:
 * This program computes the sum of the digits of an integer.
 *
 * Brief Approach:
 * 1. Take an integer input from the user.
 * 2. Extract each digit using modulus and division.
 * 3. Add the extracted digits and display the sum.
 */

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Digit Sum Calculator");
        System.out.print("Enter An Integer: ");
        int number = input.nextInt();

        int sum = calculateDigitSum(Math.abs(number));
        System.out.println("The Sum Of Digits Of " + number + " Is: " + sum);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Extract last digit and add to sum
            num /= 10;        // Remove last digit
        }
        return sum;
    }
}
