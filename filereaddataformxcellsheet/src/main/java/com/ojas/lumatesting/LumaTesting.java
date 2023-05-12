package com.ojas.lumatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LumaTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		//Actions actions = new Actions(driver);
//		driver.findElement(By.xpath("//a[@id='ui-id-4']")).click();
		
//		driver.close();
		
//		WebElement clickable = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
//        new Actions(driver)
//                .clickAndHold(clickable)
//                .perform();
//		WebElement findElement = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
//		new Actions(driver)
//        .click(findElement)
//        .perform();
		
		driver.findElement(By.xpath("//span[.='Shop New Yoga']")).click();
		driver.navigate().back();
		
		WebElement clickable = driver.findElement(By.xpath("//span[.='Women']"));
		WebElement clickable1 = driver.findElement(By.xpath("//span[.='Tops']"));
		WebElement clickable2 = driver.findElement(By.xpath("//span[.='Bras & Tanks']"));
		
		new Actions(driver)
         .clickAndHold(clickable)
          .clickAndHold(clickable1)
          .click(clickable2)
          .perform();
          
          
		//driver.close();
	}
	//span[text()='Gear']
	//span[.='Shop New Yoga']
	//span[.='Women']
	//span[.='Tops']
	//span[.='Bras & Tanks']
	
	

}
