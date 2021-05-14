package com.game.tv;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseTestAndroid {

	public AppiumDriver<MobileElement> driver;
	private AppiumServiceBuilder builder;
	private AppiumDriverLocalService service;

	@BeforeClass
	public void setupAndroid() throws MalformedURLException {

//		builder = new AppiumServiceBuilder();
//		builder.usingAnyFreePort();
//		builder.withIPAddress("127.0.0.1");
//		builder.withArgument(GeneralServerFlag.LOG_TIMESTAMP).withArgument(GeneralServerFlag.LOCAL_TIMEZONE);
//		service = AppiumDriverLocalService.buildService(builder);
//		service.start();

		DesiredCapabilities desireCap = new DesiredCapabilities()
		desireCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "tv.game");
		desireCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "tv.game.MainActivity");
		desireCap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
		desireCap.setCapability(MobileCapabilityType.UDID, "ZF6226R4M4");
		desireCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		desireCap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desireCap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desireCap);

	}

}
