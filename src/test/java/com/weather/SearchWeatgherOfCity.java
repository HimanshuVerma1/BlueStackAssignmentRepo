package com.weather;

import org.testng.annotations.Test;

public class SearchWeatgherOfCity extends BaseTest {
	
	
	private SearchWeatherOfCityPage searchWeather;

	@Test
	public void searchCity() throws InterruptedException {
		init();
		searchWeather.searchCity("Delhi");
		System.out.println(searchWeather.getTemperature());
	}
	
	public void init() {
		searchWeather = new SearchWeatherOfCityPage(driver);
	}

}
