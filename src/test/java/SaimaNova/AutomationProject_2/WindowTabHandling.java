package SaimaNova.AutomationProject_2;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowTabHandling extends driver{
	
 
	String url1 ="https://demoqa.com/frames";
	String url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void tabhandling() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get(url1);
		String originalTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		String secondtab = driver.getWindowHandle();
		driver.get(url2);
		Thread.sleep(3000);
		
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		
		driver.switchTo().window(secondtab);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		
	}

}
