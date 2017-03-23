package com.planit.configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverConfig {
	
	public static DesiredCapabilities getChromeConfig(Configuration conf){

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setJavascriptEnabled(true);
        System.setProperty("webdriver.chrome.driver",conf.getConfig("chromeDriverPath"));
        return desiredCapabilities;
        
    }

}
