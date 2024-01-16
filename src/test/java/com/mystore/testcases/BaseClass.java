package com.mystore.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import com.mystore.utilities.ReadConfig;

// We creating object of ReadConfig class to read config.properties
public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	
	// We need to read 2 keys & store into base class. so we creating string variable
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBaseUrl();
	
	//We creating web driver object
	public static WebDriver driver;
	
	// we need to create Logger class varible
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case "firefox":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Study\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "msedge":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Study\\Edge\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			driver = null;
			break;
		}
		// Implicit wait of 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// For Logging
		// So here we initialize logger in setup method
		logger = LogManager.getLogger("Framework");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
