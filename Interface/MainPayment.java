package Interface;

public class MainPayment {
	public static void main(String[] args) {
		
		    Payment creditCard = new Creditcardpaymnet();
	        Payment slicepayment = new Slicepayment();
	        Payment bankTransfer = new BankTransferPaymnet();
	        
	        creditCard.processpayment(1000.0);  
	        slicepayment.processpayment(1500.0);      
	        bankTransfer.processpayment(5000.0); 
	}
}

