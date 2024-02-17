package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrames extends driver{
	String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	//String url = "https://github.com/";
	@Test
	public void handlingframes() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		Thread.sleep(3000);
		System.out.println(iframeNumber);
		
		driver.switchTo().frame("packageListFrame");
		
		WebElement selenium = driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/div[2]/div[5]"));
		selenium.click();
		Thread.sleep(3000);
	}

}
