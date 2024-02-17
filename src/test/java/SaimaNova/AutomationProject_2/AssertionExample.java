package SaimaNova.AutomationProject_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends driver{
	
	String url = "https://www.selenium.dev/";
	
	@Test
	public void assertion() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		//Hard Assertion-- exact same 
		String expectedtitle = "Selenium";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		Thread.sleep(3000);
		System.out.println("Passed");
		
		
		//Soft assertion
		SoftAssert soft = new SoftAssert();
		String expectedtitle1 = "Selenium1";
		String actualtitle1 = driver.getTitle();
		soft.assertEquals(actualtitle1, expectedtitle1);
		System.out.println("Passed");
		soft.assertAll();
		Thread.sleep(3000);
		
	}

}
