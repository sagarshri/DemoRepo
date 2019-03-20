package com.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitUtils;

public class EdurekaPaymentPage extends BaseOperation {

	 
	
	 public EdurekaPaymentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy (xpath = "//button[contains(text(),'Pay Securely')]")
	 protected WebElement paySecurely;
	 
	 @FindBy (xpath = "//div[@id='pad-common']/div[1]/div//following-sibling::label/../input")
	 protected WebElement phoneNumber;
	 
	 @FindBy (xpath = "//div[@id='payment-options']/div[2]")
	 protected WebElement paymentMode;
	 
	 @FindBy (xpath = "//div[@id='netb-banks']/div[2]")
	 protected WebElement selectBank;
	 
	 @FindBy (xpath = "//div[@id='modal-close']")
	 protected WebElement canclePayment;
	 
	 @FindBy (xpath = "//div[contains(text(),'Select a payment method')]")
	 protected WebElement validation;

	 @FindBy (xpath = "//iframe[@class='razorpay-checkout-frame']")
	 protected WebElement frame;
	 
	 String validationText;
  
    public String PaymentProcess() throws Exception{
    	elementControl.clickElement(paySecurely);
    	WaitUtils.waitForSeconds(3);
    	frameControl.switchToFrame(frame);
    	elementControl.setText(phoneNumber, "5356454658");
    	WaitUtils.waitForSeconds(2);
    	System.out.println("Final payment page text is : "+ elementControl.getText(validation));
    	validationText = elementControl.getText(validation);
    	elementControl.clickElement(paymentMode);
    	WaitUtils.waitForSeconds(3);
    	elementControl.clickElement(selectBank);
    	WaitUtils.waitForSeconds(2);
    	String fileName = String.format("%s/screenshots/PaymentScreen.png",System.getProperty("user.dir"));
    	screenshotControl.captureAndSaveScreenshot(fileName);
    	elementControl.clickElement(canclePayment);
    	return validationText;
    	
    }
    
   
}
