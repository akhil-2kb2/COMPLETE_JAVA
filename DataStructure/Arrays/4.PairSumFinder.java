import java.util.Scanner;

class PairSumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Declare Scanner in main()

        greetUser();

        int[] myArray = initializeArray(input); // Pass Scanner object
        System.out.print("Enter The Target Sum: ");
        int targetSum = input.nextInt();

        int pairCount = findPairSum(myArray, targetSum);
        System.out.println("Total Pairs Found: " + pairCount);

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close(); // Close Scanner after all inputs are taken
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Pair Sum Finder <<<<");
    }

    public static int[] initializeArray(Scanner input) { // Accept Scanner as parameter
        System.out.print("Please Enter The Size Of The Array: ");
        int n = input.nextInt();
        int[] myArr = new int[n];

        System.out.print("Enter " + n + " Elements Followed By Space: ");
        for (int i = 0; i < n; i++) {
            myArr[i] = input.nextInt();
        }
        return myArr;
    }

    public static int findPairSum(int[] arr, int target) {
        int count = 0;
        boolean found = false;
        System.out.println("Pairs With Sum " + target + " Are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No Pairs Found With The Given Sum.");
        }
        return count;
    }
}
