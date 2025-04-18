public class Account {
    private final int acctID;
    private final String name;
    private final double balance;

    public Account(int accID, String s, double bal) {
        acctID = accID;
        name = s;
        balance = bal;
    }
    public void showAccount() {
        System.out.println("Account ID: " + acctID);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
