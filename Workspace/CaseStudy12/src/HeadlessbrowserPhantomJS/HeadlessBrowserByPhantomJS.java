package HeadlessbrowserPhantomJS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowserByPhantomJS {
	
	public static void main(String[] args) {
		
		File file = new File ("C:/Users/sshrivat.ORADEV/Downloads/Setup/phantomjs-2.1.1-windows/bin/phantomjs.exe");
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        System.out.println("Page Title is :" + driver.getTitle());
 	    WebElement element = driver.findElement(By.name("q"));
 	    element.sendKeys("edureka");
 	    element.submit();
 	    System.out.println("Page Title is :" + driver.getTitle());
 	    driver.close();
	}

}
