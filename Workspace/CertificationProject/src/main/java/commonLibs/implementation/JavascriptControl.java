package commonLibs.implementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import commonLibs.contracts.IJavascript;

public class JavascriptControl implements IJavascript {

	private JavascriptExecutor jsEngine;

	public JavascriptControl(WebDriver driver) {

		jsEngine = (JavascriptExecutor) driver;
	}

	
	public void executeJavaScript(String scriptToExecute) throws Exception {

		jsEngine.executeScript(scriptToExecute);

	}

	
	public void scrollDown(int x, int y) throws Exception {

		String jsCommand = String.format("window.scrollBy(%d,%d)", x, y);

		jsEngine.executeScript(jsCommand);

	}

	
	public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {

		return jsEngine.executeScript(scriptToExecute).toString();
	}

}
