package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WaitUtils;

public class EdurekaLoginDetailsPage extends BaseOperation{
	private WebElement emailID;
	private WebElement password;
	private WebElement submitButton;
	
	public EdurekaLoginDetailsPage(WebDriver driver) {
		super(driver);
		emailID = driver.findElement(By.id("inputName"));
		password =	driver.findElement(By.id("pwd1"));
		submitButton = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
	}
	
	public void enterLoginDetails(String uMailID, String uPassword) throws Exception {
		elementControl.setText(emailID, uMailID);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(password, uPassword);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(submitButton);
	}
	
	
}
