package com.qa.automationconcepts.pages;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("Checking if try is throwing exception when wrong catch is given");
			//int a=10/0;
			
		}
		
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception has been handled");
			
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception has been handled");
		}
		
		//finally block is executed even when the exception is not handled
		finally {
			System.out.println("finally block has been executed");
		}
	
		System.out.println("Catch block has been executed");

	}

}
