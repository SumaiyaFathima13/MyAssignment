package week3.day1;

public class TextFieldInheritance extends WebElementInheritance {

	public void getText() {
		System.out.println("Get text is Ayman");
	}
	
	public static void main(String[] args) {
		TextFieldInheritance t = new TextFieldInheritance();
		
		t.click();
		t.setText("Success");
		t.getText();
	}

}
