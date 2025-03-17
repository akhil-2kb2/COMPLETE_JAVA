import java.util.Scanner;

class DivideArrayIntoPairs {
    public static void main(String[] args) {
        greetUser();

        Scanner input = new Scanner(System.in);
        int[] myArray = initializeArray(input);
        boolean canBeDivided = divideArray(myArray);

        if (canBeDivided) {
            System.out.println("The Array Can Be Divided Into Equal Pairs.");
        } else {
            System.out.println("The Array Cannot Be Divided Into Equal Pairs.");
        }

        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static void greetUser() {
        System.out.println(">>>> Welcome To The Divide Array Into Pairs Program <<<<");
    }

    public static int[] initializeArray(Scanner input) {
        System.out.print("Please Enter The Size Of The Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Please Enter " + n + " Elements Separated By Space:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static boolean divideArray(int[] nums) {
        int[] freq = new int[501];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i <= 500; i++) {
            if (freq[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
