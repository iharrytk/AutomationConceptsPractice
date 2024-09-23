package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptIsDisabled {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		By disabledbutton=By.xpath("//button[@id='but1']");
		WebElement button=driver.findElement(disabledbutton);
		button.click();
//		if(button.isEnabled()) {
//			button.click();
//		}
//		else {
//			System.out.println("Button is disabled");
//		}
		WebElement textbox=driver.findElement(By.xpath("//input[@id='tb2']"));
		textbox.sendKeys("haritha");
		
		
//		if(textbox.isEnabled()) {
//			textbox.sendKeys("Haritha");
//		}
//		else {
//			System.out.println("textbox is disabled");
//		}
		//driver.quit();
	}

}
