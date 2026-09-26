package com.logicalstatements.forloop;

public class NestedLoop1 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("**********************");
		method2();
		System.out.println("**********************");
		method3();
		System.out.println("**********************");
		method4();

	}

	static void method1() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}

	}
	static void method2() {
		int count = 0;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				count++;
				System.out.print(count + "  ");
			}
			System.out.println();
		}

	}
	static void method3() {
		int count = 5;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(count + "  ");
				count--;
			}
			System.out.println();
		}

	}
	static void method4() {
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if(i==j || i+j==4) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}

	}

}
