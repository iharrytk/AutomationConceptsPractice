package com.qa.automationconcepts.pages;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodOverloading {
	static WebDriver driver;
	//Method Overloading: all methods in the same class having same name
	//Can have different arguments,type of arguments,number of arguments,order of arguments
	//return type of the method does not matter
	//Purpose of having same name with different arguments is to keep similar business logic under same method name
	//For example search method-can be done with just product name,can be done with productname and color and size of product
	//Aesthetically also same business logic with similar method names look good when maintaining code..
	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
//Example 1: Selenium framework driver.switchTo().frame() 
//frame is method that we have in RemoteWebDriver class.
//frame method has been overloading with parameters frameindex,framenameorId and frameWebElement		
		/*
		driver.switchTo().frame(//enter frameindex);
		driver.switchTo().frame(//enter frame nameorID);
		driver.switchTo().frame(//enter frame WebElement);
		*/
		
				
				
//Example 2: Selenium framework Actions class
//method moveToElement() has been overloaded with arguments like WebElement target,WebElement target,int xoffset,intyoffset				
		/*
		Actions ac=new Actions(driver);
		ac.moveToElement(enter WebElement of target);
		ac.moveToElement(enter WebElement target, int xoffset, int yoffset);	
		
		*/
		launchURL("https://www.google.com/");
		
		

		
	}
	//Example 2:Organization Framework ElementUtil MethodOverloading
	public static void launchURL(String url) {
		driver.get(url);
		
	}
	
	public static void launchURL(URL url) {
		driver.navigate().to(url);
		
	}
	
	//Example 1:Organization Framework ElementUtil MethodOverloading
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static WebElement getElement(By locator,int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
