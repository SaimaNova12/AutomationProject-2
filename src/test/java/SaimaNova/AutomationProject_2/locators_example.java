package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locators_example extends driver{
	@Test
	public void locators() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us");
		Thread.sleep(5000);
		
		//by ID
		WebElement bus = driver.findElement(By.id("purpose"));
		bus.click();
		Thread.sleep(5000);
		
		//By attribute name
		WebElement bus1 = driver.findElement(By.name("purpose"));
		bus1.click();
		Thread.sleep(5000);
		
		//By link (link name)
		WebElement launch = driver.findElement(By.linkText("Launch"));
		launch.click();
		Thread.sleep(5000);
		
		//By partial linktext
		WebElement launch1 = driver.findElement(By.partialLinkText("Contact"));
		launch1.click();
		Thread.sleep(5000);
		
		//By Class
		WebElement select = driver.findElement(By.className("btn"));
		select.click();
		Thread.sleep(5000);
		
		//xpath tagname
		WebElement select1 = driver.findElement(By.xpath("//select[@name='purpose']"));
		select1.click();
		Thread.sleep(5000);
	
	}

}

