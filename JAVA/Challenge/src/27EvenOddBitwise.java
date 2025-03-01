import java.util.Scanner;

/**
 * Program: Check Even or Odd Using Bitwise Operator
 * Description: This program checks if a number is even or odd using the '&' operator.
 * Approach:
 * 1. Take an integer input from the user.
 * 2. Use 'number & 1' to check the last bit (0 means even, 1 means odd).
 * 3. Display whether the number is even or odd.
 */

class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Even/Odd Checker Using Bitwise Operator Zone");

        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        System.out.println("Binary Representation:");
        System.out.println("Number: " + Integer.toBinaryString(number));

        if ((number & 1) == 0) {
            System.out.println(number + " Is An Even Number.");
        } else {
            System.out.println(number + " Is An Odd Number.");
        }

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }
}
