/*
 * Program: Palindrome Number Checker
 * Description: This program checks if a given number is a palindrome.
 * Approach:
 * - The program takes a number as input.
 * - It reverses the number.
 * - If the reversed number is equal to the original number, it is a palindrome.
 */

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Palindrome Number Checking Zone");
        System.out.print("Please Enter A Number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("The Number " + number + " Is A Palindrome.");
        } else {
            System.out.println("The Number " + number + " Is Not A Palindrome.");
        }

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }

    // Method to check if a number is a Palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
