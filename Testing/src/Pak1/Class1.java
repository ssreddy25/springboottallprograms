package Pak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver a =new ChromeDriver();
		a.get("https://ojas.oneable.ai");
		a.manage().window().maximize();
		//xpath("//*[text()='Google offered in')]"));
		
		a.findElement(By.name("signin-email")).sendKeys("sivasankarreddy.uppaluru@ojas-it.com");
		Thread.sleep(3000);
		a.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2000);
		a.findElement(By.name("signin-password")).sendKeys("Reddy@123");
		Thread.sleep(2000);
		a.findElement(By.xpath("//*[text()='LOGIN']")).click();
		
		//*[text()='LOGIN']
}
}