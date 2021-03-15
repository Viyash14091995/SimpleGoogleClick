package com.simplegoogle.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver Browserlaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SimpleGoogle\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SimpleGoogle\\Driver2\\gecko.exe");
				driver = new FirefoxDriver();
			}

			else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SimpleGoogle\\Driver2\\ie.exe");
				driver = new InternetExplorerDriver();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputelements(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitwait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Clicks(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
