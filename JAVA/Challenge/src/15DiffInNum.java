import java.util.Scanner;

class DiffInNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to the Number Differentiation...");
        System.out.print("Please Enter Your Num: ");
        int Num = input.nextInt();
        if(Num < 0){
            System.out.println("Your Num is Negative ..." + Num + "\n Keep Learning ......");
        } else if (Num == 0) {
            System.out.println("Your Num is Zero: " + Num);
        }
        else {
            System.out.println("Your Num is Positive Num:" + Num);
        }
        System.out.println("...Happy 😀 Coding...\n .....Enjoy Learning.....");
        input.close();
    }
}
