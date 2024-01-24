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
    	
    //Alert Commands
    	WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
    	alert1.click();
    	Thread.sleep(3000);
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	Thread.sleep(3000);
    	
    	WebElement alertconfirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
    	alertconfirm.click();
    	Thread.sleep(3000);
    	//alert.accept();
    	alert.dismiss();
    	Thread.sleep(3000);
    	
    	//span[@id='confirmResult']
    	WebElement confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']"));
    	System.out.println(confirmResult.getText());
    	
    	//prompt button
    	WebElement pbutton = driver.findElement(By.xpath("//button[@id='promtButton']"));
    	pbutton.click();
    	Thread.sleep(3000);
    	//Alert alert = driver.switchTo().alert();
    	alert.sendKeys("Worldddd");
    	alert.accept();
    	Thread.sleep(3000);
    }
}
