package com.qa.automationconcepts.pages;

public class InheritanceConcept {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.diesel();//individual methods of Vehicle class
		v.petrol();//Individual methods of Vehicle Class
		
		Car c=new Car();
		c.petrol();//Ovverridden method in Car class-method of Vehicle class
		c.diesel();//inheritance-Method from Vehicle class
		c.start();//individual methods of Car class
		c.stop();//individual methods of Car class
		c.refuel();//individual methods of Car class
		
		BMW b=new BMW();
		b.autoparking();//individual method of BMW class
		b.diesel();//inherited from Grand Parent Class
		b.petrol();//Method present in Parent and grand parent-Inherited from Parent class
		b.start();//Ovverridden method in BMW class-method of Car class
		b.stop();//Ovverridden method in BMW class-method of Car class
		b.refuel();//Ovverridden method in BMW class-method of Car class
		
		
		
		//Top casting or Up Casting:Parent Class reference is referring the Child class Object.
		//Individual methods of Child class cannot be accessed.
		//Can access Overridden methods in Child class
		//Can access Parent class individual methods
		//Can access Grand Parent class individual methods
		Car c1=new BMW();
		c1.diesel();//Can access Grand Parent class individual methods
		c1.petrol();//Can access-Overridden method in BMW class-Method originally from Grand Parent class Vehicle
		c1.start();//Can access-Overridden method in BMW class-Method originally from Parent class Car
		c1.stop();//Can access-Overridden method in BMW class-Method originally from Parent class Car
		c1.refuel();//Can access-Overridden method in BMW class-Method originally from Parent class Car
		//c1.autoparking()Individual methods of Child class cannot be accessed in Top Casting Casting
		
		
		
		
		//DownCasting:Child class reference is referring the Parent CLass Object.
		//Trick java by type casting the Parent Class as Child class at compile time
		//Run time Class cast exception
		//BMW b1=(BMW)new Car();

	}

}
