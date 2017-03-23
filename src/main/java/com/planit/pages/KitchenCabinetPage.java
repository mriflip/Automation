package com.planit.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.planit.configuration.Configuration;
import com.planit.core.PageObject;

public class KitchenCabinetPage extends PageObject {

	public KitchenCabinetPage() {
		super(conf);
		// TODO Auto-generated constructor stub
	}
	
	By kitchenCabinetHeader = By.xpath("//h1/div[contains(.,'Kitchen Cabinets')]");
	
	public void checkNavigationToKitchenCabinetPage() throws InterruptedException{
		waitForLoad(driver);
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(kitchenCabinetHeader).isDisplayed());
	}
	

}
