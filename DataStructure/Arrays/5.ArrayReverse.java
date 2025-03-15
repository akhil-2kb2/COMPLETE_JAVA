import java.util.Scanner;

class ArrayReverse {
    public static void main(String[] args) {
        greetUser(); // Welcome message

        int[] myArray = initializeArray(); // Get user input array
        reverseArray(myArray); // Reverse the array
        displayArray(myArray); // Display reversed array

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");
    }

    // Function to greet user
    public static void greetUser() {
        System.out.println(">>>> Welcome To The Array Reversal Program <<<<");
    }

    // Function to initialize array with user input
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

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
//        int left = 0, right = arr.length - 1;
//        while (left < right) {
//            // Swap elements
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
    for (int i = 0; i <= arr.length/2; i++){
        int temp = arr[(arr.length-1)-i];
        arr[(arr.length-1)-i] = arr[i];
        arr[i] = temp;
    }

    }

    // Function to display the array
    public static void displayArray(int[] arr) {
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
