package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.myAccount;

public class TC_MyAccountPageTest extends BaseClass {

	@Test
	public void VerifyRegistrationAndLogin()
	{
		// Open Url
		driver.get(url); // String url = readConfig.getBaseUrl();
		logger.info(" url opened "); // Information will log on runtime & so we create logger object
		
		// We creating object of Index Page bcoz we create sign in method into IndexPage.java
		Indexpage pg = new Indexpage(null); // We pass webdrivers object i.e.driver
		pg.clickOnsignIn();
		
		myAccount myAcpg = new myAccount();
		myAcpg.enterCreateEmailAddress("zxcv@gmail.com");
		myAcpg.clickSubmit();
		
		
	}
}
