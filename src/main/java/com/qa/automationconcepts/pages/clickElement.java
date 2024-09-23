package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		By submitbutton=By.xpath("//button[text()='Submit']");
		By loginbutton=By.xpath("//button[text()='Login']");
		By registerbutton=By.xpath("//button[text()='Register']");
		By textarea=By.id("ta1");
		//click
		driver.findElement(submitbutton).click();
		System.out.println("Submit button has been clicked using normal click() method");

		Actions ac=new Actions(driver);
		ac.click(driver.findElement(loginbutton)).build().perform();
		System.out.println("Login button has been clicked using Actions class click() method");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(registerbutton));
		System.out.println("Register button has been clicked using JavascriptExecutor class click() method");
		
		//sendKeys
		driver.findElement(textarea).sendKeys("haritha");
		System.out.println("normal sendKeys");
		
		Actions ac1=new Actions(driver);
		ac1.sendKeys(driver.findElement(textarea), "haritha").build().perform();
		System.out.println("Actions class sendKeys");
		
		//note: for sendKeys to work,the element should have id attribute 
		//so that we can use document.getElementById
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('ta1').value='haritha'", driver.findElement(textarea));
		
		driver.quit();
	}

}
