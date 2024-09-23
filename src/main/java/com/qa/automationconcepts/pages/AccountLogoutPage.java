package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogoutPage {
private WebDriver driver;
	
	public AccountLogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By login=By.xpath("//aside[@id='column-right']//a[text()='Login']");
	
	public void doLogin() {
		driver.findElement(login).click();
	}

}
