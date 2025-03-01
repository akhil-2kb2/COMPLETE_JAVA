import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("     [Welcome in Swapping Zone] ");
        System.out.print("Please Enter Your First Num: ");
        int firstNum = input.nextInt();
        System.out.print("Now Please Second Num: ");
        int secondNum = input.nextInt();
        firstNum = secondNum + firstNum;
        secondNum  = firstNum- secondNum;
        firstNum = firstNum-secondNum;


        System.out.println("...Swapping is done...\n ...[Enjoy Coding]...\n     ..Bingo Now..  \nThe firstNum is: " + firstNum + "\nAnd the secondNum is: " + secondNum);
    }
}
