package com.qa.automationconcepts.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesListConcept {

	public static void main(String[] args) {
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
		List<String> windowlist=new ArrayList<String>(windows);
		for(int i=0;i<windowlist.size();i++) {
			String window=windowlist.get(i);
			driver.switchTo().window(window);
			System.out.println("The window url is:"+driver.getCurrentUrl());
			if(!window.equals(parentwindow)) {
				driver.close();
			}
			
			
		}
		driver.switchTo().window(parentwindow);
		System.out.println("The driver is now in the parent window:"+driver.getCurrentUrl());
		
		

	}

}
