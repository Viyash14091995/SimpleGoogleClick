package com.simplegooglearning.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.simplegoogle.baseclass.Baseclass;

public class GoogleLogin extends Baseclass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Browserlaunch("chrome");
        geturl("https://www.google.com/");
        Thread.sleep(2000);
        
        WebElement element = driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]"));
        inputelements(element, "selenium");
	}

}
