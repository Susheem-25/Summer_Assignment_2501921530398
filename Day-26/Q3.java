import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        int choice = 0;
        System.out.println("--- Welcome to the Java Bank ATM ---");
        while (choice != 4) {
            System.out.println("\nATM Menu:\n1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Your current balance is: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: $");
                double depositAmount = sc.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: $" + balance);
                } else {
                    System.out.println("Invalid amount. Deposit failed.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: $");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful. Remaining balance: $" + balance);
                } else if (withdrawAmount > balance) {
                    System.out.println("Transaction failed: Insufficient funds.");
                } else {
                    System.out.println("Invalid amount. Withdrawal failed.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using Java Bank ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please select an option from 1 to 4.");
            }
        }
        sc.close();
    }
}