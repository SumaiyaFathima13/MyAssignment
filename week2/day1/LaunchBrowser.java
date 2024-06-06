package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Initiate the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the Facebook url
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(3000);
		
		//Provide the username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Provide the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click on Login button
		driver.findElement(By.name("login")).click();
		
		//wait
		Thread.sleep(3000);
		
		//Click on find account
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verifying the title
		if (title.contains("Facebook")) {
			System.out.println("Page is verified successfully");
		} else {
			System.out.println("Page is not verified successfully");
		}
		
		//wait
		Thread.sleep(3000);
		
		//Close the browser
		driver.close();
	}

}
