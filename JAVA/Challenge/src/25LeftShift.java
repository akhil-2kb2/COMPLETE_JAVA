import java.util.Scanner;

/**
 * Program: Left Shift Operator
 * Description: This program demonstrates the use of the left shift (<<) operator.
 * Approach:
 * 1. Take an integer input and the number of positions to shift.
 * 2. Apply the '<<' operator to shift bits to the left.
 * 3. Display the result.
 */

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Left Shift Operation Zone");

        System.out.print("Enter A Number: ");
        int number = input.nextInt();
        System.out.print("Enter Number Of Positions To Shift Left: ");
        int shift = input.nextInt();

        int result = number << shift;

        System.out.println("Binary Representation:");
        System.out.println("Original Number  : " + Integer.toBinaryString(number));
        System.out.println("Left Shift Result: " + Integer.toBinaryString(result));
        System.out.println("Left Shift Result (Decimal): " + result);

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }
}
