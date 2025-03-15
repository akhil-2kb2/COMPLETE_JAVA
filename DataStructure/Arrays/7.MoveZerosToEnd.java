import java.util.Scanner;

class MoveZerosToEnd {
    public static void main(String[] args) {
        greetUser();

        Scanner input = new Scanner(System.in);
        int[] myArray = initializeArray(input);
        moveZerosToEnd(myArray);

        System.out.print("Array After Moving Zeros To End: ");
        printArray(myArray);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Move Zeros To End Program <<<<");
    }

    public static int[] initializeArray(Scanner input) {
        System.out.print("Please Enter The Size Of The Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Please Enter " + n + " Elements Separated By Space:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void moveZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
