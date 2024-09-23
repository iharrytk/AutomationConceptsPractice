package com.qa.automationconcepts.pages;

public class MethodOverridingConcept {

	public static void main(String[] args) {
		//When we have Parent class and a Child Class with the same method name,return type,arguments
		//But the Child class method will have a different implementation 
		//@override annotation is used .But not mandatory
		//Let us see about static methods,Final methods,Private methods cannot be overridden.
		
		
		
		//This method is not overridden from the Vehicle class.It is the individual method of Car class
		//Static methods  cannot be overridden
		//Method Hiding:But method name can be the same in both parent class and child class without @override annotation.
		Car c1=new Car();
		Car.dieselpetrol();
		
		//The final methods of Parent class cannot be overridden.We are declaring them as final because we 
		//do not want to change the implementation of it.
		c1.electric();
		
//		The Private Parent Class method cannot be overridden in the Child Class.
//		However the private method can have the implementation in the child class without 
//		the annotation @Override.  

		//Object obj=new Object();
	}

}
