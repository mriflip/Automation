package com.planit.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.planit.configuration.Configuration;
import com.planit.core.PageObject;

public class SearchResultPage extends PageObject{

	public SearchResultPage() {
		super(conf);
		// TODO Auto-generated constructor stub
	}
	
	By searchHeader = By.xpath("//h1[contains(.,'Results for Cabinet')]");
	
	public void checkNavigationToSearchResultPage(){
		waitForLoad(driver);
		Assert.assertTrue(driver.findElement(searchHeader).isDisplayed());
		
	}
	

}
