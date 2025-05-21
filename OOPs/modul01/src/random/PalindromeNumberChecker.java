package random;

import java.util.Scanner;

public class PalindromeNumberChecker {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Palindrome: ");
        int input = scanner.nextInt();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome number.");
        } else {
            System.out.println(input + " is NOT a Palindrome number.");
        }

        scanner.close();
    }
}
