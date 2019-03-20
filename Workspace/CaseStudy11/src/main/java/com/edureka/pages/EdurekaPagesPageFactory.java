package com.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitUtils;

public class EdurekaPagesPageFactory extends BaseOperation {

	public EdurekaPagesPageFactory(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']/img")
	private WebElement userImage;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']//following-sibling::ul/li[1]")
	private WebElement userProfile;
	
	@FindBy(id = "personal_details")
	private WebElement personalDetails;
	
	@FindBy(xpath = "//div[@class='profile-photo-section']/a/i[@class='icon-camera']")
	private WebElement cameraIcon;
	
	@FindBy(xpath = "//div[@class='file-upload']/span//following-sibling::input")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//button[contains(text(),'Upload')]")
	private WebElement uploadButton;
	
	
	public void userLogin(String sUserEmailId, String sUserPassword) throws Exception {

		elementControl.clickElement(loginButton);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(emailID, sUserEmailId);
		WaitUtils.waitForSeconds(2);
		elementControl.setText(password, sUserPassword);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(submitButton);
		WaitUtils.waitForSeconds(5);
		String filename = String.format("%s/screenshots/Login.png",System.getProperty("user.dir"));
		screenshotControl.captureAndSaveScreenshot(filename);
	}
	
	 public String getUserName() throws Exception{
		return elementControl.getText(userName);
	}
	 
	 public void uploadImageProfile() throws Exception {
		elementControl.clickElement(userImage);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(userProfile);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(personalDetails); 
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(cameraIcon);
		WaitUtils.waitForSeconds(2);
		elementControl.clickElement(chooseFile);
		WaitUtils.waitForSeconds(2);
		Runtime.getRuntime().exec("E:\\Workspace\\CaseStudy11\\Scripts\\UploadImage.exe");
		WaitUtils.waitForSeconds(8);
		String filename = String.format("%s/screenshots/Image_Path_updated.png",System.getProperty("user.dir"));
		screenshotControl.captureAndSaveScreenshot(filename);
	}
	
}
