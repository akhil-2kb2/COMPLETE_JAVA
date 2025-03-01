//import java.util.Scanner;

/*
 * Program Description:
 * This program calculates the factorial of a given number.
 *
 * Brief Approach:
 * 1. Take an integer input from the user.
 * 2. Use a loop or recursion to compute the factorial.
 * 3. Display the factorial of the number.
 */
//class Factorial {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome To The Factorial Calculation Zone");
//        System.out.print("Enter A Number: ");
//        int number = input.nextInt();
//
//        long factorial = calculateFactorial(number);
//        System.out.println("The Factorial Of " + number + " Is: " + factorial);
//
//        System.out.println(".....Happy 😀 Coding.....");
//        System.out.println("......Enjoy Learning......");
//
//        input.close();
//    }
//
//    public static long calculateFactorial(int n) {
//        long fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//}

import java.util.Scanner;

/*
 * Program Description:
 * This program calculates the factorial of a given number using recursion.
 *
 * Brief Approach:
 * 1. Take an integer input from the user.
 * 2. Use a recursive function to compute the factorial.
 * 3. Display the factorial of the number.
 */
//
//class Factorial {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome To The Factorial Calculation Zone");
//        System.out.print("Please Enter A Positive Int Number: ");
//        int number = input.nextInt();
//
//        long factorial = calculateFactorial(number);
//        System.out.println("The Factorial Of " + number + " Is: " + factorial);
//
//        System.out.println(".....Happy 😀 Coding.....");
//        System.out.println("......Enjoy Learning......");
//
//        input.close();
//    }
//
//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1 || n < 0) {
//            return 1; // Base case: 0! and 1! are both 1
//        }
//        return n * calculateFactorial(n - 1); // Recursive case
//    }
//}






class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Factorial Calculation Zone");
        System.out.print("Please Enter A Positive Int Number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial Is Not Defined For Negative Numbers!");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("The Factorial Of " + number + " Is: " + factorial);
        }

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }
}

