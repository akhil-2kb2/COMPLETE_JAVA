import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to Basic Calculator Zone...\nThis only do [+, -, *, /, %] for Two Num's");
        System.out.print("Enter firstNum: ");
        int x = input.nextInt();
        System.out.print("Now Enter secondNum: ");
        int y = input.nextInt();
        System.out.println("...Now all Operations are as Follows Enjoy Coding...\n ......and Keep Learning...... ");
        System.out.println("Addition is: " + (x+y));
        System.out.println("Subtraction is: "+ (x-y));
        System.out.println("Multiplication is: "+ (x*y));
        System.out.println("Division is: "+(x/y));
        System.out.println("Modulo is: "+(x%y));
    }
}
