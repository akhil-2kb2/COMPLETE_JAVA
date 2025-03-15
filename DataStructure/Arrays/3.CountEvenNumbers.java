import java.util.Scanner;

class CountEvenNumbers {
    public static void main(String[] args) {
        greetUser();

        int[] myArray = initializeArray();
        int evenCount = countEvenNumbers(myArray);
        boolean containsZero = containsZero(myArray);

        displayResult(evenCount, containsZero);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Even Number Counter <<<<");
    }

    public static int[] initializeArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Size Of The Array: ");
        int n = input.nextInt();
        int[] myArr = new int[n];

        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            myArr[i] = input.nextInt();
        }
        input.close();
        return myArr;
    }

    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num != 0 && num % 2 == 0) { // Excluding 0
                count++;
            }
        }
        return count;
    }

    public static boolean containsZero(int[] arr) {
        for (int num : arr) {
            if (num == 0) {
                return true;
            }
        }
        return false;
    }

    public static void displayResult(int evenCount, boolean containsZero) {
        String message = "Total Even Numbers In The Array";
        if (containsZero) {
            message += " (Excluding 0)";
        }
        System.out.println(message + ": " + evenCount);
    }
}
