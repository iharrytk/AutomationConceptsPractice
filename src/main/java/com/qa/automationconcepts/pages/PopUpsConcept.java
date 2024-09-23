package com.qa.automationconcepts.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsConcept {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By jsalertpopup=By.xpath("//button[text()='Click for JS Alert']");
		By jsconfirmpopup=By.xpath("//button[text()='Click for JS Confirm']");
		By jspromptpopup=By.xpath("//button[text()='Click for JS Prompt']");
		
		driver.findElement(jsalertpopup).click();
		Alert al=driver.switchTo().alert();
		System.out.println("The js alert text is:"+al.getText());
		al.accept();
		
		driver.findElement(jsconfirmpopup).click();
		Alert al1=driver.switchTo().alert();
		System.out.println("The js alert text is:"+al1.getText());
		al.dismiss();
		
		driver.findElement(jspromptpopup).click();
		Alert al2=driver.switchTo().alert();
		System.out.println("The js alert text is:"+al2.getText());
		al2.sendKeys("haritha");
		al2.accept();
		
		
		
		
		
		
		

	}

}
