package com.qa.automationconcepts.pages;

public class BMW extends Car{
	
		//individual method of BMW class
		public void autoparking() {
			System.out.println("BMW-Autoparking");
		}
		
		
		//Overridden method of from Car class
		public void start() {
			System.out.println("Car-BMW--Diesel");
		}
		
		//Ovverriden method of from Car class
		public void stop() {
			System.out.println("Car-BMW-Diesel");
		}
		
		//Ovverridden method of from Car class
		public void refuel() {
			System.out.println("Car-BMW-Diesel");
		}
		
		//Overridden method from Vehicle,Car class
		@Override
		public void petrol() {
			System.out.println("method-Overridden in BMW Class");
		}
		
		
	
	

}
