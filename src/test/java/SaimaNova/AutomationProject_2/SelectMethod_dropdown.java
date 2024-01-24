package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethod_dropdown extends driver{
	   String url ="https://www.amazon.com/";
    
	@Test   
	public void selectTest() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	//select[@id='searchDropdownBox']
    	WebElement menu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    	Select select = new Select(menu);
    	
    	//SelectByIndex
    	select.selectByIndex(5);
    	Thread.sleep(3000);
    	
    	//SelectByValue
    	select.selectByValue("search-alias=digital-music");
    	Thread.sleep(3000);
    	
    	//Select by visible text
    	select.selectByVisibleText("computers");
    	Thread.sleep(3000);
	}
}
