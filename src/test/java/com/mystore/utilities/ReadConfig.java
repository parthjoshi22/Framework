package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties properties; // we create properties class object
	String path ="C:\\Users\\hp\\eclipse-workspace\\Framework\\Confriguration\\config.properties";
	
	// Constructor
	public ReadConfig() 

	{
		try {
		properties = new Properties(); // object initialize
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis); // This statement added
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	// We need to create two method to read values of keys bcoz we have two variable i.e. 2 key in config.properties file
	public String getBaseUrl() 
	{
		String value = properties.getProperty("BaseUrl");
		
		if(value != null)
			return value;
		else
			throw new RuntimeException(" Url no present in config file");
    }
	
	public String getBrowser() 
	{
		String value = properties.getProperty("Browser");
		
		if(value != null)
			return value;
		else
			throw new RuntimeException(" Url no present in config file");
    }
}