package week3.day1;

public class RadioButtonInheritance extends ButtonInheritance {
	
	public void selectRadioButton() {
		System.out.println("Click the Gender radio button");
	}

	public static void main(String[] args) {
		RadioButtonInheritance r = new RadioButtonInheritance();
		
		r.click();
		r.setText("Success");
		r.submit();
		r.selectRadioButton();
	}

}
