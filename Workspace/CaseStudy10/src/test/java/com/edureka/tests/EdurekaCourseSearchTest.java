package com.edureka.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.edureka.pages.EdurekaCourseCheckout;
import com.edureka.pages.EdurekaCourseDetailsPage;
import com.edureka.pages.EdurekaHomePage;
import com.edureka.pages.EdurekaLoginDetailsPage;
import com.edureka.pages.EdurekaSearchCourseResultPage;

import utility.DataProviderFromExcel;
import utility.WaitUtils;

public class EdurekaCourseSearchTest extends BaseSetup {
	
	
	@Test(priority = 100,dataProvider="getData", dataProviderClass=DataProviderFromExcel.class)
	public void verifyUserLogin(String userMailID, String userPassword) throws Exception {
		
		test = extent.createTest("Verify Login to the Edureka Portal");
		
		String expectedUserName = "Sagar";
        
		pageToLogin.clickLoginButton();
        WaitUtils.waitForSeconds(2);
        
        
		loginDetails = new EdurekaLoginDetailsPage(driver);
		
        loginDetails.enterLoginDetails(userMailID, userPassword);
        WaitUtils.waitForSeconds(5);
        
        edurekaHomePage = new EdurekaHomePage(driver);
        String actualUsername = edurekaHomePage.loggedINUsername();
        
        
        test.log(Status.INFO, "Expected UserName is : "+ expectedUserName);
		test.log(Status.INFO, "Actual UserName is : "+ actualUsername);

		Assert.assertEquals(expectedUserName, actualUsername);
	}
	
	@Test(priority = 200)
	public void  searchCouseInEdureka() throws Exception {
		
		test = extent.createTest("Verify Course Search");
		
		String expectedResultText = String.format("Search results for %s",searchCourseType);
	    
		edurekaHomePage.searchCourse(searchCourseType);
		
		searchCoursePage= new EdurekaSearchCourseResultPage(driver);
		
		
		WaitUtils.waitForSeconds(5);
		
		String actualResultText = searchCoursePage.returnSearchText();
		
		test.log(Status.INFO, "Expected Course Search text is : "+ expectedResultText);
		test.log(Status.INFO, "Actual Course Search text is : "+ actualResultText);
		
		Assert.assertEquals(actualResultText, expectedResultText);
	    
	    
	}
	
	@Test(priority = 300)
	public void selectCourseAddToAndPayment() throws Exception {
		test = extent.createTest("Select the Course");
		
		searchCoursePage.selectCourse();
		WaitUtils.waitForSeconds(3);
		
		courseDetailspage = new EdurekaCourseDetailsPage(driver);
		
		String actaulTtitle = courseDetailspage.fetchTitle();
		String expectedTitle = "DevOps Training | DevOps Certification | DevOps Course | Edureka";
		
		test.log(Status.INFO, "Expected Title is : "+ expectedTitle);
		test.log(Status.INFO, "Actual Title is : "+ actaulTtitle);
		
		
		
		courseDetailspage.enrollCourse();
	
		
		
		WaitUtils.waitForSeconds(3);
		
		courseCheckout = new EdurekaCourseCheckout(driver);
		courseCheckout.proceedToPayment();
		WaitUtils.waitForSeconds(2);
		
		String actualText = paymentPage.PaymentProcess();
		String expectedText = "SELECT A PAYMENT METHOD";
		
		test.log(Status.INFO, "Expected Title is : "+ expectedText);
		test.log(Status.INFO, "Actual Title is : "+ actualText);
		
		Assert.assertEquals(actualText, expectedText);
		
	}

}
