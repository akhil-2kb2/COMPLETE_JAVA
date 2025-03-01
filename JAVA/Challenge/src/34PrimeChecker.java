import java.util.Scanner;

/*
 * Program Description:
 * This program checks whether a given number is prime.
 *
 * Brief Approach:
 * 1. Take an integer as input from the user.
 * 2. A prime number is only divisible by 1 and itself.
 * 3. Use a loop to check divisibility from 2 to sqrt(n).
 * 4. Display whether the number is prime or not.
 */

class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Prime Number Checker");
        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        boolean isPrime = checkPrime(number);
        displayResult(number, isPrime);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static boolean checkPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void displayResult(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println(number + " Is A Prime Number.");
        } else {
            System.out.println(number + " Is Not A Prime Number.");
        }
    }
}



/*
* import java.util.Scanner;

/**
 * Program Description:
 * This program checks whether a given number is prime or not.
 *
 * Approach:
 * 1. Take a positive integer as input.
 * 2. If the number is < 2, it's not prime.
 * 3. Check divisibility from 2 to √n:
 *    - If divisible by any number, it's not prime.
 *    - Otherwise, it's prime.
 * 4. Display the result.
 *

class PrimeNumberChecker {
    private final int number;  // Immutable variable

    // Constructor to initialize number
    public PrimeNumberChecker(int number) {
        this.number = number;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        if (number < 2) return false;  // Numbers less than 2 are not prime

        for (int i = 2; i * i <= number; i++) {  // Check divisibility up to √n
            if (number % i == 0) {
                return false;  // If divisible, it's not prime
            }
        }
        return true;  // Otherwise, it's prime
    }

    // Method to display the result
    public void displayResult() {
        if (isPrime()) {
            System.out.println(number + " Is A Prime Number.");
        } else {
            System.out.println(number + " Is Not A Prime Number.");
        }
    }

    // Static method to start the program
    public static void startPrimeChecker() {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    Welcome To The Prime Checker    ");
        System.out.println("====================================");

        int userNumber = getValidNumber(input, "Enter A Number: ");

        // Create an object and check if it's prime
        PrimeNumberChecker primeChecker = new PrimeNumberChecker(userNumber);
        primeChecker.displayResult();

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    // Method to get a valid positive integer from the user
    private static int getValidNumber(Scanner input, String message) {
        int number;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("⚠️ Please enter a positive integer.");
                }
            } else {
                System.out.println("⚠️ Invalid input! Please enter a valid integer.");
                input.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Main method to start the program
    public static void main(String[] args) {
        startPrimeChecker();
    }
}
*/