package com.qa.automationconcepts.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossParallelBrowserTestingAttempt1 {
	@Parameters("browser")
	@Test
	public  void crossparallel(String browservalue) {
		String browser=browservalue;
		WebDriver driver=null;
		//Cross Browser testing logic -Advantage of Top Casting
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launching Chrome Browser");
			driver=new ChromeDriver();
			break;
		case "edge":
			System.out.println("Launching Edge Browser");
			driver=new EdgeDriver();
			break;
		case "firefox":
			System.out.println("Launching firefox Browser");
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter a valid browser ");
			break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//driver.quit();
	}

}
