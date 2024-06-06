package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the leaf url
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Wait
		Thread.sleep(3000);
		
		//Using webelement to declare as local variable
		WebElement db = driver.findElement(By.className("ui-selectonemenu"));
		
		//Create an object for Select class
		Select options=new Select(db);
		
		//Call the method using index
		//options.selectByIndex(4);
		
		//Call the method using visble text
		options.selectByVisibleText("Cypress");
		
		
		//Wait
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();

	}

}
