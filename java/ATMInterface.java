import java.util.Scanner;

// Class representing the ATM
class ATM {
    private BankAccount account;
    private Scanner scanner = new Scanner(System.in);

    // Constructor to initialize the account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Main method to start the ATM interface
    public void start() {
        int choice;
        do {
            System.out.println("\nATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositAmount();
                    break;
                case 3:
                    withdrawAmount();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
    }

    // Method to check the account balance
    private void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    // Method to deposit money
    private void depositAmount() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Deposit successful. Your new balance is: $" + account.getBalance());
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to withdraw money
    private void withdrawAmount() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful. Your new balance is: $" + account.getBalance());
            } else {
                System.out.println("Insufficient funds. Unable to withdraw.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}

// Class representing a Bank Account
class BankAccount {
    private double balance;

    // Constructor to initialize the account balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to return the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;  // Insufficient funds
        }
    }
}

// Main class to run the ATM program
public class ATMInterface {
    public static void main(String[] args) {
        // Initialize the account with an initial balance
        BankAccount userAccount = new BankAccount(500.00);  // Initial balance is $500
        
        // Create the ATM instance with the user's bank account
        ATM atm = new ATM(userAccount);
        
        // Start the ATM interface
        atm.start();
    }
}