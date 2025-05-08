package random;

import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;  // 0 and 1 are not prime
        if (number == 2) return true;   // 2 is prime

        if (number % 2 == 0) return false; // eliminate even numbers > 2

        // Only check from 3 to √number, skipping even numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false; // divisible => not prime
        }

        return true; // no divisors found => it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int userInput = scanner.nextInt();

        if (isPrime(userInput)) {
            System.out.println(userInput + " is a Prime Number.");
        } else {
            System.out.println(userInput + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}

