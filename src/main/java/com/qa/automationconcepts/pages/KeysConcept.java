package com.qa.automationconcepts.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysConcept {

	public static void main(String[] args) {
		
		
		//Actions class has mouse and Key board events
		//scenario: suppose we want to enter the username as "haritha" -the same thing we want to paste 
		//in password field as well
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		By username=By.xpath("(//form/input[@type='text'])[1]");
		By password=By.xpath("(//form/input[@type='password'])[1]");
		
		//entering the username normally
		driver.findElement(username).sendKeys("haritha");
		
		//using Actions class to copy the the same username into password field
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
						
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
								

		ac.moveToElement(driver.findElement(password)).keyDown(Keys.CONTROL)
											.sendKeys("v")
												.keyUp(Keys.CONTROL)
												.perform();
								
			
		
		
		
		
			
		
	

	}

}
