package random;

import java.util.Scanner;

public class PalindromeStringChecker {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;// if we reach here, it means the string is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a Palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome string.");
        } else {
            System.out.println(input + " is NOT a Palindrome string.");
        }

        scanner.close();
    }
}
