package com.whileloop;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2=sc.nextInt();
		
		int lcm=least(num1, num2);
		System.out.println("The LCM Of "+num1+" , "+num2+" = "+lcm);
		
	}
	static int least(int num1,int num2) {
		int lcm=1;
		int i=1;
		
		while(i<=num1*num2) {
			if(i%num1==0 && i%num2==0) {
				lcm=i;
				break;
			}
			i++;
		}
		
		return lcm;
	}

}
