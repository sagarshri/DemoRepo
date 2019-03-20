package HeadlessbrowserHTMLDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadlessBrowserByHtmlUnit {
   public static void main(String[] args) {
	   WebDriver driver = new HtmlUnitDriver();
	   driver.get("http://www.google.com");
	   System.out.println("Page Title is :" + driver.getTitle());
	   WebElement element = driver.findElement(By.name("q"));
	   element.sendKeys("edureka");
	   element.submit();
	   System.out.println("Page Title is :" + driver.getTitle());
	   driver.close();
}
}
