package com.qa.automationconcepts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fcustomer-preferences%2Fedit%2F%3F_encoding%3DUTF8%26ie%3DUTF8%26preferencesReturnUrl%3D%252Fgp%252Fcart%252Fview.html%253Fref_%253Dnav_cart%26ref_%3Dnav_em_hd_re_signin&prevRID=R4T38538NNQMM798H2JC&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(6000);
		
		By name=By.xpath("//input[@id='ap_customer_name']");
		By email=By.xpath("//input[@id='ap_email']");
		By password=By.xpath("//input[@id='ap_password']");
		By reenterpassword=By.xpath("//input[@id='ap_password_check']");
		By continuebtn=By.xpath("//input[@id='continue']");
		
		//WebElement wename=driver.findElement(name);
		
		driver.findElement(name).sendKeys("harithat");
		driver.findElement(email).sendKeys("haritha@gmail.com");
		driver.findElement(password).sendKeys("haritha@2024");
		driver.findElement(reenterpassword).sendKeys("haritha@2024");
		driver.findElement(continuebtn).click();
		
		
		
	}

}
