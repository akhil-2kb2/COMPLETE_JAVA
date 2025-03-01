import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to Ticket Discount Zone...");
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Are You a Female? (true/false)");
        boolean isFemale = input.nextBoolean();
        if(age < 5){
            System.out.println("Bingo 😀You got 75% Discount ...Happy Journey...");
        } else if (isFemale) {
            System.out.println("Wow You got 50% Discount ...Happy Journey...");
        } else if (age > 60 && !isFemale) {
            System.out.println("You got 25% Discount..");
        }
        else {
            System.out.println("Oh 😔You got no Discount...");
        }
    }
}
