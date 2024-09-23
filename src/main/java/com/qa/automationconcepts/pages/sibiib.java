package com.qa.automationconcepts.pages;

public class sibiib {
	
	static int a;
	static 
	{
		a=30;
		System.out.println("Static Initialization of the Block");
		System.out.println("The value of a is:"+a);
	}
	{
		System.out.println("Instance Initialization of the Block");
	}

	public static void main(String[] args) {
		
		//Instance of class needed for the block 12-14 to get executed
		//sibiib ib=new sibiib();
		

	}

}
