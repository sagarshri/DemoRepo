package com.edureka.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.AlertControl;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.FrameControl;
import commonLibs.implementation.JavascriptControl;
import commonLibs.implementation.MouseControl;
import commonLibs.implementation.ScreenshotControl;

public class BaseOperation {

	protected ElementControl elementControl;
	protected DropdownControl dropdownControl;
	protected MouseControl mouseControl;
	protected AlertControl alertControl;
	protected JavascriptControl javascriptControl;
	protected ScreenshotControl screenshotControl;
	protected FrameControl frameControl;
	

	public BaseOperation(WebDriver driver) {
		elementControl = new ElementControl();
		mouseControl = new MouseControl(driver);
		dropdownControl = new DropdownControl();
		alertControl = new AlertControl(driver);
		javascriptControl = new JavascriptControl(driver);
		screenshotControl = new ScreenshotControl(driver);
		frameControl = new FrameControl(driver); 
	}

}
