import java.util.*;

class Bank{
    String name;
    List<Account> accounts = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    Account openAccount(Customer customer, double balance) {
        Account acc = new Account(this, customer, balance);
        accounts.add(acc);
        customer.addAccount(acc);
        return acc;
    }
}

class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.name + ", Balance: " + acc.balance);
        }
    }
}

class Account {
    Bank bank;
    Customer customer;
    double balance;

    Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }
}

public class BankAcc {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer c1 = new Customer("Ankush");
        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 12000);

        c1.viewBalance();
    }
}
