package com.qa.automationconcepts.pages;

public class LoginPage extends Page {
	
	public LoginPage() {
		
		System.out.println("Child Class-Login Page constructor");
	}
	
	public LoginPage(int a) {
		super(10);
		System.out.println("Child Class-Login Page constructor with argument");
	}

	@Override
	public void pageTitle() {
		System.out.println("Login page-title");
		
	}

	@Override
	public void pageURL() {
		System.out.println("Login page URL");
		
	}
	
	//individual Login Page method
	public void dologin() {
		System.out.println("User enters credentials and get logged");
	}
	
	
	//Concept of Method Hiding-This method belongs to Login Page class-Not overridden
	public static void pagefooter() {
		System.out.println("Login Page class-page footer-Concept of Method Hiding");
		
	}
	
	

}
