package SaimaNova.AutomationProject_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class practice_2 extends driver{
	String url = "https://www.w3schools.com/";
	
	@Test
	public void explicitwait() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement menu = driver.findElement(By.xpath("//a[@id='navbtn_tutorials']"));
		//Select select = new Select(menu);
		menu.click();
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement ex = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='top-nav-bar']/div[@id='dropdown-nav-outer-wrapper']/div[@id='dropdown-nav-inner-wrapper']/nav[@id='nav_tutorials']/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")));
		ex.click();
		Thread.sleep(3000);
	}
}