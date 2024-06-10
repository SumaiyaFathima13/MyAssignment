package week3.day1;

public class ButtonInheritance extends WebElementInheritance {
	
	public void submit() {
		System.out.println("Submit the form");
	}
	
	public static void main(String[] args) {
		ButtonInheritance b = new ButtonInheritance();
		
		b.click();
		b.setText("Success");
		b.submit();
	}
	
}
