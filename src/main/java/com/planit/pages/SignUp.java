package com.planit.pages;

import org.openqa.selenium.By;

import com.planit.configuration.Configuration;
import com.planit.core.PageObject;

public class SignUp extends PageObject{

	public SignUp() {
		super(conf);
		// TODO Auto-generated constructor stub
	}
	
	By inputFirstName = By.id("body_1_UserDetailsCtrl_firstname");
	By inputLastName = By.id("body_1_UserDetailsCtrl_lastname");
	By inputPostCode = By.id("body_1_UserDetailsCtrl_postcode");
	By inputEmail = By.id("body_1_UserDetailsCtrl_email");
	By inputPassword = By.id("body_1_PasswordCtrl_password");
	By inputConfirmPassword = By.id("body_1_PasswordCtrl_confirmpassword");
	By agreeCheckBox = By.id("body_1_tnc");
	By signUpButton = By.id("body_1_RegisterButton");
	
	public void register(){
		
		waitForLoad(driver);
		driver.findElement(inputFirstName).sendKeys(Configuration.firstName);
		driver.findElement(inputLastName).sendKeys(Configuration.lastName);
		driver.findElement(inputPostCode).sendKeys(Configuration.postCode);
		driver.findElement(inputEmail).sendKeys(Configuration.email);
		driver.findElement(inputPassword).sendKeys(Configuration.password);
		driver.findElement(inputConfirmPassword).sendKeys(Configuration.password);
		driver.findElement(agreeCheckBox).click();
		driver.findElement(signUpButton).click();
		
	}
//	
//public void register(String firstName, String lastName, String postCode, String password){
//		
//		waitForLoad(driver);
//		driver.findElement(inputFirstName).sendKeys(firstName);
//		driver.findElement(inputLastName).sendKeys(lastName);
//		driver.findElement(inputPostCode).sendKeys(postCode);
//		driver.findElement(inputEmail).sendKeys(Configuration.email);
//		driver.findElement(inputPassword).sendKeys(password);
//		driver.findElement(inputConfirmPassword).sendKeys(password);
//		driver.findElement(agreeCheckBox).click();
//		driver.findElement(signUpButton).click();
//		
//	}
	

}
