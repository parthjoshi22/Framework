package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	//1.Create object of webdriver
		WebDriver ldriver; 
		
		//Below we create constructor
		public void myAccount(WebDriver rdriver)  
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this); 	
		}
		
	   // Identify web element
		@FindBy(id = "email_create")
		WebElement createEmailId; 
		
		@FindBy(id = "SubmitCreate")
		WebElement SubmitCreate;
		
		//Identify action on webelement
		public void enterCreateEmailAddress(String emailAdd) {
			createEmailId.sendKeys(emailAdd);
		}
		public void clickSubmit() {
			SubmitCreate.click();
		}
}
