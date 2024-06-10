package week3.day1;

public class LearnMethodOverloading {
public void reportStep(String msg, String status) {
	System.out.println("Message is "+msg+"\n"+"Status should be "+status);
	
}
public void reportStep(boolean snap, String msg, String status) {
	System.out.println("Message should be "+msg+"\n"+"Status is "+status+"\n"+"Snap is "+snap);
}
public static void main(String[] args) {
	LearnMethodOverloading oi = new LearnMethodOverloading();
	oi.reportStep("Welcome", "Passed");
	oi.reportStep(true, "Leaf", "Success");	
}
}
