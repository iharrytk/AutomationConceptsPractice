package com.qa.automationconcepts.dataproviders;


import org.testng.annotations.DataProvider;

import com.qa.automationconcepts.pojos.LoginPOJO;

public class LoginPageDataProviders {

	//method that return Object[][]
	
	@DataProvider(name="loginPageDataProvider")
	public Object[][] loginDataProvider(){
		
		return new Object[][] {
			{new LoginPOJO("haritha@gmail.com","haritha@2024")},
			{new LoginPOJO("jaya@gmail.com","jaya@2024")}
			
		};
	}
}
