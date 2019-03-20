package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EdurekaCourseCheckout extends BaseOperation{

	protected WebElement proceedPayment;
	private WebElement scrollDownTo;
	public EdurekaCourseCheckout(WebDriver driver) {
		super(driver);
		proceedPayment = driver.findElement(By.xpath("//div[@class='bch_slct']/div[6]/button[contains(text(),'PROCEED TO PAYMENT')]"));
		scrollDownTo = driver.findElement(By.xpath("//div[@class='bch_slct']/div[4]"));
	}
	
	public void proceedToPayment() throws Exception{
		int x = scrollDownTo.getLocation().getX();
		int y = scrollDownTo.getLocation().getY();
		javascriptControl.scrollDown(x, y);
		elementControl.clickElement(proceedPayment);
	}
}
