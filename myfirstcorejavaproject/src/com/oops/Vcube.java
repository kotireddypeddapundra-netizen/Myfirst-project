package com.oops;

class Device {

	public Device(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public Device() {

	}

	private String brand;
	private double price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}

}

class Laptop extends Device {

	public Laptop() {
		super();
	}

	public Laptop(String brand, double price, int ram, String processor) {
		super(brand, price);
		this.processor = processor;
		this.ram = ram;
	}

	int ram;
	String processor;

	void cunIDE() {
		System.out.println("Con IDE Called From Laptop");
	}

	void compileCode() {
		System.out.println("Compile Code From Laptop");
	}

}

class Mobile extends Device {

	public Mobile() {
		super();
	}

	public Mobile(String brand, double price, String camera, String battery) {
		super(brand, price);
		this.battery = battery;
		this.camera = camera;
	}

	String camera;
	String battery;

	void makeCall() {
		System.out.println("Make Call From Mobile");
	}

	void takePhoto() {
		System.out.println("Take Photo From Mobile");
	}

}

public class Vcube {

	public static void main(String[] args) {

		Device d = new Device();
		Laptop l = new Laptop("DELL", 45000,8,"Rysen5");
		Mobile m = new Mobile("REALME", 17500,"7000 MAH","50MP");
		d.displayDetails();
		System.out.println("************************************");
		l.displayDetails();
		l.cunIDE();
		l.compileCode();
		System.out.println("************************************");
		m.displayDetails();
		m.makeCall();
		m.takePhoto();
		
	}

}
