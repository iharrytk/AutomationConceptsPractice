package com.qa.automationconcepts.pages;
public class ThisCalling {

	ThisCalling() {

		this(10);
		System.out.println("My third Constructor");
	}

	ThisCalling(int a) {

		this(110, 2.0);
		System.out.println("My second Constructor");
	}

	ThisCalling(int a, double b) {

		System.out.println("My first Constructor");
	}

	public static void main(String[] args) {
		// this() calling statement is used in the context of Constructor Overloading
		// Constructor calling another Constructor
		// All Constructors in a class gets invoked with single object creation of class
		// saving memory
		// this() -we pass parameters of another constructor
		// Used in the first line of a constructor
		// No more than one this() in a single Constructor
		/*
		ThisCalling tc = new ThisCalling();
		*/
	}
}
