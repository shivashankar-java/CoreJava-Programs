package Encapsulation;

public class BankAccountTest {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount();

	        // Deposit money into the account
	       account.deposit(10000);
	        System.out.println("Balance: " + account.getbalance());  

	        // Withdraw money from the account
	        account.withdraw(4999);
	        System.out.println("Balance: " + account.getbalance());  

	        // Invalid deposit and withdrawal
	        account.deposit(-2000);      // Output: Deposit amount must be positive.
	        account.withdraw(600000);   // Output: Invalid withdrawal amount.
	    }
	}

