package com.game.tv;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.CommonUtilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GameTvTwitterLoginPage {
	
	CommonUtilities commonUtils;
	
	@AndroidFindBy(accessibility = "AuthoriseWithTwitter_593")
	private MobileElement twitterButton;
	
	@AndroidFindBy(accessibility = "google_login Continue with Google")
	private MobileElement googleButton;
	
	@AndroidFindBy(accessibility = "phone-login phone_login_button")
	private MobileElement phoneLoginButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"username_or_email\")")
	private MobileElement usernameTextBox;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"password\")")
	private MobileElement passwordTextBox;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Authorize app\")")
	private MobileElement AuthorizeAppButton;
	
	public GameTvTwitterLoginPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		commonUtils = new CommonUtilities(driver);
	}
	
	public void clickOnTwitterIcon() {
		commonUtils.clickOnElement(twitterButton, 30);
	}
	
	public void loginUsingTwitter(String userName, String password) {
		commonUtils.sendKeys(usernameTextBox, 30, userName);
		commonUtils.sendKeys(passwordTextBox, 30, password);
		commonUtils.clickOnElement(AuthorizeAppButton, 10);
	}
	
	public boolean isAppLaunch() {
		return commonUtils.isElementVisibleInTime(10, twitterButton) && commonUtils.isElementVisibleInTime(10, googleButton)
				&& commonUtils.isElementVisibleInTime(10, phoneLoginButton);
	}
	
	public boolean isTwitterButtonVisible() {
		return commonUtils.isElementVisibleInTime(30, twitterButton);
	}
	
	public boolean isTwitterButtonClickable() {
		commonUtils.clickOnElement(twitterButton, 30);
		return commonUtils.isElementVisibleInTime(30, usernameTextBox);
	}
	
	
	
}
