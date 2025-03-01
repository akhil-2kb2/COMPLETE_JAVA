import java.util.Scanner;

/**
 * Program: Bitwise Complement Operator
 * Description: This program finds the bitwise complement of a given number.
 * Approach:
 * 1. Take an integer input from the user.
 * 2. Apply the '~' operator to find the bitwise complement.
 * 3. Display the result.
 */

class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Bitwise Complement Operation Zone");
        System.out.print("Enter A Number: ");
        int number = input.nextInt();
        int result = ~number;
        System.out.println("Binary Representation:");
        System.out.println("Original Number    : " + Integer.toBinaryString(number));
        System.out.println("Complement Result  : " + Integer.toBinaryString(result));
        System.out.println("Bitwise Complement Result (Decimal): " + result);

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }
}
