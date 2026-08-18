package com.oops;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Sounds Bow Bow !!!");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats Non-Veg !!!");
	}

	@Override
	public void sleep() {
		System.out.println("Dog Sleeps at Morning and Provide Security in Night Time !!!");
	}

}
