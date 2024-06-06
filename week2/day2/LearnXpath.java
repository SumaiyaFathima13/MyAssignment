package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the Testleaf url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		Thread.sleep(2000);

		//Enter the username
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa"); 
		
		//Click on Login
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click(); 
		
		//Click on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//Click on Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		Thread.sleep(1000);
		
		//Close the browser
		driver.close();
		
	}

}
