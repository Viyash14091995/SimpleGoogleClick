package com.simplegoogle.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.simplegoogle.baseclass.Baseclass;
import com.simplegoogle.pom.SearchPage;
import com.simplegoogle.runner.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends Baseclass {
	public static WebDriver driver= Baseclass.driver;
	public static SearchPage sp=new SearchPage(driver);

	@Given("User has to enter the Googel url")
	public static void user_has_to_enter_the_googel_url() {

	     //  Browserlaunch("chrome");
	      // geturl("https://www.google.com/");
		 //   implicitwait(30);
	       
		System.out.println("browser launched successfully");
	}

	@When("User navigates to Google homepage")
	public static void user_navigates_to_google_homepage() {
		System.out.println("user navigates to google homepage");
		// implicitwait(30);
	}

	@When("User has to enter valid input {string} in search option")
	public void user_has_to_enter_valid_input_in_search_option(String string) {
	     inputelements(sp.getInputText(), string);
	     implicitwait(30);
		//WebElement findElement = driver.findElement(By.xpath("//*[@name='q']"));
		//inputelements(findElement, string);
	}
		
	

	@Then("User Has to Click on search button.")
	public static void user_has_to_click_on_search_button() {
		Clicks(sp.getSearchClick());
		implicitwait(30);
		
		
		//WebElement element = driver.findElement(By.xpath("//*[@class='gNO89b']"));
		//element.click();
		//implicitwait(30);
	}

}
