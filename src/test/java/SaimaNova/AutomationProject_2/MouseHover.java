package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends driver {
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void hover() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	//span[contains(text(),'Home & Lifestyle')]
    	Actions action = new Actions(driver);
    	WebElement hovercheck = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(hovercheck).perform();
		Thread.sleep(3000);
		//Hover move to element
    	WebElement hoverfurniture = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[3]/a[1]/span[1]"));
		action.moveToElement(hoverfurniture).perform();
		Thread.sleep(3000);
		//span[contains(text(),'Living Room Furniture')]
    	WebElement livingRoom = driver.findElement(By.xpath("//span[contains(text(),'Living Room Furniture')]"));
		livingRoom.click();
		Thread.sleep(3000);
	}

}
