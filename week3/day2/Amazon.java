package week3.day2;

public class Amazon extends CanaraBank {

	public void cardPayments() {
		System.out.println("Pay in card medthod");
		
	}

	public void internetBanking() {
		System.out.println("Pay in InternetBanking method");
		
	}
	
	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details");
		
	}
	
	public static void main(String[] args) {
		Amazon a = new Amazon();
		
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
		}

}
