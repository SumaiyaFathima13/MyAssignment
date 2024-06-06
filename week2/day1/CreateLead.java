package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
				
				
				//Click Create Lead link
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumaiya");

				//Enter the lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Abdul Wahid");

				//Enter the Company Name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");

				//Enter the Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");	
				
				Thread.sleep(2000);
				
				//Click on Createlead button
				driver.findElement(By.className("smallSubmit")).click();
				
	
				//Verify the title
				String title = driver.getTitle();
				System.out.println(title);

				if (title.contains("Lead")) {
					System.out.println(title+" is displaying correctly");
				} else {
					System.out.println(title+" is not displaying correctly");
				}
				
				//Close the browser
				driver.close();

				
	}

}
