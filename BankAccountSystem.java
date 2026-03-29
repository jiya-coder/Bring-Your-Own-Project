import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        String accStr = String.valueOf(accountNumber);
        String masked = "XXXXXX" + accStr.substring(accStr.length() - 4);

        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + masked);
        System.out.println("Balance: " + balance);
    }
}
