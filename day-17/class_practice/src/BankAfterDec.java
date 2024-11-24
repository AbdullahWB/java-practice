
import java.util.Scanner;

class WithdrawalLimitExist extends Exception {

    WithdrawalLimitExist(double remainingLimit) {
        super("Daily withdrawal limit exceeded! Remaining withdrawal limit: " + remainingLimit + " RMB.");
    }
}

class DepositLimitExist extends Exception {

    DepositLimitExist(double remainingLimit) {
        super("Daily deposit limit exceeded! Remaining deposit limit: " + remainingLimit + " RMB.");
    }
}

class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be non-negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) throws DepositLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        if (amount > 10000) {
            double remainingLimit = 10000;
            throw new DepositLimitExist(remainingLimit);
        }
        balance += amount;
        System.out.printf("Successfully deposited %.2f RMB.%n", amount);
        System.out.println("\n____________________******_____________________\n");
    }

    public void withdraw(double amount) throws WithdrawalLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount > 5000) {
            double remainingLimit = 5000;
            throw new WithdrawalLimitExist(remainingLimit);
        }
        balance -= amount;
        System.out.printf("Successfully withdrew %.2f RMB.%n", amount);
    }

    public double checkBalance() {
        return balance;
    }
}

public class BankAfterDec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000); // Starting balance of 1000 RMB
        boolean exit = false;
        int day = 1; // Start at Day 1
        int dailyWithdrawLimit = 5000;
        int dailyDepositLimit = 10000;

        while (!exit) {
            System.out.println("\n==================== BANKING SYSTEM ====================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Next Day");
            System.out.println("5. Exit");
            System.out.println("========================================================");
            System.out.print("-> Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n$$ DEPOSIT");
                    while (true) {
                        System.out.printf("You can deposit up to %d RMB today.%n", dailyDepositLimit);
                        System.out.print("Enter deposit amount (or 0 to exit): ");
                        double depositAmount = scanner.nextDouble();

                        if (depositAmount == 0) {
                            System.out.println("Returning to main menu...");
                            break;
                        }
                        try {
                            if (depositAmount > dailyDepositLimit) {
                                System.out.println("Deposit amount exceeds today's limit!");
                                continue;
                            }
                            account.deposit(depositAmount);
                            dailyDepositLimit -= depositAmount;
                            System.out.printf("Remaining deposit limit for today: %d RMB.%n", dailyDepositLimit);

                            if (dailyDepositLimit == 0) {
                                System.out.println("You have reached your daily deposit limit!");
                                break;
                            }
                        } catch (DepositLimitExist e) {
                            System.out.println("✕ " + e.getMessage());
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\n$_$ WITHDRAW");
                    while (true) {
                        System.out.printf("You can withdraw up to %d RMB today.%n", dailyWithdrawLimit);
                        System.out.print("Enter withdrawal amount (or 0 to exit): ");
                        double withdrawAmount = scanner.nextDouble();

                        if (withdrawAmount == 0) {
                            System.out.println("Returning to main menu...");
                            break;
                        }
                        try {
                            if (withdrawAmount > dailyWithdrawLimit) {
                                System.out.println("Withdrawal amount exceeds today's limit!");
                                continue;
                            }
                            account.withdraw(withdrawAmount);
                            dailyWithdrawLimit -= withdrawAmount;
                            System.out.printf("Remaining withdrawal limit for today: %d RMB.%n", dailyWithdrawLimit);
                            if (dailyWithdrawLimit == 0) {
                                System.out.println("You have reached your daily withdrawal limit!");
                                break;
                            }
                        } catch (WithdrawalLimitExist e) {
                            System.out.println("* " + e.getMessage());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\nACCOUNT BALANCE");
                    System.out.printf("Current balance: %.2f RMB.%n", account.checkBalance());
                }
                case 4 -> {
                    System.out.println("\nTODAY'S INFO");
                    System.out.printf("Day: %d%n", day);
                    System.out.printf("Remaining daily deposit limit: %d RMB.%n", dailyDepositLimit);
                    System.out.printf("Remaining daily withdrawal limit: %d RMB.%n", dailyWithdrawLimit);
                }
                case 5 -> {
                    System.out.println("\nByeBye EXITING");
                    System.out.println("Thank you for banking with us. Have a great day!");
                    exit = true;
                }
                default ->
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            if (dailyDepositLimit == 0 && dailyWithdrawLimit == 0) {
                System.out.println("\nDaily limits reached. Moving to the next day...");
                day++;
                dailyWithdrawLimit = 5000;
                dailyDepositLimit = 10000;
            }
        }
        scanner.close();
    }
}
