package random;

public class NeonNumberFinder {

    // Function to check if a number is Neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        // Calculate a sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        // Check if a sum of digits of square equals the original number
        return sumOfDigits == number; // if sumOfDigits == number, return true
        // else return false this method why?
        // because the method isNeon is checking if the number is a Neon number
        // why writing this method like return sumOfDigits == number;
        // because it is a shorthand way of writing an if-else statement
        // I want expanded not sort
        // if (sumOfDigits == number) {
        //     return true;
        // } else {
        //     return false;
        // }

    }
    public static void main(String[] args) {
        System.out.println("Neon Numbers between 0 and 999999999 are:");

        for (int i = 0; i <= 999999999; i++) { //
            if (isNeon(i)) {
                System.out.println(i);
            }
        }
    }
}
