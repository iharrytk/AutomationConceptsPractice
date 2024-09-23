package com.qa.automationconcepts.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAdvConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String parentwindow=driver.getWindowHandle();
		By linkedinLink = By.xpath("//a[contains(@href,'linkedin')]");
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		By facebookLink = By.xpath("//a[contains(@href,'facebook')]");
		By youtubeLink = By.xpath("//a[contains(@href,'youtube')]");
		driver.findElement(linkedinLink).click();
		driver.findElement(twitterLink).click();
		driver.findElement(facebookLink).click();
		driver.findElement(youtubeLink).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			String window=it.next();
			driver.switchTo().window(window);
			System.out.println("The window url is:"+driver.getCurrentUrl());
			if(!(window.equals(parentwindow)))
			{
			driver.close();
			}
			
		}
	driver.switchTo().window(parentwindow);
	System.out.println("The only open window is parent window:"+driver.getCurrentUrl());



		

	}

}
