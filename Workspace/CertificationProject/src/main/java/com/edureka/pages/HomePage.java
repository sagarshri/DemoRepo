package com.edureka.pages;

import java.util.Random;
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
	
	@FindBy(xpath = "//a[@id='dropdownMenu3']")
	private WebElement courseDropdown;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[1]/a[contains(text(),'My Classroom')]")
	private WebElement enrolledCourses;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]/a[contains(text(),'All Courses')]")
	private WebElement allCourses;
	
	@FindBy(id = "search-inp")
	private WebElement searchInput;
	
	@FindBy(id = "search-button-top")
	private WebElement courseSearchButton;
	
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
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']/img")
	private WebElement userImage;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']//following-sibling::ul/li[1]")
	private WebElement userProfile;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']//following-sibling::ul/li[7]")
	private WebElement logout;
	
	@FindBy(id = "professional_details")
	private WebElement professionalDetails;
	
	@FindBy(xpath = "//input[@name='companyName']")
	private WebElement companyName;
	
	@FindBy(xpath = "//input[@name='linkedinLink']")
	private WebElement linkdinProfile;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement homePageLink;
	
	@FindBy(xpath = "//li[@id='course-box-674']/div/span[@class='cardmain']/div[1]//i[@class='icon-Wishlist']")
	private WebElement whishlistIcon;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']//following-sibling::ul/li[5]")
	private WebElement wishlistDetails;
	
	@FindBy(xpath = "//div[@class='cattitle']")
	private WebElement wishlistPageTitle;
	
	
	public void userLogin(String sUserEmailId, String sUserPassword) throws Exception {

		elementControl.clickElement(loginButton);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(emailID, sUserEmailId);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(password, sUserPassword);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(submitButton);
		WaitUtils.waitForSeconds(4);
		
	}
	
	 public String getUserName() throws Exception{
		String fileName = String.format("%s/screenshots/Login_%s.png",System.getProperty("user.dir"),dateutils.getDate());
		screenShotControl.captureAndSaveScreenshot(fileName);
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
		String fileName = String.format("%s/screenshots/InterviewQuestion_Blogs%s.png",System.getProperty("user.dir"),dateutils.getDate());
		screenShotControl.captureAndSaveScreenshot(fileName);
	    String title = driver.getTitle();
	    driver.close();
        driver.switchTo().window(parentWindow);
        return title;
	}
	 
	 public String courseValidation(WebDriver driver) throws Exception {
		 
		 elementControl.clickElement(courseDropdown);
		 WaitUtils.waitForSeconds(2);
		 elementControl.clickElement(enrolledCourses);
		 WaitUtils.waitForSeconds(2);
		 String fileName = String.format("%s/screenshots/EnrolledCourses%s.png",System.getProperty("user.dir"),dateutils.getDate());
		 screenShotControl.captureAndSaveScreenshot(fileName);
		 String title = driver.getTitle();
		 driver.navigate().back();
		 return title;
	}
	 
	 public String searchAndADDCourse(String searchCourse) throws Exception {
		 elementControl.clickElement(courseDropdown);
		 WaitUtils.waitForSeconds(2);
		 elementControl.clickElement(allCourses);
		 WaitUtils.waitForSeconds(2);
		 elementControl.setText(searchInput, searchCourse);
		 WaitUtils.waitForSeconds(2);
		 elementControl.clickElement(courseSearchButton);
		 WaitUtils.waitForSeconds(2);
		// elementControl.clickElement(whishlistIcon);
		 elementControl.clickElement(userImage);
		 WaitUtils.waitForSeconds(2);
		 elementControl.clickElement(wishlistDetails);
		 WaitUtils.waitForSeconds(8);
		 String fileName = String.format("%s/screenshots/Wishlist_Page%s.png",System.getProperty("user.dir"),dateutils.getDate());
		 screenShotControl.captureAndSaveScreenshot(fileName);
		 String wishListTitle = elementControl.getText(wishlistPageTitle);
		 return wishListTitle;
		    
		 
	}
	 
	public String editProfile(WebDriver driver) throws Exception{
		elementControl.clickElement(userImage);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(userProfile);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(professionalDetails);
		WaitUtils.waitForSeconds(2);
		elementControl.clearText(companyName);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(companyName, "Oracle IDC");
		//WaitUtils.waitForSeconds(8);
		elementControl.clearText(linkdinProfile);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(linkdinProfile, "https://www.linkedin.com/feed/");
		WaitUtils.waitForSeconds(7);
		String fileName = String.format("%s/screenshots/UpdateProfessionalDetails%s.png",System.getProperty("user.dir"),dateutils.getDate());
		screenShotControl.captureAndSaveScreenshot(fileName);
	    String title = driver.getTitle();
	    driver.navigate().back();
	    elementControl.clickElement(homePageLink);
	    WaitUtils.waitForSeconds(3);
	    return title;
	    
		
	} 
	 
	 public void userLogout() throws Exception {
		elementControl.clickElement(userImage);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(logout);
		WaitUtils.waitForSeconds(5);
		String fileName = String.format("%s/screenshots/Logout_%s.png",System.getProperty("user.dir"),dateutils.getDate());
		screenShotControl.captureAndSaveScreenshot(fileName);
	}
	
}
