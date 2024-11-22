
import java.util.ArrayList;
import java.util.Scanner;

class WithdrawalLimitExist extends Exception {

    WithdrawalLimitExist(double amount) {
        System.out.println(Math.abs(5000 - amount) + "RMB: ");
    }
}

class DepositLimitExist extends Exception {

    DepositLimitExist(double amount) {
        System.out.println(Math.abs(10000 - amount) + "RMB: ");
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
            throw new DepositLimitExist(amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawalLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount > 5000) {
            throw new WithdrawalLimitExist(amount);
        }
        balance -= amount;
    }

    public double CheckBalance() {
        return balance;
    }
}

public class Bank {

    public static void main(String[] args) throws DepositLimitExist, WithdrawalLimitExist {
        ArrayList<String> Array = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000);
        boolean exit = false;
        int day = 0;

        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. whats day today?");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            int limit = 5000;
            int depoLimit = 10000;
            // day++;

            switch (choice) {
                case 1 -> {
                    while (true) {
                        if (depoLimit == 10000) {
                            System.out.print("Enter amount to deposit you limit to 10000 RMB : ");
                        } else {
                            System.out.println("can you deposit more or exit if you exit type >>>0<<<");
                        }
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > depoLimit) {
                            System.out.println(" Deposit Limit Exist.  Please enter a value less than or equal to " + depoLimit);
                        } else if (depositAmount == 0) {
                            System.out.println("Deposit amount must be positive!");
                            if (depoLimit <= 0) {
                                System.out.println("you have no more limit to deposit write EXIT to out");
                            } else {
                                System.out.println("Can you exit to for today");
                            }
                            String say = scanner.next();
                            if (say.equalsIgnoreCase("exit")) {
                                System.out.println("have a good day! see you! again!");
                                day++;
                                break;
                            } else if (say.equalsIgnoreCase("no")) {
                                continue;
                            }
                        } else if (depoLimit <= 0) {
                            day++;
                            break;
                        } else {
                            for (depoLimit = depoLimit; depoLimit >= depositAmount; depoLimit -= depositAmount) {
                                System.out.println("deposit limit exceeded by: " + Math.abs(depoLimit - depositAmount) + "RMB");
                                System.out.print("Do you want to deposit " + depositAmount + "RMB? (1/0): ");
                                int yes = scanner.nextInt();

                                if (yes == 1) {
                                    depoLimit -= depositAmount;
                                    account.deposit(depositAmount);
                                    System.out.println("""
                                                       ---------------------------------
                                                       You have to depo limit amount """ + depoLimit + " and you have ");
                                    System.out.println("Current balance now: " + account.CheckBalance() + "\n Day is: " + day);
                                    break;
                                } else if (yes == 0) {
                                    System.out.println("""
                                        ---------------------------------
                                        You have to depo limit amount """ + depoLimit + " and you have ");
                                    System.out.println("Current balance now: " + account.CheckBalance() + "\n Day is: " + day);
                                    break;
                                }
                            }
                        }
                    }
                    // account.deposit(depositAmount);
                    // System.out.println("Deposited: " + depositAmount + "\n Day is: " + day);
                }

                case 2 -> {
                    while (true) {
                        System.out.print("Enter amount to withdraw (if you exit to withdraw for today Enter >>0<<) : ");
                        // int limit = 5000;
                        // int done;
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > limit) {
                            System.out.println("Withdrawal limit exceeded. Please enter a value less than or equal to " + limit);
                        } else if (withdrawAmount == 0) {
                            System.out.println("Withdrawal amount cannot be zero.");
                            System.out.println("Can you exit to for today");
                            String say = scanner.next();
                            if (say.equalsIgnoreCase("exit")) {
                                System.out.println("have a good day! see you! again!");
                                day++;
                                break;
                            } else if (say.equalsIgnoreCase("no")) {
                                continue;
                            }
                        } else if (limit <= 0) {
                            day++;
                            break;
                        } else {
                            for (limit = limit; limit >= withdrawAmount; limit -= (int) withdrawAmount) {
                                System.out.println("Withdrawal limit exceeded by: " + Math.abs(limit - withdrawAmount) + "RMB");
                                System.out.print("Do you want to withdraw " + withdrawAmount + "RMB? (1/0): ");
                                int yes = scanner.nextInt();

                                if (yes == 1) {
                                    limit -= withdrawAmount;
                                    account.withdraw(withdrawAmount);
                                    System.out.println("""
                                                       ---------------------------------
                                                       You have to limit amount """ + limit + " and you have ");
                                    System.out.println("Current balance: " + account.CheckBalance() + "\n Day is: " + day);
                                    break;
                                } else if (yes == 0) {
                                    System.out.println("""
                                        ---------------------------------
                                        You have to limit amount """ + limit + " and you have ");
                                    System.out.println("Current balance: " + account.CheckBalance() + "\n Day is: " + day);
                                    break;
                                }

                            }
                        }
                        // account.withdraw(withdrawAmount);
                        // System.out.println("Withdrew: " + withdrawAmount + "\n Day is: " + day);
                    }
                }

                case 3 ->
                    System.out.println("Current balance: " + account.CheckBalance() + "\n Day is: " + day);

                case 4 -> {
                    System.out.println("""
                                       Hi hello today...
                                        Day is: """ + day);

                }
                case 5 -> {
                    exit = true;
                }
                default ->
                    System.out.println("""
                                       Invalid choice. Please select a valid option.
                                        Day is: """ + day);
            }
        }
        scanner.close();
    }
}
