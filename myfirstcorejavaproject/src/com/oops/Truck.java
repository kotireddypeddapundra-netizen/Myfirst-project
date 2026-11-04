package com.oops;

public class Truck extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Truck Starts");
	}
	@Override
	void stop() {
		System.out.println("Truck Stops");
	}
	void loadCargo() {
		System.out.println("Truck Can Load Cargo");
	}
	void properties(){
		System.out.println("Truck Name : "+name);
		System.out.println("Truck Speed : "+speed);
	}
	Truck(String name, int speed){
		super.name=name;
		super.speed=speed;
	}

}
