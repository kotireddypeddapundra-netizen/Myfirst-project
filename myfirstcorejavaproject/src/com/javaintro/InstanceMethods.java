package com.javaintro;

public class InstanceMethods {
	
	static int objectcount=0;
	InstanceMethods(){
		objectcount++;
	}
	
	void method1() {
		System.out.println("this is method1");
	}
	void method2() {
		System.out.println("this is method2");
	}
	void method3() {
		System.out.println("this is method3");
	}
	void method4() {
		System.out.println("this is method4");
	}
	static {
		InstanceMethods obj1 = new InstanceMethods();
		InstanceMethods obj2 = new InstanceMethods();
		InstanceMethods obj3 = new InstanceMethods();
		InstanceMethods obj4 = new InstanceMethods();
		
	}
	
	public static void main(String[] args) {
		InstanceMethods obj5 = new InstanceMethods();
		InstanceMethods obj6 = new InstanceMethods();
		System.out.println("total objects = " + objectcount);
	}

}
