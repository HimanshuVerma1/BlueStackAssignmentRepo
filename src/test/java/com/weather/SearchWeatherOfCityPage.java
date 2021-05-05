package com.weather;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.CommonUtilities;

public class SearchWeatherOfCityPage {
	
	public CommonUtilities commonUtilies;

	@FindBy(xpath = "//input[@placeholder=\"Search City or Postcode\"]")
	private WebElement searchTextBox;

	@FindBy(xpath = "//span[starts-with(@class, 'CurrentConditions--tempValue--')]")
	private WebElement tempText;
	
	@FindBy(xpath = "//label[text()=\"Search City or Postcode\"]")
	private WebElement searchCityOrPostalCodeLabel;

	
	public SearchWeatherOfCityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		commonUtilies = new CommonUtilities(driver);
	}
	
	public void searchCity(String cityName) throws InterruptedException {
		commonUtilies.clickOnElement(searchTextBox, 30);
		commonUtilies.sendKeys(searchTextBox, 10, cityName);
		Thread.sleep(10000); //wait time for 
		WebElement city = commonUtilies.driver.findElement(By.xpath(String.format("//button[text()=\"%s\"]", cityName)));
		commonUtilies.clickOnElement(city, 20);
		commonUtilies.isElementVisibleInTime(20, tempText);
	}
	
	public String getTemperature() {
		return tempText.getText();
	}
	
}
