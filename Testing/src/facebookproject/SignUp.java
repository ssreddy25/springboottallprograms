package facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//if not insecpt the element we are going to perform actions.
		Actions actions = new Actions(driver);
		driver.get("https://www.ojas-it.com/");
		
		//*[text()='Home']
		WebElement menuOption=driver.findElement(By.xpath("//A[text()='Home']"));
		
		
		Thread.sleep(3000);
		actions.moveToElement(menuOption).perform();
		
		driver.findElement(By.xpath("//A[text()='Contact Us']")).click();
		
		//*[text()='About Us']

	}

}
