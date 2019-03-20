package com.edureka.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementation.ScreenshotControl;
import utility.WaitUtils;

public class HomePage extends BaseOperation{
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	private WebElement loginButton;

	@FindBy(id = "inputName")
	private WebElement emailID;
	
	@FindBy(id = "pwd1")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//li[1]/a/span[contains(text(),'Sagar')]")
	private WebElement userName;
	
	@FindBy(id = "dropdownMenu4")
	private WebElement community;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]/a[contains(text(),'Blog')]")
	private WebElement blog;
	
	@FindBy(id = "search-inp")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[@id='desktop-searchbox']//span[@class='typeahead-button']/i[1]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='mainsearchpan']//ul/li[4]/a")
	private WebElement interviewQuestion;
	
	public void userLogin(String sUserEmailId, String sUserPassword) throws Exception {

		elementControl.clickElement(loginButton);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(emailID, sUserEmailId);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(password, sUserPassword);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(submitButton);
		
	}
	
	 public String getUserName() throws Exception{
		return elementControl.getText(userName);
	}
	 
	 public String searchBlog(String searchTopic, WebDriver driver) throws Exception {
		elementControl.clickElement(community);
		WaitUtils.waitForSeconds(3);
		String parentWindow = driver.getWindowHandle();
		elementControl.clickElement(blog);
		WaitUtils.waitForSeconds(3);
		Set<String> windoHandles = driver.getWindowHandles();
		String childWindoHandle = windoHandles.toArray()[1].toString();
		driver.switchTo().window(childWindoHandle);
		System.out.println("Searching for :"+searchTopic + "Blogs");
		elementControl.setText(searchBox, searchTopic);
		WaitUtils.waitForSeconds(3);
		elementControl.clickElement(searchButton);
		WaitUtils.waitForSeconds(7);
		elementControl.clickElement(interviewQuestion);
		WaitUtils.waitForSeconds(5);
	    String title = driver.getTitle();
	    driver.close();
        driver.switchTo().window(parentWindow);
        return title;
	}
	
}
