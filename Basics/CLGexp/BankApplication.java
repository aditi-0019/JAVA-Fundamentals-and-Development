import java.util.Scanner;
class BankAccount {
    // Private data members (Encapsulation)
    private String accountHolder;
    private double balance;
    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }   
   
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount.");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(name, balance);
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            System.out.println("This is Aditi's Program");
            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
                
        } while (choice != 4);

        sc.close();
    }
}

