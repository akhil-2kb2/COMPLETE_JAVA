import java.util.Scanner;

/*
 * Program Description:
 * This program prints the Fibonacci series up to a certain number.
 *
 * Brief Approach:
 * 1. Take an integer N as input from the user.
 * 2. Start with 0 and 1, then compute the next numbers by summing the last two.
 * 3. Print the sequence until reaching or exceeding N.
 */
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Fibonacci Series Generator");
        System.out.print("Enter A Number: ");
        int n = input.nextInt();

        printFibonacci(n);

        System.out.println("\n.....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series Up To " + n + " Is: " + first + ", " + second);
        while (true) {
            int next = first + second;
            if (next > n) break;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
