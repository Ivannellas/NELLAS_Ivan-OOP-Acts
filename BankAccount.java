package BankAccount;
import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountName;
    double balance;

    // Default constructor
    public BankAccount() {
        this.accountNumber = 0;
        this.accountName = "";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public BankAccount(int accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You Deposited Php" + amount);
            System.out.println("Your current balance is :" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("You have Withdrawn Php" + amount);
            System.out.println("Your current balance is : " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountName);
        System.out.println("Balance: Php" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the account holder's name: ");
        String accountName = scanner.nextLine();

        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount myAccount = new BankAccount(accountNumber, accountName, initialBalance);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option (1/2/3/4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    myAccount.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}


