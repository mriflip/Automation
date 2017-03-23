package com.planit.core;

import org.openqa.selenium.WebDriver;

import com.planit.configuration.Configuration;

public class BaseSetup {
	
	protected static Configuration conf;
	protected static WebDriver webDriver;
	
	static{
		conf = new Configuration();
		webDriver = WebDriverManager.getWebDriverConfig(conf);
	}
	
}
