package com.planit.dataproviders;

import org.testng.annotations.DataProvider;

public class SignUpDataProvider {
	
	@DataProvider(name = "signUpDataProvider")
    public static Object[][] signUpDP()
    {
        return new Object[][]
        {
            {"Jane","Austin","2077","JaneAustin1"},
            {"Peter","Dinklage","2000","PeterDinklage1"}

        };

}
}

