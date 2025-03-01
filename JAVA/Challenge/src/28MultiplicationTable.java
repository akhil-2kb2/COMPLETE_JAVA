import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table Program");
        System.out.print("Please Enter a Number: ");
        int num = input.nextInt();
        multiplicationTable(num);
        System.out.println("...Happy 😀 Coding" + "\n...Enjoy Learning...");

        input.close();
    }
    public static void multiplicationTable(int num) {
        System.out.println("->>>Your Multiplication Table is<<<-");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
