package com.qa.automationconcepts.pages;

public class Car extends Vehicle{
	//individual method of Car class
	public void start() {
		System.out.println("Car-Start");
	}
	
	//individual method of Car class
	public void stop() {
		System.out.println("Car-Stop");
	}
	
	//individual method of Car class
	public void refuel() {
		System.out.println("Car-Refuel");
	}
	
	//Overridden method from Vehicle class
	@Override
	public void petrol() {
		System.out.println("Vehicle-Petrol method-Overridden in Car Class");
	}
	
	//This method is not overridden from the Vehicle class.It is the individual method of Car class
	//Static methods of parent class  cannot be overridden
	//But method name can be the same in both parent class and child class without @override annotation.
	public static void dieselpetrol() {
		System.out.println("Car-DieselPetrol");
	}
	
	//The below method block is incorrect.electric() method in Parent class Vehicle is declared as final
	//final methods of Parent class cannot be overridden
//	public final void electric() {
//		System.out.println("Vehicle-Electric");
//	}
	
	
	//This method seen below is not overridden from the Vehicle class.It is the individual method of Car class
	//private methods of Parent class cannot be overridden
	//If we put @Override annotation for the below method it would throw error.
	//private void watervehicle() {
	//	System.out.println("Car-Water");
	//}
	
	
	


}
