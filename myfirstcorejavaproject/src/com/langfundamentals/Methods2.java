package com.langfundamentals;

public class Methods2 {
	
	static String method1(String name) {
		return name;
	}
	static int method2(int num1,int num2) {
		return num1+num2;
	}
	int method3(int n1,int n2) {
		int division = n1/n2;
		return division;
	}
	int method4(int value) {
		return value;
	}

	public static void main(String[] args) {

		Methods2 m = new Methods2();
		
		String a1 = method1("ROHIT SHARMA");
		System.out.println("None Other Than "+a1);
		
		int a2 = method2(20, 25);
		System.out.println("Walking On To The Crease With The Jersey Number "+a2);
		
		int a3 = m.method3(528, 2);
		System.out.println("Owns The Record Of Highest Individual Score In ODIs "+a3);
		
		int a4 =  m.method4(3);
		System.out.println("And Having Highest Number Of Double Centuries In ODIs "+a4);
		
	}

}
