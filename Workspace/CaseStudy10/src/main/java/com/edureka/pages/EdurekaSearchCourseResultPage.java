package com.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EdurekaSearchCourseResultPage extends BaseOperation{
	
	private WebElement searchResultText;
	private WebElement selectCourse;

	 public EdurekaSearchCourseResultPage(WebDriver driver) {
		super(driver);
		searchResultText = driver.findElement(By.xpath("//div[@class='cattitle']"));
		selectCourse = driver.findElement(By.xpath("//div[@class='courseimgsecgrid']/a[1]"));
	}
	
	 public String returnSearchText() throws Exception {
		String courseText = elementControl.getText(searchResultText);
		System.out.println("Selected course is : "+courseText);
		return courseText;
	}
	 
	 public void selectCourse() throws Exception {
		elementControl.clickElement(selectCourse);
	}
}
