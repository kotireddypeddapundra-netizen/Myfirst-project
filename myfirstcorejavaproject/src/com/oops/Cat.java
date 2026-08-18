package com.oops;

public class Cat implements Animal{
	
	@Override
	public void sound() {
		System.out.println("Cat Sounds Meow Meow !!!");
	}

	@Override
	public void eat() {
		System.out.println("Cat Eats Home Food !!!");
	}

	@Override
	public void sleep() {
		System.out.println("Cat Sleeps at Any Time !!!");
	}

}
