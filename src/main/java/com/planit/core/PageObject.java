package com.planit.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.planit.configuration.Configuration;

public class PageObject extends BaseSetup {
	protected WebDriver driver;
    JavascriptExecutor jsExecutor;

    public PageObject(Configuration conf){

        this.driver = webDriver;
        jsExecutor = (JavascriptExecutor)driver;
        driver.manage().window().maximize();

    }

    public void waitForLoad(WebDriver driver){
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");}
        };
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(pageLoadCondition); }

}
