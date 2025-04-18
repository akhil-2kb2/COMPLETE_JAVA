import java.util.Scanner;

class ElementSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greetUser();

        int[] numbers = initialize(input);
        int sum = sumElements(numbers);

        System.out.println("Total Sum Of Elements: " + sum);
        System.out.println(".....Happy 😀 Coding.....");
        System.out.println("......Enjoy Learning......");

        input.close();
    }

    public static int[] initialize(Scanner input) {
        int[] myInt = new int[10];
        System.out.print("Enter 10 Integer Numbers:");
        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = input.nextInt();
        }
        return myInt;
    }

    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void greetUser() {
        System.out.println(">>>>>> Welcome To The Array Sum Zone <<<<<<");
    }
}
