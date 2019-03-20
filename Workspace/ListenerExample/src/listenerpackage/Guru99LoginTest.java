package listenerpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerpackage.ListenerDemo.class)


public class Guru99LoginTest {
	WebDriver driver;
	
  @Test(priority=1)
  public void loginTest() {
	  	System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr26593");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.name("btnLogin")).click();
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		}
  
  // failing the test
  @Test(priority=4)
  public void MethodToFail() {
	Assert.assertTrue(false);
}
  
}
