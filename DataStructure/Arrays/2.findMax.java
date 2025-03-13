import java.util.Scanner;

class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greetUser();

        int[] myArray = initializeArray(input);
        int maxElement = findMaxElement(myArray);

        displayResult(maxElement);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Maximum Element Finder <<<<");
    }

    public static int[] initializeArray(Scanner input) {
        System.out.print("Please Enter The Size Of The Array: ");
        int n = input.nextInt();
        int[] myArr = new int[n];

        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            myArr[i] = input.nextInt();
        }
        return myArr;
    }

    public static int findMaxElement(int[] arr) {
        int maxInt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        return maxInt;
    }

    public static void displayResult(int maxElement) {
        System.out.println("Max Element Is: " + maxElement);
    }
}
