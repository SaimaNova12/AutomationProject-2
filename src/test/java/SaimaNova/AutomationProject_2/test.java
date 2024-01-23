package SaimaNova.AutomationProject_2;

import org.testng.annotations.Test;

public class test extends driver {

	@Test
	public void firstTest() throws InterruptedException {
		 driver.manage().window().maximize();
         driver.get("https://monkeypen.com/pages/free-stories-for-kids");
         Thread.sleep(1000);
         
         System.out.println(driver.getTitle());
	}

}
