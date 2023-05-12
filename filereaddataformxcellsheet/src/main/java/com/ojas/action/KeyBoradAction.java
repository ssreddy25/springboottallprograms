package com.ojas.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradAction {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ojas-it.com");
		driver.manage().window().maximize();
		
		new Actions(driver)
		         .keyDown(Keys.CONTROL)
		         .sendKeys("a")
		         
		         .keyUp(Keys.CONTROL)
		         .perform();
		
		//driver.close();

	}

}
