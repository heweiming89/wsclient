package cn.com.webxml;

import java.util.List;

import org.junit.Test;

import cn.com.webxml.GetRegionDatasetResponse.GetRegionDatasetResult;
import cn.com.webxml.GetSupportCityDatasetResponse.GetSupportCityDatasetResult;

public class WeatherWSTest {

	@Test
	public void testCountry() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		ArrayOfString regionCountry = wsSoap.getRegionCountry();
		List<String> list = regionCountry.getString();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());
	}

	// 311102
	@Test
	public void testProvince() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		ArrayOfString regionProvince = wsSoap.getRegionProvince();
		List<String> list = regionProvince.getString();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());
	}

	@Test
	public void testDataset() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		GetRegionDatasetResult regionDataset = wsSoap.getRegionDataset();
		regionDataset.setAny("311102");
		Object any = regionDataset.getAny();
		System.out.println(any);
	}
	
	@Test
	public void testCityString() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		ArrayOfString cityString = wsSoap.getSupportCityString("311102");
		List<String> strs = cityString.getString();
		for (String string : strs) {
			System.out.println(string);
		}
		System.out.println(strs.size());
	}
	
	@Test
	public void testWeather() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		String theCityCode = "2061";
		String theUserID = "";
		ArrayOfString weather = wsSoap.getWeather(theCityCode, theUserID);
		List<String> strs = weather.getString();
		for (String string : strs) {
			System.out.println(string);
		}
		System.out.println(strs.size());
	}

	@Test
	public void testCityDataset() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		GetSupportCityDatasetResult cityDataset = wsSoap.getSupportCityDataset("311102");
		Object any = cityDataset.getAny();
		System.out.println(any);
	}

	@Test
	public void test() {
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap wsSoap = ws.getWeatherWSSoap();
		String theRegionCode = null;
		wsSoap.getSupportCityDataset(theRegionCode);
		wsSoap.getSupportCityString(theRegionCode);
		String theCityCode = "";
		String theUserID = "";
		wsSoap.getWeather(theCityCode, theUserID);
	}

}
