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
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, balance);

        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
