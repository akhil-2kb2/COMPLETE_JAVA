import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Comparison Zone ");
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber = input.nextInt();
        int greatest;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            greatest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            greatest = secondNumber;
        } else {
            greatest = thirdNumber;
        }
        System.out.println("The Greatest Number Is: " + greatest + "\n .....Happy 😀 Coding.....\n......Enjoy Learnin...... ");

        input.close();
    }
}


