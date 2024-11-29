package ExceptionHandling;

//Custom exception class
class InsufficientFundsException extends Exception {
 // Constructor that takes a message
 public InsufficientFundsException(String message) {
     super(message);
 }
}

public class BankAccount {
 private double balance;

 // Constructor to initialize balance
 public BankAccount(double balance) {
     this.balance = balance;
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientFundsException {
     // If withdrawal amount is greater than balance, throw exception
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal. Available balance: " + balance);
     } else {
         balance -= amount; // Subtract the amount from the balance
         System.out.println("Withdrawal successful. New balance: " + balance);
     }
 }

 public static void main(String[] args) {
     BankAccount account = new BankAccount(500.00); // Initial balance of $500

     try {
         // Attempting to withdraw $600, which is more than the available balance
         account.withdraw(600.00);
     } catch (InsufficientFundsException e) {
         // Handle the exception if insufficient funds
         System.out.println("Error: " + e.getMessage());
     }

     try {
         account.withdraw(300.00);
     } catch (InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

