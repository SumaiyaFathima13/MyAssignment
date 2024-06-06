package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the chrome
		ChromeDriver driver = new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
				
		//Load the Testleaf url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Account link
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click Create Account link
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter the account name
		driver.findElement(By.id("accountName")).sendKeys("Sumaiya");

		//Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		//Enter the numberEmployess
		driver.findElement(By.id("numberEmployees")).sendKeys("10");

		//Enter the sitename
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");	
		
		//Click on Createaccount button
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		//Verify the title
		String title = driver.getTitle();
		System.out.println(title);

		if (title.contains("Account")) {
			System.out.println(title+" is displaying correctly");
		} else {
			System.out.println(title+" is not displaying correctly");
		}
		
		//Close the browser
		driver.close();
		

	}

}
