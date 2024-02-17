package SaimaNova.AutomationProject_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollHandling extends driver{
	String url = "https://www.w3newspapers.com/";
	
	@Test
	public void scroll() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        //Scroll Down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
        
        // Scroll UP
        js.executeScript("window.scrollTo(0,0)");
    	Thread.sleep(5000);
    	
    	//Scroll Specific
    	WebElement text1 = driver.findElement(By.xpath("//h3[contains(text(),'Diplomatic Impact:')]"));
    	js.executeScript("arguments[0].scrollIntoView(true)", text1);
    	Thread.sleep(5000);
	}
	

}
