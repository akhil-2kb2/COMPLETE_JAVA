import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome To Driving Licence Portal...");
        System.out.print("Please Enter Your age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("Now You Are Eligible For Driving Licence...");
        }
        else {
            System.out.println("Beta G Cycle Chalao..😀");
        }
    }
}
