/*
 * Program: Print Various Triangle Patterns
 * Description: This program prints three types of patterns - Left-Aligned Pyramid, Reverse Left-Aligned Pyramid, and Right-Aligned Pyramid.
 * Approach:
 * - Uses separate methods for each pattern.
 * - Loops handle the printing of stars in structured formatting.
 * - Takes user input for the number of rows.
 */

import java.util.Scanner;

class TrianglePatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Pattern Printing Zone");
        System.out.print("Please Enter The Number Of Rows: ");
        int rows = input.nextInt();

        System.out.println("\n->>> Left-Aligned Pyramid <<<-");
        printLeftAligned(rows);

        System.out.println("\n->>> Reverse Left-Aligned Pyramid <<<-");
        printReverseLeftAligned(rows);

        System.out.println("\n->>> Right-Aligned Pyramid <<<-");
        printRightAligned(rows);

        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");
        input.close();
    }

    // Left-Aligned Pyramid
    public static void printLeftAligned(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Reverse Left-Aligned Pyramid
    public static void printReverseLeftAligned(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right-Aligned Pyramid
    public static void printRightAligned(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");  // Printing spaces for alignment
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
