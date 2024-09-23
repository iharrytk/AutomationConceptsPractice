package com.qa.automationconcepts.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		By linkedinLink=By.xpath("//a[contains(@href,'linkedin')]");
		driver.findElement(linkedinLink).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		
		driver.switchTo().window(childWindow);
		System.out.println("The child window url is:"+driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("The parent window url is:" +driver.getCurrentUrl());
		
		
		
		
		
		
		
		

	}

}
