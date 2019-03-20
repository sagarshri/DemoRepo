package com.edureka.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utility.DataProviderFromExcel;

public class SearchandAddCourse extends BaseSetup{
	@Test(priority = 0)
	public void verifyTitleOfHomepage() throws Exception {
		
		test = extent.createTest("Verify Title of the page");
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = cmnDriver.getTitle();

		test.log(Status.INFO, "Expected Title is : "+ expectedTitle);
		test.log(Status.INFO, "Actual Title is : "+ actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	
	@Test(priority = 100,dataProvider="getData", dataProviderClass=DataProviderFromExcel.class)
	public void verifyUserLogin(String userEmailId, String userPassword) throws Exception {

		test = extent.createTest("Verify Login to the Edureka Portal");
		
		homepage.userLogin(userEmailId, userPassword);

		String expectedUserName = "Sagar";

		String actualUserName = homepage.getUserName();
		
		test.log(Status.INFO, "Expected UserName is : "+ expectedUserName);
		test.log(Status.INFO, "Actual UserName is : "+ actualUserName);

		Assert.assertEquals(expectedUserName, actualUserName);

	}
	
	 @Test(priority=300)
	 public void searchAndAddCourse() throws Exception {
		test = extent.createTest("Search and Edit the course");
		String expectedText = "Favourite Courses";
		
		String actualText = homepage.searchAndADDCourse(searchCourse);
		
		test.log(Status.INFO, "Expected Text is : "+ expectedText);
		test.log(Status.INFO, "Actual Text is : "+ actualText);

		Assert.assertEquals(expectedText, actualText);

	}
	
	@Test(priority=400)
	public void userLogout() throws Exception{
		
		test = extent.createTest("Verifying user logout");
		
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		
		homepage.userLogout();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		test.log(Status.INFO, "Expected Title is : "+ expectedTitle);
		test.log(Status.INFO, "Actual Title is : "+ actualTitle);

		Assert.assertEquals(expectedTitle, actualTitle);
	}
  
}
