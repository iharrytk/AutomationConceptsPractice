package com.qa.automationconcepts.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallelTesting {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void doCrossBrowserParallelTest(String browservalue) {
		String browser = browservalue;
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launching Chrome....");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Launching Edge....");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("Launching firefox....");
			break;
		default:
			System.out.println("Please enter the correct browser value.You have entered..:" + browser);
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
		//driver.quit();

	}

}
