package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledConcept {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		By radiobuttonMale=By.xpath("//button[@id='but2']");
		WebElement malebutton=driver.findElement(radiobuttonMale);
		
		if(malebutton.isEnabled()) {
			malebutton.click();
			System.out.println("button has been clicked");
		}
		else {
			System.out.println("button is not enalbled");
		}
		
		driver.quit();
		

	}

}
