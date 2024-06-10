package week3.day1;

public class CheckBoxButtonInheritance extends ButtonInheritance {
	
	public void clickCheckButton() {
		System.out.println("Click the Ratio check button");
	}

	public static void main(String[] args) {
		CheckBoxButtonInheritance c = new CheckBoxButtonInheritance();
		
		c.click();
		c.setText("Success");
		c.submit();
		c.clickCheckButton();
	}

}
