package com.planit.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.planit.core.PageObject;

import junit.framework.Assert;

public class HomePage extends PageObject{

	public HomePage() {
		super(conf);
		
	}
	
	//By kitchenMenu = By.xpath("//a[@href='/our-range/kitchen']");
	By kitchenCabinetMenu = By.xpath("//a[@href='/our-range/kitchen/cabinets-accessories/cabinets']");
	By changeStoreMenu = By.xpath("//a[contains(.,'Change Store')]");
	By postCodeInput = By.id("storeSearchInput");
	By waitaraOption = By.xpath("//a[contains(.,'WAITARA, NSW, 2077')]");
	By signUpButton = By.id("signupLink");
	String postCode = "2077";
	By inputSearch = By.id("SearchText");
	String searchText = "Cabinet";
	By entireSiteButton = By.xpath("//span[text()='Entire site']");
	By kitchenMenu = By.xpath("//a[text()='Kitchen']");
	By searchButton = By.id("SearchButton");
	By menuHeaders = By.xpath("//nav[@class='menu menu_header']/ul/li");
	By phoneNumberLink = By.xpath("//a[contains(@href,'tel')]");
	String[] headerList = {"Services","Trade","Our Stores", "Jobs","About Us","Contact Us"};
	
	
	//Wait for the Home page to load
	public void loadHomePage(){
		driver.get(conf.getConfig("baseUrl"));
		waitForLoad(driver);
	}
	
	//Load the kitchenCabinet sub-menu option
	public KitchenCabinetPage selectKitchenCabinet(){
		
		WebElement element = driver.findElement(By.linkText("Kitchen"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(kitchenCabinetMenu).click();
		return new KitchenCabinetPage();
	}
	
	//Find a store
	public void findaStore(){
		
		driver.findElement(changeStoreMenu).click();
		driver.findElement(postCodeInput).sendKeys(postCode);
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(waitaraOption)).click();
		
	}
	
	//SignUp
	public SignUp signUp(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signUpButton)).click();
		return new SignUp();
		
	}
	
	//search
	public SearchResultPage search(){
		driver.findElement(inputSearch).sendKeys(searchText);
		driver.findElement(entireSiteButton).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(kitchenMenu)).click();
		driver.findElement(searchButton).click();
		return new SearchResultPage();	
	}
	
	//check menu headers
	public void checkMenuHeaders(){
		
		List<WebElement> li= driver.findElements(menuHeaders);
		System.out.println(li.size());
		int i =0;
		for(WebElement ele: li){
		org.testng.Assert.assertEquals(headerList[i],ele.getText());
		i++;
			
		}
		
	}
	
	//click on the phone number
	public void clickOnPhoneNumber() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberLink)).click();
		Thread.sleep(4000);
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		driver.close();
		
	}
	
	
	

}
