
package com.planit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.planit.dataproviders.SignUpDataProvider;
import com.planit.pages.HomePage;
import com.planit.pages.KitchenCabinetPage;
import com.planit.pages.SearchResultPage;
import com.planit.pages.SignUp;

/**
 * Unit test for simple App.
 */

public class UITest extends SignUpDataProvider{
	
	HomePage homePage = new HomePage();
	KitchenCabinetPage kitchenCabinetPage = new KitchenCabinetPage();
	SignUp signUpPage = new SignUp();
	SearchResultPage searchResultPage = new SearchResultPage();
	
//	@DataProvider(name = "signUpDataProvider")
//	public static Object[][] signUpDP()
//    {
//        return new Object[][]
//        {
//            {"Jane","Austin","2077","JaneAustin1"},
//            {"Peter","Dinklage","2000","PeterDinklage1"}
//
//        };
//
//}
	
	
	//(dataProvider ="signUpDataProvider",alwaysRun = true)
	@Test
	public void bunningsTest() throws InterruptedException{

		homePage.loadHomePage();
		//kitchenCabinetPage=homePage.selectKitchenCabinet();
		//kitchenCabinetPage.checkNavigationToKitchenCabinetPage();
		//homePage.findaStore();
		//signUpPage = homePage.signUp();
		//signUpPage.register(firstName,lastName,postCode,password);
		//System.out.println(firstName + lastName);
		//searchResultPage = homePage.search();
		//searchResultPage.checkNavigationToSearchResultPage();
		//homePage.checkMenuHeaders();
		homePage.clickOnPhoneNumber();
		
		
		
	}
    
}
