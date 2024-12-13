package Encapsulation;

public class BankAccount {
	   private double balance;
	   
	   public double getbalance(){
		   return balance;
	   }
	    
	   public void deposit(double amount) {
		if (amount>0 ) {
			   balance+= amount;
		}
			   else {
			   System.out.println("The deposit amount is positive")	;
			   }
	   }

	    // Public setter for withdrawal
	    public void withdraw (double amount) {
	    	if(amount>0 && amount<=balance) {
	    		balance -= amount;
	    	}
	    	else {
	    		System.out.println("Invaild amount");
	    	}
	    }
	    
	}

	


