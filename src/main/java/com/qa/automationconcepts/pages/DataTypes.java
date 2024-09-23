package com.qa.automationconcepts.pages;

public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("Data type typecasting");
		//Widening:Converting smaller data type to larger datatype
		//Widening can be done both implicitly and explicitly
		//Remember like this:we are trying to put an integer value into a double datatype variable 
		double a=100;
		double b=(double)100;
		
		System.out.println("The value of a is:"+a); //Output 100.0
		System.out.println("The value of b is:"+b);//Output 100.0
		
		System.out.println("*************************************");
		
		//narrowing: converting larger datatype to smaller datatype
		//Remember like this: We are trying to put larger value into a smaller datatype
		//like storing double value into int
		//narrowing can be done explicitly by typecasting 
		int x=(int)10.00;
		System.out.println("The value of x is:"+x);//Output 10
		
		//int y=10.00//this line is error because narrowing cannot be done implicitly(no typecasting)
		
	}

}
