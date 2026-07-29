package com.javaintro;

public class ObjectsCount {
	static int n=0;
	ObjectsCount(){
		n++;
	}
	static void method() {
		
		ObjectsCount obj4 = new ObjectsCount();
		
	}
	
	public static void main(String[] args) {
		ObjectsCount obj1 = new ObjectsCount();
		ObjectsCount obj2 = new ObjectsCount();
		ObjectsCount obj3 = new ObjectsCount();
		method();
		System.out.println(n);
		
	}

}
