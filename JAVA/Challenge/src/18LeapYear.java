import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Leap Year Checker Zone");
        System.out.print("Enter A Year: ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " Is A Leap Year.");
        } else {
            System.out.println(year + " Is Not A Leap Year.");
        }
        System.out.println(".....Happy 😀 Coding.....\n.....Enjoy Learning......");

        input.close();
    }
}

