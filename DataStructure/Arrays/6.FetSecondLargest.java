import java.util.Scanner;

class GetSecondLargest {  // ✅ Class name should start with a capital letter
    public static void main(String[] args) {
        greetUser();

        Scanner input = new Scanner(System.in);
        int[] myArray = initializeArray(input);
        int secondLargest = findSecondLargest(myArray);

        if (secondLargest == -1) {
            System.out.println("No Second Largest Element Found.");
        } else {
            System.out.println("The Second Largest Element Is: " + secondLargest);
        }

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Second Largest Finder <<<<");
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

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;  // ✅ Handles negative numbers correctly
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; // ✅ Return -1 if no second largest
    }
}
