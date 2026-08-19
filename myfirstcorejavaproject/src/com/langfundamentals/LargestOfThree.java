package com.langfundamentals;
import java.util.Scanner;
public class LargestOfThree {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		LargestOfThree l = new LargestOfThree();

		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();

		System.out.println("Enter Third Number : ");
		int num3 = sc.nextInt();
		
		int largest = l.largest(num1, num2, num3);
		System.out.print("The Largest Number is : "+largest);

	}

	int largest(int n1,int n2,int n3) {
		if(n1>n2 && n1>n3) {
			return n1;
		}else if(n2>n1 && n2>n3) {
			return n2;		
		}
		else {
			return n3;
		}
	}

}
