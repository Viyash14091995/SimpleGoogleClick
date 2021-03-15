package com.simplegoogle.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.simplegoogle.baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\SimpleGoogle\\src\\test\\java\\com\\simplegooglearning", glue = "com\\simplegoogle\\stepdefinition", plugin = {
		"pretty", "html:Report",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output"},
         monochrome = true, dryRun = false,strict=true)

public class Runner {
	public static WebDriver driver=Baseclass.driver;

	@BeforeClass
	public static void SetUp() {
		//WebDriver driver;
		Baseclass.Browserlaunch("chrome");
		Baseclass.geturl("https://www.google.com/");
		Baseclass.implicitwait(30);
	}

	@AfterClass
	public static void teardown() {

		Baseclass.driver.close();

	}
}