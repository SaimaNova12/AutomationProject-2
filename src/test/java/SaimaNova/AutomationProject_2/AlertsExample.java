package SaimaNova.AutomationProject_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsExample extends driver {
	String url = "https://demoqa.com/alerts";
	
    @Test
    public void alert() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
    	alert1.click();
    	Thread.sleep(2000);
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	Thread.sleep(2000);
    	
    	WebElement alert2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
    	alert2.click();
    	Thread.sleep(6000);
    	//Alert alert = driver.switchTo().alert();
    	alert.accept();
    	Thread.sleep(6000);
    	
    	WebElement confirmbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
    	confirmbutton.click();
    	Thread.sleep(3000);
    	alert.dismiss();
    	Thread.sleep(2000);
    	//System.out.println(confirmbutton.getText());
    	
    	WebElement promtbutton = driver.findElement(By.xpath("//button[@id='promtButton']"));
    	promtbutton.click();
    	Thread.sleep(2000);
    	alert.sendKeys("Saima");
    	alert.accept();
    	Thread.sleep(2000);
    	}
    
}
