package com.qa.automationconcepts.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConstructorOverloading {

	public static void main(String[] args) {

//Constructor Overloading:  ChromeDriver object creation without any parameters		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//Constructor Overloading:  ChromeDriver object creation with parameters			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver1 = new ChromeDriver(options);
		driver1.get("https://www.google.com/");
		
		
//Constructor Overloading: WebDriverWait with Duration timeout as parameter		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.titleIs("Google"));
		
//Constructor Overloading: WebDriverWait with Duration timeout and duration sleep as parameter			
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//textarea[@name='q']"))));

	}

}
