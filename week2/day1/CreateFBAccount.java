package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAccount {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the chrome
		ChromeDriver driver = new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
				
		//Load the Testleaf url
		driver.get("https://en-gb.facebook.com/");
		
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create Account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter Firstname
		driver.findElement(By.name("firstname")).sendKeys("Sumaiya");
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Narayanan");
		
		//Enter email id
		driver.findElement(By.name("reg_email__")).sendKeys("sindu.narayanan@yahoo.com");
		
		//Enter Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("AnamAyman07$");
		
		//Select B.date
		WebElement bdate = driver.findElement(By.name("birthday_day"));
		Select date = new Select(bdate);
		date.selectByValue("13");
		
		//Select B.month
		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bmonth);
		month.selectByValue("12");		
		
		//Select B.year
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select year = new Select(byear);
		year.selectByValue("1992");	
		
		//Select Gender
		driver.findElement(By.xpath("//label [text()='Female']")).click();
		
		Thread.sleep(1000);
		
		//Close the Browser
		driver.close();
	}

}
