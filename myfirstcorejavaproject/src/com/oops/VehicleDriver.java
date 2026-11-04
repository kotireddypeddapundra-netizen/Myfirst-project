package com.oops;

public class VehicleDriver {

	public static void main(String[] args) {

		Bike b = new Bike("Pulsar",80);
		Car c = new Car("Tesla",150);
		Truck t = new Truck("Ashok Leyland",135);
		
		System.out.println("BIKE PROPERTIES");
		b.start();
		b.stop();
		b.doWheeling();
		System.out.println("=================================================");
		System.out.println("CAR PROPERTIES");
		c.start();
		c.stop();
		c.sunRoof();
		c.properties();
		System.out.println("=================================================");
		System.out.println("TRUCK PROPERTIES");
		t.start();
		t.stop();
		t.loadCargo();
		t.properties();
		System.out.println("=================================================");
		
	}

}
