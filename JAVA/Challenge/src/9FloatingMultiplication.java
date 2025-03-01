import java.util.Scanner;

class FloatingMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...It is a Simple Multiplication of Two Floating Point Number...");
        System.out.print("Now Enter firstNum:  ");
        float x = input.nextFloat();
        System.out.print("And secondNum: ");
        float y = input.nextFloat();
        System.out.println("Result is: " + (x*y) + "\n...Enjoy Coding 😀...");
    }
}
