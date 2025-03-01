import java.util.Scanner;

class AgeCategorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Age Group Categorization Zone");
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        String category;
        if (age < 13) {
            category = "Child";
        } else if (age < 20) {
            category = "Teen";
        } else if (age < 60) {
            category = "Adult";
        } else {
            category = "Senior Citizen";
        }
        System.out.println("You Belong To The '" + category + "' Category.");
        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");

        input.close();
    }
}


