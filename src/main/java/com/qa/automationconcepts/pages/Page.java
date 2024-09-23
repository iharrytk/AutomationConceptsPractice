package com.qa.automationconcepts.pages;

public abstract class Page {
	
	public Page() {
		System.out.println("Parent abstract class-Page class constcrutor");
	}
	
	public Page(int a) {
		System.out.println("Parent abstract class-Page class constcrutor with argument");
	}
	
	public abstract void pageTitle();
	
	public abstract void pageURL();
	
	//final methods cannot be overriden.It remains constant through out the application
	public final void pageLogo() {
		System.out.println("Page class-The page logo is declared final and is not an abstract method");
	}
	
	//Concept of Method Hiding-This method belongs to  Page class
	public static void pagefooter() {
		System.out.println("Page class-page footer");
		
	}
	
	public  void normalmethod() {
		System.out.println("Page class-normal non static method");
		
	}
	
	

}
