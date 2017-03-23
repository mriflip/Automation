package com.planit.core;

import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planit.configuration.Configuration;
import com.planit.configuration.WebDriverConfig;

public class WebDriverManager {
	
	    public enum Browser {
	        CHROME, FIREFOX
	    }

	    public static WebDriver getWebDriverConfig(Configuration conf) {


	        WebDriver webDriver = null;
	        Browser browser = Browser.valueOf(conf.getConfig("browser").toUpperCase(Locale.ENGLISH));
	        switch (browser) {
	            case CHROME: {
	                webDriver = new ChromeDriver(WebDriverConfig.getChromeConfig(conf));
	                break;
	            }
	            case FIREFOX: {
	            }
	            default:
	                return null;
	        }
	        return webDriver;
	    }

}
