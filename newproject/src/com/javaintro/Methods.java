package com.javaintro;

public class Methods {
	static void method1 (){
		method2();
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("sum = "+sum);
	}
	static void method2 (){
		Methods m = new Methods();
		m.method3();
		int a = 40;
		int b = 20;
		int difference = a-b;
		System.out.println("difference = " +difference);
		
	}
	void method3 (){
		method4();
		int a = 40;
		int b = 20;
		int quotient = a/b;
		System.out.println("quotient = "+quotient);
		
	}
	void method4(){
		method5();
		int a = 40;
		int b = 20;
		int product = a*b;
		System.out.println("product = "+product);
		
	}
	void method5(){
		int a = 45;
		int b = 20;
		int remainder = a%b;
		System.out.println("remainder = "+remainder);
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended");
		
	}

}
