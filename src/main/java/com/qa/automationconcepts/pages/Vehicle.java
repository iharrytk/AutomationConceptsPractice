package com.qa.automationconcepts.pages;

public class Vehicle {
	
	//individual method of Vehicle class
	public void diesel() {
		System.out.println("Vehicle-Diesel");
	}
	//individual method of Vehicle class
	public void petrol() {
		System.out.println("Vehicle-Petrol");
	}
	
	//Static method of parent class cannot be overridden in the child class
	public static void dieselpetrol() {
		System.out.println("Vehicle-DieselPetrol");
	}
	
	//Final method of Parent class cannot be overridden in the child class
	public final void electric() {
		System.out.println("Vehicle-Electric");
	}
	
	
	
	
//	private void watervehicle() {
//		System.out.println("Vehicle-Water");
//	}
	
	
	

}
