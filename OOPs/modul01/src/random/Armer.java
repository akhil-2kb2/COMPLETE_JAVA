package random;

public class Armer {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits how?
        // by converting the number to a string and getting its length,
        // why using String.valueOf(number).length(); instead of using a loop to count digits?
        // because it's a more concise and efficient way to get the number of digits
        // in the number without needing to manually divide the number repeatedly


        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers between 0 and 999999999 are:");

        for (int i = 0; i <= 999999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                System.out.println("Armstrong number: " + i);
                // System.out.println("Armstrong number: " + i);
                System.out.println("Armstrong number: " + i+ " is an Armstrong number.");
                System.out.println("Armstrong number: " + i+ " is an Armstrong number.");
            }
        }
    }
}
