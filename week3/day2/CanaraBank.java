package week3.day2;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery() {
		System.out.println("Pay in CashonDelivery method");
		
	}

	public void upiPayments() {
		System.out.println("Pay in UPIPayment method");
		
	}
	
	public abstract void recordPaymentDetails();

}
