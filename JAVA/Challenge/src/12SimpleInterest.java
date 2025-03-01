import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to the Simple Interest Calculator Zone...");
        System.out.print("Enter Principal Amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter Rate of Interest (% per year): ");
        float rate = input.nextFloat();
        System.out.print("Enter Time (years): ");
        float time = input.nextFloat();
        // Simple Interest formula: SI = (P × R × T) / 100
        float interest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + interest + "\n...Happy Coding😀...");

        input.close(); // Close Scanner to prevent resource leak
    }
}

