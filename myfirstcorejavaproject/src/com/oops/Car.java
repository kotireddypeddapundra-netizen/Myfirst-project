package com.oops;

public class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("Car Starts");
	}
	@Override
	void stop() {
		System.out.println("Car Stops");
	}
	void sunRoof() {
		System.out.println("Car Can Open Sun Roof");
	}
	void properties(){
		System.out.println("Car Name : "+name);
		System.out.println("Car Speed : "+speed);
	}
	Car(String name, int speed){
		super.name=name;
		super.speed=speed;
	}
	
}
