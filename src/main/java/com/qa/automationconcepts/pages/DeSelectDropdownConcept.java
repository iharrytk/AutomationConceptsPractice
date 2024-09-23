package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectDropdownConcept {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		By singleselect=By.xpath("//select[@id='select-demo']");
		By multiselect=By.xpath("//select[@name='States']");
		Select sc=new Select(driver.findElement(singleselect));
		Boolean flag=sc.isMultiple();
		System.out.println("The ismultiple value of singleselect is:"+flag);
		sc.selectByValue("Wednesday");
		
		sc.deselectByValue("Wednesday");
		
		
		
		Select sc1=new Select(driver.findElement(multiselect));
		Boolean flagg=sc1.isMultiple();
		System.out.println("The ismultiple value of multiselect is:"+flagg);
		sc1.selectByValue("Florida");
		sc1.selectByValue("California");
		sc1.selectByValue("Washington");
		
		if(sc1.isMultiple()) {
			sc1.deselectAll();
		}
		else {
			System.out.println("Deselect works only if ismultiple is true");
		}
		
		
		
		

	}

}
