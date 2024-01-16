package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {

	//1.Create object of webdriver
	WebDriver ldriver; // l stands for local driver & ldriver os object of webdriver
	
	/*public Indexpage(WebDriver rdriver)  // r stands for remote driver
	{
		ldriver = rdriver; // We initialize ldriver with rdriver
		PageFactory.initElements(rdriver, this); // Here rdriver used for searching web element & this for object of page	
	} */
	
	//Below we create constructor
   public Indexpage(WebDriver driver) {
	   ldriver = ldriver;
	   PageFactory.initElements(ldriver, this); 
	}

	// Identify web element
	@FindBy(linkText = "Sign in")
	WebElement signIn; // Webelement will store in this signIn
	
	//Identify action on webelement
	public void clickOnsignIn() {
		signIn.click();
	}
	
}
