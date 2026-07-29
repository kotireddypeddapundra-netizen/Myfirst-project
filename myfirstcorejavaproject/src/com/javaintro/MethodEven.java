package com.javaintro;
import java.util.Scanner;
public class MethodEven {
	
	static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if(isEven(num)) {
			System.out.println(num+ " is an even number");
		}
		else {
			System.out.println(num+ " is an odd number");
		}
	}

}








//package com.javaintro;
//import java.util.Scanner;
//public class MethodEven {
//	
//	static void isEven(int num) {
//		if(num%2==0) {
//			System.out.println(num+ " is even number");
//		}
//		else {
//			System.out.println(num+ " is odd number");
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a Number");
//		int num=sc.nextInt();
//		isEven(num);
//	}
//
//}
