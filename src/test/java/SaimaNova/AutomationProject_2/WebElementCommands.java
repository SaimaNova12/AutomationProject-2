package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends driver{
	
	String url = "https://demoqa.com/automation-practice-form";
	@Test
	public void webElements() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//sendKeys
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Saima");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("Nova");
		Thread.sleep(2000);
		//Click Command & Clear Command
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.clear();
		dob.click();
		Thread.sleep(2000);
		
		//Get attribute Command
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		//System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getAttribute("pattern"));
		Thread.sleep(2000);
		//Get Text
		WebElement text = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		String value = text.getText();
		System.out.println(value);
		//Get CSS Values
		System.out.println(text.getCssValue("font-size"));
		System.out.println(text.getCssValue("color"));
		
		if(email.isDisplayed()) {
			System.out.println("Saima@gmail.com");
			Thread.sleep(2000);
		}
		else {
			System.out.println("No Locators is Found");
		}
		
	    WebElement sports = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
	    if(!sports.isSelected()) {
	    	sports.click();
	    	Thread.sleep(2000);
	    	}
	    	else {
	    		System.out.println("Sports is already selected");
	    	}	
	    	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}