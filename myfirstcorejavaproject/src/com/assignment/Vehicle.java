package com.assignment;

public class Vehicle {

	String type;

	Vehicle(String type) {
		this.type = type;
		System.out.println("One Arg Constructor Called From Vehicle");
	}
}

class Car extends Vehicle {

	String model;
	double price;

	Car(String type, String model, double price) {
		super(type);
		this.model = model;
		this.price = price;
		System.out.println("Three Arg Constructor Called From Car");
	}
}

class ElectricCar extends Car {

	double batteryCapacity;

	ElectricCar(String type, String model, double price, double batteryCapacity) {
		super(type, model, price);
		this.batteryCapacity = batteryCapacity;
		System.out.println("Four Arg Constructor Called From ElectricCar");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Called");

		ElectricCar e1 = new ElectricCar("Electric", "XYZ", 5000000, 4000);
		e1.method();
	}

	void method() {
		System.out.println("Type Of Car : " + type);
		System.out.println("Model Of Car : " + model);
		System.out.println("Price Of Car : " + price);
		System.out.println("Battery Capacity Of Car : " + batteryCapacity);

	}
}




