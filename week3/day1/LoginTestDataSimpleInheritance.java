package week3.day1;

public class LoginTestDataSimpleInheritance extends TestDataSimpleInheritance {

	public void enterUsername() {
		System.out.println("Enter the Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter the Password");
	}
	
	public static void main(String[] args) {
		LoginTestDataSimpleInheritance s = new LoginTestDataSimpleInheritance();
		
		s.enterCredentials();
		s.navigateToHomePage();
		s.enterUsername();
		s.enterPassword();
	}

}
