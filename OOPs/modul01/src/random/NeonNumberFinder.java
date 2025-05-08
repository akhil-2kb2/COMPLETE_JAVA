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
        return sumOfDigits == number;
    }

    public static void main(String[] args) {
        System.out.println("Neon Numbers between 0 and 10000 are:");

        // You can change the upper limit here
        for (int i = 0; i <= 10000; i++) {
            if (isNeon(i)) {
                System.out.println(i);
            }
        }
    }
}
