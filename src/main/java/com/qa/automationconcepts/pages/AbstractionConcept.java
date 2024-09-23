package com.qa.automationconcepts.pages;

public class AbstractionConcept {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.pageLogo();// final method of Parent class called Page class
		lp.pageTitle();// Ovveridden method from the Parent abstract class called Page class
		lp.pageURL();// Ovveridden method from the Parent abstract class called Page class
		lp.dologin();// individual method of Login Page class
		LoginPage.pagefooter();// Static method in Login Page class-Method Hiding
		Page.pagefooter();// Static method in Page class and Page class-Method Hiding
		lp.normalmethod();
	}

}
