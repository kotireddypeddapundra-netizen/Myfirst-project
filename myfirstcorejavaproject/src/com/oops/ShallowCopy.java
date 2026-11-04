package com.oops;

class Student implements Cloneable{

	int sId;
	String sName;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Student(int sId, String sName, Address address) {
		this.sId = sId;
		this.sName = sName;
		this.address = address;
	}

}

class Address {

	String city;

	Address(String city) {
		this.city = city;
	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address("Hyderabad");
		Student s1 = new Student(45,"ROHIT",add);
		
		System.out.println("Student Id : "+s1.sId);
		System.out.println("Student Name : "+s1.sName);
		System.out.println("Address : "+s1.address.city);
		System.out.println("******************************");
		
		Student s2 = (Student) s1.clone();
		
		System.out.println("Student Id : "+s2.sId);
		System.out.println("Student Name : "+s2.sName);
		System.out.println("Address : "+s2.address.city);
		System.out.println("******************************");
		
		s2.sId=18;
		s2.sName="KOHLI";
		s2.address.city="Banglore";
		
		System.out.println("Student Id : "+s2.sId);
		System.out.println("Student Name : "+s2.sName);
		System.out.println("Address : "+s2.address.city);//Banglore
		System.out.println("******************************");
		
		System.out.println("Student Id : "+s1.sId);
		System.out.println("Student Name : "+s1.sName);
		System.out.println("Address : "+s1.address.city);//Banglore
		System.out.println("******************************");
		
	}

}
