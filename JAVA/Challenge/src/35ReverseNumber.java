import java.util.Scanner;

/*
 * Program Description:
 * This program reverses the digits of an integer.
 *
 * Brief Approach:
 * 1. Take an integer as input from the user.
 * 2. Extract each digit using modulus and division.
 * 3. Construct the reversed number.
 * 4. Display the reversed number.
 */

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Number Reversal Zone");
        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        int reversed = reverseDigits(number);
        displayResult(number, reversed);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void displayResult(int number, int reversed) {
        System.out.println("The Reverse Of " + number + " Is: " + reversed);
    }
}
