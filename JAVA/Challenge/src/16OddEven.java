import java.util.Scanner;

class OddEven {  // Fixed class name typo (OodEven → OddEven)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Num Zone");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even Num \n...Happy Coding 😀...");
        } else {
            System.out.println(num + " is Odd Num \n...Happy Coding 😀...");
        }
        input.close();
    }
}

