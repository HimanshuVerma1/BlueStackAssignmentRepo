package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonUtilities {
	
	public WebDriver driver;
	
	public CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	public boolean isElementVisibleInTime(int timeout, WebElement locator) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
			return true;
		} catch (Exception e) {
			System.out.println("Element not visible");
			return false;
		}
	}

	public void clickOnElement(WebElement locator, int timeoutToClick) {
		if(isElementVisibleInTime(timeoutToClick, locator)){
			locator.click();
		}
	}
	
	public void sendKeys(WebElement locator, int timeoutToClick, String keysToSend) {
		if(isElementVisibleInTime(timeoutToClick, locator)){
			locator.clear();
			locator.sendKeys(keysToSend);
		}
	}
	
	public void clickUsingJavaScript(WebElement element, int timeout) {
		if(isElementVisibleInTime(timeout, element)) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}
	
}
