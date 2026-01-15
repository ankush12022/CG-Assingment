public class ATM {
    public static void main(String[] args) {

        BankAccount ac = new BankAccount("QWERTY", 11112222, 100000);

        ac.displayBalance();
        ac.deposit(10000);
        ac.withdraw(45000);
        ac.displayBalance();
    }
}

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder  : " + accountHolder);
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Current Balance : " + balance);
    }
}
