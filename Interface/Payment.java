package Interface;

public interface Payment {
   void processpayment (double amount);
}

class Creditcardpaymnet implements Payment{
	@Override
	public void processpayment(double amount) {
		System.out.println("Processing credit card payment $" + amount);
	}
}

class Slicepayment implements Payment{
	@Override
	public void processpayment(double amount) {
		System.out.println("Processing Slice card Payment $" + amount);
	}
}

class BankTransferPaymnet implements Payment{
	@Override
	public void processpayment(double amount) {
		System.out.println("Processing BankTransfer paymnet $" + amount);	
	}
}