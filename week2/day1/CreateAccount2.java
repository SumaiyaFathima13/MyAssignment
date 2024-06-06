package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

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
		driver.findElement(By.id("accountName")).sendKeys("Anam");

		//Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		//Select the Industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(industry);
		options.selectByVisibleText("Computer Software");

		//Select the ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(ownership);
		options1.selectByVisibleText("S-Corporation");
		
		//Select the source
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select options2 = new Select(source);
		options2.selectByValue("LEAD_EMPLOYEE");
		

		//Select the Marketing
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select options4 = new Select(marketing);
		options4.selectByIndex(6);
		
		//Select the state
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options3 = new Select(state);
		options3.selectByValue("TX");
		
		//Click on Createaccount button
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		//Verify the title
		String accountname = driver.findElement(By.xpath("//span[contains(text(), 'Anam')]")).getText();
		System.out.println(accountname);

		if (accountname.contains("Anam")) {
			System.out.println(accountname+" is displaying correctly");
		} else {
			System.out.println(accountname+" is not displaying correctly");
		}
		
		//Close the browser
		//driver.close();
		

	}

}
