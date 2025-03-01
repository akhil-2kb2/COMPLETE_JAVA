import java.util.Scanner;

/**
 * Program: Right Shift Operator
 * Description: This program demonstrates the use of the right shift (>>) operator.
 * Approach:
 * 1. Take an integer input and the number of positions to shift.
 * 2. Apply the '>>' operator to shift bits to the right.
 * 3. Display the result.
 */

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Right Shift Operation Zone");

        System.out.print("Enter A Number: ");
        int number = input.nextInt();
        System.out.print("Enter Number Of Positions To Shift Right: ");
        int shift = input.nextInt();

        int result = number >> shift;

        System.out.println("Binary Representation:");
        System.out.println("Original Number   : " + Integer.toBinaryString(number));
        System.out.println("Right Shift Result: " + Integer.toBinaryString(result));
        System.out.println("Right Shift Result (Decimal): " + result);

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }
}
