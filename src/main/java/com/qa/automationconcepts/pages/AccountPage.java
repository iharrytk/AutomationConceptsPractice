package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	
	private WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By logout=By.xpath("//aside[@id='column-right']//a[text()='Logout']");
	
	public void doLogout() {
		driver.findElement(logout).click();
	}
	

}
