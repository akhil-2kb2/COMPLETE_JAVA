import java.util.Scanner;

/*
 * Program Description:
 * This program calculates the sum of all odd numbers from 1 to a given number.
 *
 * Brief Approach:
 * 1. Take an integer N as input from the user.
 * 2. Loop through numbers from 1 to N.
 * 3. Add only the odd numbers to the sum.
 * 4. Display the total sum.
 *
  import java.util.Scanner;
*/
//class SumOfOddNumbers {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Sum of Odd Numbers Program");
//        System.out.print("Please Enter a Number: ");
//        int myNumber = input.nextInt();
//        int sum = sumOfOddNumbers(myNumber);
//        System.out.println("Sum of Odd Numbers is: " + sum);
//        System.out.println("...Happy 😀 Coding" + "\n...Enjoy Learning...");
//
//        input.close();
//    }
//    public static int sumOfOddNumbers(int num) {
//        System.out.println("->>>Your Sum of Odd Numbers is<<<-");
//        int sum = 0;
//        for (int i = 1; i <= num; i+=2) {
//            int sum = 0;
//            if (i % 2 != 0)
//                sum = sum + i;
//        }
//        return sum;
//    }
//}

//class SumOfOddNumbers {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome To The Sum Of Odd Numbers Program");
//        System.out.print("Please Enter A Number: ");
//        int myNumber = input.nextInt();
//
//        int sum = sumOfOddNumbers(myNumber);
//        System.out.println("->>> Your Sum Of Odd Numbers Is <<<-");
//        System.out.println("Sum Of Odd Numbers Is: " + sum);
//        System.out.println(".....Happy 😀 Coding.....");
//        System.out.println("......Enjoy Learning......");
//
//        input.close();
//    }
//
//    public static int sumOfOddNumbers(int num) {
//        int sum = 0;
//        for (int i = 1; i <= num; i += 2) {  // Increment by 2 to consider only odd numbers
//            sum += i;
//        }
//        return sum;
//    }
//}

//import java.util.Scanner;

//class SumOfOddNumbers {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to Sum of Odd Numbers Program");
//        System.out.print("Please Enter a Number: ");
//
//        int myNumber = input.nextInt();
//        int sum = sumOfOddNumbers(myNumber);
//
//        System.out.println("Sum of Odd Numbers Till " + myNumber + " is: " +   sum);
//        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
//
//        input.close();
//    }
//
//    public static int sumOfOddNumbers(int num) {
//        System.out.println("->>>Your Sum of Odd Numbers is<<<-");
//
//        if (num % 2 == 0) {
//            num--; // Convert even to the nearest odd
//        }
//
//        int n = (num / 2) + 1; // Count of odd numbers
//        return n * n; // Use the formula S_n = n^2
//    }
//}


class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Sum of Odd Numbers Program");
        System.out.print("Please Enter a Number: ");

        int myNumber = input.nextInt();
        int sum = sumOfOddNumbers(myNumber);

        System.out.println("Sum of Odd Numbers Till " + myNumber + " is: " + sum);
        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");

        input.close();
    }

    public static int sumOfOddNumbers(int num) {
        System.out.println("->>>Your Sum of Odd Numbers is<<<-");

        int sum = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i += 2) {
                sum += i;
            }
        } else {
            for (int i = -1; i >= num; i -= 2) {
                sum += i;
            }
        }

        return sum;
    }
}
