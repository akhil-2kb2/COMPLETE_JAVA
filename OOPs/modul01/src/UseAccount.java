public class UseAccount {
    public static void main(String[] args) {
        Account account1 = new Account(101, "AKHIL",10000000);
        Account account2 = new Account(102, "AYUSH",20000000);

        System.out.println("Account 1 Details:");
        account1.showAccount();
        System.out.println("=================");
        System.out.println("Account 2 Details:");
        account2.showAccount();
    }
}
