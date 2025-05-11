package random;

public class Armer {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

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
            }
        }
    }
}
