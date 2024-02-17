package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice extends driver{
	
	//String url = "https://www.w3newspapers.com/";
	//String url = "https://www.shohoz.com/contact-us";
	String url = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void practice() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//Locators--w3newspaper
		//ID
		/*WebElement country = driver.findElement(By.id("z"));
		country.click();
		Thread.sleep(3000);
		//CLASSName
		WebElement namecheck = driver.findElement(By.className("ctn"));
		namecheck.click();
		Thread.sleep(3000);
		//LinkName
		WebElement linkname = driver.findElement(By.linkText("Uganda"));
		linkname.click();
		Thread.sleep(3000);
		//xpath
		WebElement xpath = driver.findElement(By.xpath("//p[contains(text(),'Through world newspapers, readers can explore dive')]"));
		xpath.click();
		Thread.sleep(3000);*/
		
		
		//w3newspaper--Browser get title and link before & after
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement browser = driver.findElement(By.xpath("//a[contains(text(),'Zimbabwe')]"));
		browser.click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		
		
		//W3Newspaper--Navigation -- Back , Forward & Refresh
		/*WebElement browser = driver.findElement(By.xpath("//a[contains(text(),'Zimbabwe')]"));
		browser.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
	
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);*/
		
		
		//Shohoz--WebElements--sendKeys,clear&click, 
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Saima");
		Thread.sleep(3000);	
		WebElement phonenumber = driver.findElement(By.xpath("//input[@id='contactnumber']"));
	    phonenumber.sendKeys("01644417057");
	    Thread.sleep(3000);
	    
	    
	    //Clear & Click--demoqa
	   /* WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	    dob.clear();
	    //dob.sendKeys("15/02/2021");
	    dob.click();
	    Thread.sleep(4000);
	    //getAttribute value
	    WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
	    System.out.println(email.getAttribute("type"));
	    System.out.println(email.getAttribute("placeholder"));
	    Thread.sleep(3000);
	    //Get text
	    WebElement text = driver.findElement(By.xpath("//label[@id='currentAddress-label']"));
	    text.click();
	    System.out.println(text.getText());
	    Thread.sleep(3000);
	    WebElement games = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
	    if(!games.isSelected()) {
	    	games.click();
	    	Thread.sleep(3000);
	    }
	    else {
	    	System.out.println("Nothing to Select");
	    }*/
	    
	}

}
