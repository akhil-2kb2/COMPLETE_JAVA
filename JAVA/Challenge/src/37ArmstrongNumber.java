/*
 * Program: Armstrong Number Checker
 * Description: This program checks if a given number is an Armstrong number.
 * Approach:
 * - The program takes a number as input.
 * - It calculates the sum of its digits, each raised to the power of the total number of digits.
 * - If the sum is equal to the original number, it is an Armstrong number.
 */

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Armstrong Number Checking Zone");
        System.out.print("Please Enter A Number: ");
        int number = input.nextInt();

        if (isArmstrong(number)) {
            System.out.println("The Number " + number + " Is An Armstrong Number.");
        } else {
            System.out.println("The Number " + number + " Is Not An Armstrong Number.");
        }

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
