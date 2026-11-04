package com.oops;

public class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike Starts");
	}
	@Override
	void stop() {
		System.out.println("Bike Stops");
	}
	void doWheeling() {
		System.out.println(name+" Can Do Wheeling");
		System.out.println("at "+speed+" KMPH");
	}
	Bike(String name, int speed){
		super.name=name;
		super.speed=speed;
	}
	
	

}
