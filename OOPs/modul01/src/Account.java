import java.util.Scanner;

public class Account {
    private final int acctID;
    private final String name;
    private final double balance;
    private static final double rateOfInterest;

    static {// static block
        // This block is executed when the class is loaded
        // It is used to initialize static variables
        // or perform any static initialization,
        // For example, we can initialize the rate of interest here
        System.out.print("Please enter the rate of interest:");
        Scanner input = new Scanner(System.in);
        rateOfInterest = input.nextDouble();  // explain this line ,
        // rateOfInterest is a static variable,
        // so it is initialized only once when the class is loaded,
        // and it is shared by all instances of the class.
        // It is a good practice to make static variables final
        // to ensure that they are not modified after initialization.
        // This is a good practice to ensure that the rate of interest


        input.close(); // close the scanner
    }
    public Account(int accID, String s, double bal) {
        acctID = accID;
        name = s;
        balance = bal;
        System.out.println("Account constructor called");
    }
    public void showAccount() {
        System.out.println("Account ID: " + acctID);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
