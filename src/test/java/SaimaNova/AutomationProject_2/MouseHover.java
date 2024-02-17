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
    	
        Actions hover = new Actions(driver);
        WebElement hovercheck = driver.findElement(By.xpath("//span[contains(text(),'Electronic Accessories')]"));
        hovercheck.click();
        hover.moveToElement(hovercheck).perform();
        Thread.sleep(2000);
        
        //Delves into particular element
        WebElement software = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[9]/a[1]/span[1]"));
        hover.moveToElement(software).perform();
        Thread.sleep(2000);
        
        WebElement softwaredive = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[9]/ul[1]/ul[1]/li[1]/a[1]/img[1]"));
        hover.moveToElement(softwaredive).perform();
        softwaredive.click();
        Thread.sleep(2000);
  }
}
