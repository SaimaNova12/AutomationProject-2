package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Navigationcommands extends driver{
         
	String url = "https://www.daraz.com.bd/";
	@Test
	public void navigationTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		signup.click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
}
