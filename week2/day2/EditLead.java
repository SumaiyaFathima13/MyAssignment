package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
				
				
				//Click Create Lead link
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the firstname
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sumaiya");

				//Enter the lastname
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Abdul Wahid");

				//Enter the Company Name
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");

				//Enter the FirstNameLocal
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sindu");	

				//Enter the Department
				driver.findElement(By.name("departmentName")).sendKeys("Testing");	
				
				//Enter the Description
				driver.findElement(By.name("description")).sendKeys("Testing Purpose");	
				
				//Enter the Email id
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sindu.narayanan@yahoo.com");
				
				
				//Select the Province
				WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select province = new Select(state);
				province.selectByVisibleText("New York");
				
				Thread.sleep(2000);
				
				//Click on Createlead button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Click on Edit button
				driver.findElement(By.xpath("//a[text()='Edit']")).click();

				
				//Clear the Description
				driver.findElement(By.name("description")).clear();	
				
				
				//Enter the ImportantNote
				driver.findElement(By.name("importantNote")).sendKeys("Testing Purpose");
				
				//Click on Update button
				driver.findElement(By.className("smallSubmit")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
