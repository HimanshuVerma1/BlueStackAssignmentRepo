package com.game.tv;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TwitterLogin extends BaseTestAndroid {

	private GameTvTwitterLoginPage gameTvTwitterPage;

	@Test
	public void verifyAppLaunched() {
		init();
		Assert.assertTrue(gameTvTwitterPage.isAppLaunch(), "Game Tv app is not launched");
	}
	
	@Test
	public void verifyTwitterButton() {
		init();
		Assert.assertTrue(gameTvTwitterPage.isTwitterButtonVisible(), "Twitter button not visible on Home Page");
		Assert.assertTrue(gameTvTwitterPage.isTwitterButtonClickable(), "Twitter button not clickable on Home Page");
	}
	
	@Test
	public void loginUsingTwitter() {
		init();
		driver.launchApp();
		gameTvTwitterPage.clickOnTwitterIcon();
		gameTvTwitterPage.loginUsingTwitter("tes1.auto1@gmail.com", "game@twitter");
	}

	private void init() {
		gameTvTwitterPage = new GameTvTwitterLoginPage(driver);
	}
}
