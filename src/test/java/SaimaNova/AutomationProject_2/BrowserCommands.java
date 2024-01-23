package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommands extends driver{
       
	String url = "https://www.daraz.com.bd/";
	
    public void browsercommands() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//Before & After Title
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		signup.click();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Before & After Link
		
    }

}
