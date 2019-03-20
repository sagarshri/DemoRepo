package listenerpackage;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

// Listener is defined as interface that modifies the default TestNG's behavior. 
// Listeners "listen" to the event defined in the selenium script and behave accordingly. 
// It is used in selenium by implementing Listeners Interface. It allows customizing TestNG reports or logs. 
// eg : IReporter,ISuiteListener, ITestListener etc

// Steps to create a TestNG Listener
// 1. Create class "ListenerTest" that implements any listener, and implement the methods
// 2. Create a test class
// 3. Add the listener in a project, using either of the two ways:
//      -- Add @Listeners(<package-name>.<class-name in step1>.class) OR
//      -- update testng.xml (between siute and test tag), if wanted to use for more than one class
//         <listeners>
//             <listener class-name="package.class"></listener>
//         </listeners>
 

public class ListenerDemo implements ITestListener, IReporter{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "test is success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " test is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		//Iterating over each suite included in the test
	      for (ISuite suite : suites) {
	            
	         //Following code gets the suite name
	         String suiteName = suite.getName();
	            
	         //Getting the results for the said suite
	         Map<String, ISuiteResult> suiteResults = suite.getResults();
	         for (ISuiteResult sr : suiteResults.values()) {
	            ITestContext tc = sr.getTestContext();
	            System.out.println("Passed tests for suite '" + suiteName +
	               "' is:" + tc.getPassedTests().getAllResults().size());
	            System.out.println("Failed tests for suite '" + suiteName +
	               "' is:" + tc.getFailedTests().getAllResults().size());
	            System.out.println("Skipped tests for suite '" + suiteName +
	               "' is:" + tc.getSkippedTests().getAllResults().size());
	         }
	      }
		
	}
	

}
