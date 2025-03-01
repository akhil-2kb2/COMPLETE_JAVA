import java.util.Scanner;

/**
 * Program: Bitwise AND Operator
 * Description: Performs the bitwise AND operation on two numbers and shows internal bitwise processing.
 */

class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Bitwise AND Operation Zone");

        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int result = firstNumber & secondNumber;

        // Binary Representation
        String binaryFirst = String.format("%8s", Integer.toBinaryString(firstNumber)).replace(' ', '0');
        String binarySecond = String.format("%8s", Integer.toBinaryString(secondNumber)).replace(' ', '0');
        String binaryResult = String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0');

        System.out.println("\nBinary Representation:");
        System.out.println("First Number  : " + binaryFirst + " (" + firstNumber + ")");
        System.out.println("Second Number : " + binarySecond + " (" + secondNumber + ")");
        System.out.println("AND Result    : " + binaryResult + " (" + result + ")");

        // Internal Process
        System.out.println("\nInternal Bitwise Process:");
        System.out.println("  " + binaryFirst);
        System.out.println("& " + binarySecond);
        System.out.println("  --------");
        System.out.println("  " + binaryResult);

        System.out.println("\n.....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }
}
