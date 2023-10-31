package BankAccount;
import java.util.Scanner;

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
                    System.out.print("Enter deposit amount: ");
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
                    System.out.println("Thank you for using the bank account system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }