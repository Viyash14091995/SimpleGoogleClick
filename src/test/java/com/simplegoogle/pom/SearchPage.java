package com.simplegoogle.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@name='q']")
	public WebElement InputText;

	@FindBy(xpath = "//*[@class='gNO89b']")
	public WebElement SearchClick;

	public SearchPage(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputText() {
		return InputText;
	}

	public WebElement getSearchClick() {
		return SearchClick;
	}

}
