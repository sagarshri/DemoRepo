package practiceprograms;

import java.net.URL;

//1. Starting a Hub: java - jar selenium-server-standalone-2.53.1.jar - role hub
//   Validate - http://localhost:4444

//2. Configuring a Node: java - jar selenium-server-standalone-2.53.1.jar - role node -hub http://10.53.198.56:4444/grid/register
//   Validate - http://localhost:4444/grid/console

//   DesiredCapabilities is used to set the browser 
//   RemoteWebDriver is used to set on which node test case will be executed.

public class SeleniumGridExample {

	 public static void main(String[] args) {
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 URl url = new URL("http://192.168.0.3:4444/wd/hub")
	     WebDriver Driver = new RemoteWebDriver(url, capabilities);
		 Driver.manage().window().maximize();
		 Driver.manage().deleteAllCookies();
		 Driver.get("http://qatechhub.com");
			
		 
	}
}
