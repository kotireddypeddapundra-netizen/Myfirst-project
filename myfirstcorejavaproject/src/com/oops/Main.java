package com.oops;

public class Main {

	public static void main(String[] args) {

		Animal myDog = new Dog();
		System.out.println("My Dog Behaviour ");
		myDog.sound();
		myDog.eat();
		myDog.sleep();
		
		System.out.println("**********************************************");
		
		Animal myCat = new Cat();
		System.out.println("My Cat Behaviour ");
		myCat.sound();
		myCat.eat();
		myCat.sleep();
	}

}
