package com.javaintro;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum + digit;
            num=num/10;
        }
        System.out.println("sum of digits=" +sum);
        sc.close();
	}

}
