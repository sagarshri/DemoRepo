package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WaitUtils;

public class EdurekaHomePage extends BaseOperation {
	
	private WebElement userName;
	private WebElement homeSearchBar;
	private WebElement homeSearchBarIcon;
	
	
	public EdurekaHomePage(WebDriver driver) {
		super(driver);
		userName = driver.findElement(By.xpath("//li[1]/a/span[contains(text(),'Sagar')]"));
		homeSearchBar = driver.findElement(By.id("homeSearchBar"));
		homeSearchBarIcon = driver.findElement(By.id("homeSearchBarIcon"));
	}
	
	public String loggedINUsername() throws Exception{
		return elementControl.getText(userName);
	}
	
    public void searchCourse(String courseName) throws Exception{
	    elementControl.setText(homeSearchBar, courseName);
	    WaitUtils.waitForSeconds(2);
	    elementControl.clickElement(homeSearchBarIcon);
	}

}
