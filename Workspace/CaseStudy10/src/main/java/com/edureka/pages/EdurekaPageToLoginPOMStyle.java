package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WaitUtils;

public class EdurekaPageToLoginPOMStyle extends BaseOperation {

	private WebElement loginButton;

	public EdurekaPageToLoginPOMStyle(WebDriver driver) {
		super(driver);
		loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
	}

	public void clickLoginButton() throws Exception {

		elementControl.clickElement(loginButton);
		WaitUtils.waitForSeconds(7);
	}
}
