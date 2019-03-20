package com.edureka.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.AlertControl;
import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.MouseControl;
import commonLibs.implementation.ScreenshotControl;
import utility.DateUtils;

public class BaseOperation {

	protected ElementControl elementControl;
	protected DropdownControl dropdownControl;
	protected MouseControl mouseControl;
	protected AlertControl alertControl;
	protected ScreenshotControl screenShotControl;
	protected DateUtils dateutils;

	public BaseOperation(WebDriver driver) {
		elementControl = new ElementControl();
		mouseControl = new MouseControl(driver);
		dropdownControl = new DropdownControl();
		alertControl = new AlertControl(driver);
		screenShotControl = new ScreenshotControl(driver);
		dateutils = new DateUtils();
	}

}
