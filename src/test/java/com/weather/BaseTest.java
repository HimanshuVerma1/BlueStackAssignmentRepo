package com.weather;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
 
	public WebDriver driver;

	@BeforeClass
	public void baseSetup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/himanshu.verma/Documents/BlueStack/BlueStackAssignment/ChromeBrowser/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://weather.com/");
		Thread.sleep(20000);
	}
	
//	@AfterClass
//	public void quitDriver() {
//		driver.quit();
//	}

}
