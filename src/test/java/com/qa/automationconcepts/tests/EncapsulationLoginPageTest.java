package com.qa.automationconcepts.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.automationconcepts.dataproviders.LoginPageDataProviders;
import com.qa.automationconcepts.pages.AccountLogoutPage;
import com.qa.automationconcepts.pages.AccountPage;
import com.qa.automationconcepts.pages.EncapsulationLoginPage;
import com.qa.automationconcepts.pojos.LoginPOJO;

public class EncapsulationLoginPageTest {
	
	//BeforeTest
	//After test
	//Test-check login functionality with test data from data providers
	
	
	WebDriver driver;
	EncapsulationLoginPage lp;
	AccountPage ap;
	AccountLogoutPage alp;
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		lp=new EncapsulationLoginPage(driver);
		ap=new AccountPage(driver);
		alp=new AccountLogoutPage(driver);
	}
	
	@Test(priority = 1)
	public void titleTest() {
		
		String actualtitle=lp.getTitle();
		Assert.assertEquals(actualtitle, "Account Login");
		
		
	}
	
	
	@Test(priority = 2,dataProvider = "loginPageDataProvider",dataProviderClass = LoginPageDataProviders.class)
	public void doLoginTest(LoginPOJO pojo) {
		lp.doLogin(pojo.getUsername(), pojo.getPassword());
		System.out.println("We are able to Login using the given credentials"+lp.toString());
		ap.doLogout();
		alp.doLogin();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	

}
