package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
						
		//Click Lead link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find Lead link
		driver.findElement(By.linkText("Find Leads")).click();		

		//Click Phone link
		driver.findElement(By.xpath("//span[text()='Phone']")).click();	
		
		//Click Enter Phone Number link
		driver.findElement(By.name("phoneNumber")).sendKeys("89");	

		//Click Find Lead link
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	

		Thread.sleep(2000);
		
		//Get the first phone number
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(text);
		
		//Click on Phone Number
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//Click on Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		//Click Find Lead link
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();	
		
		//Enter the Lead ID
		driver.findElement(By.name("id")).sendKeys(text);
		
		//Click Find Lead link
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		
		Thread.sleep(3000);
		
		//
		String str = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (str.contains("No records")) {
			System.out.println("successful deletion");
		} else {
			System.out.println("Not successful deletion");
		}
		
		driver.close();
		}
				
	}


