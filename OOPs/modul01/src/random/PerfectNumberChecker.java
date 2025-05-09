package random;

import java.util.Scanner;

public class PerfectNumberChecker {

    public static boolean isPerfect(int number) {
        if (number < 2) return false;

        int sum = 1; // 1 is a proper divisor of every number

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Perfect number: ");
        int input = scanner.nextInt();

        if (isPerfect(input)) {
            System.out.println(input + " is a Perfect number.");
        } else {
            System.out.println(input + " is NOT a Perfect number.");
        }

        scanner.close();
    }
}
