package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EncapsulationLoginPage {
	
	//private By locators
	//private WebDriver
	//Page class constructor
	//Page actions
	private WebDriver driver;
	private By username=By.id("input-email");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//input[@type='submit' and @value='Login']");
	
	public EncapsulationLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String getTitle() {
		System.out.println("The title of the Login page is:"+driver.getTitle());
		return driver.getTitle();
	}
	
	
	public void doLogin(String usernamedata,String passworddata) {
		driver.findElement(username).sendKeys(usernamedata);
		driver.findElement(password).sendKeys(passworddata);
		driver.findElement(loginButton).click();
	}
	
	
	
	

}
