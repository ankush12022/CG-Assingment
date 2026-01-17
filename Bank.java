class BankAccount {

    // Static variable (shared by all objects)
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    final int accountNumber;

    // Instance variable
    String accountHolderName;

    // Constructor using 'this' keyword
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    // Method to display account details
    void displayAccountDetails(Object obj) {

        // Using instanceof
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Account Number: " + acc.accountNumber);
        } else {
            System.out.println("Object is not a BankAccount");
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ankush", 101);
        BankAccount acc2 = new BankAccount("Rahul", 102);

        acc1.displayAccountDetails(acc1);
        System.out.println();
        acc2.displayAccountDetails(acc2);

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
