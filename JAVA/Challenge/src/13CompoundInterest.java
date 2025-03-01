import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to the CI Calculator...");
        // Taking user inputs
        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest (% per year): ");
        double rate = input.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();
        // Compound Interest formula: A = P * (1 + R/100)^T
        double amount = principal * Math.pow((1 + rate / 100), time);
        // Calculate Compound Interest
        double compoundInterest = amount - principal;

        // Display the results
        System.out.println("Total Amount (A): " + amount);
        System.out.println("Compound Interest (CI): " + compoundInterest + "\n...Happy Coding😀...");

        input.close(); // Close Scanner to prevent resource leak
    }
}

