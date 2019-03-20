package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WaitUtils;



public class EdurekaCourseDetailsPage extends BaseOperation {
	
	//private WebElement closeQuery;
	private WebElement scrollDown;
	private WebElement enrollButton;
	private String pageTitle;
	
	public EdurekaCourseDetailsPage(WebDriver driver) {
		super(driver);
		//closeQuery = driver.findElement(By.xpath("//ul[@id='dropQuery-form']//h4//a/i"));
		enrollButton = driver.findElement(By.xpath("//div[@class='top_batch']/div[2]/a/button"));
		scrollDown = driver.findElement(By.xpath("//div[@class='top_batch']"));
		pageTitle = driver.getTitle();
	}

	public void enrollCourse() throws Exception{
		//elementControl.clickElement(closeQuery);
		int x = scrollDown.getLocation().getX();
		int y = scrollDown.getLocation().getY();
		javascriptControl.scrollDown(x, y);
		WaitUtils.waitForSeconds(4);
		elementControl.clickElement(enrollButton);
		
		
	}
	
	public String fetchTitle() {
		return pageTitle;
	}
}
