
import java.util.Scanner;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("--------------------------");
    }
}

public class BankAccountObj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of accounts you want to create:");
        int numberOfAccounts = scanner.nextInt();
        scanner.nextLine();

        BankAccount[] accounts = new BankAccount[numberOfAccounts];

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter details of account " + (i + 1) + ":");
            System.out.println("Account Number: ");
            String accountNumber = scanner.nextLine();
            System.out.println("Account Holder Name: ");
            String accountHolderName = scanner.nextLine();
            System.out.println("Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine();
            accounts[i] = new BankAccount(accountNumber, accountHolderName, initialBalance);
            System.out.println("----------------------");
            accounts[i].displayAccountInfo();
            System.out.println("Account created successfully!");
        }

        System.out.println("Account Information: ");
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }

        System.out.println("Enter the account index (1 to " + numberOfAccounts + ") to deposit into: ");
        int accountIndex = scanner.nextInt() - 1;
        System.out.println("Enter the deposit amount: ");
        double depositAmount = scanner.nextDouble();
        accounts[accountIndex].deposit(depositAmount);

        System.out.println("Enter the account index (1 to " + numberOfAccounts + ") to withdraw from: ");
        accountIndex = scanner.nextInt() - 1;
        System.out.println("Enter the withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        accounts[accountIndex].withdraw(withdrawAmount);

        System.out.println("Updated account information:");
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }

        scanner.close();
    }
}
