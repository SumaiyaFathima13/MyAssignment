package week3.day1;

public class LoginPageOverride extends BasePageOverride {
	
	@Override
	public void performCommonTasks() {
		System.out.println("I am overriding the performCommonTasks method");
	}
	
	public static void main(String[] args) {
		LoginPageOverride l = new LoginPageOverride();
		
		l.findElement();
		l.clickElement();
		l.enterText();
		l.performCommonTasks();
	}

}
