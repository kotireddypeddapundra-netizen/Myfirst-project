/**
 * 
 */
package com.javaintro;
import java.util.Scanner;
/**
 * 
 */
public class PositiveNegativeEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		if(num>0 && num%2==0) {
			System.out.println(num+ " is a positive even number");
		}
		else if(num>0 && num%2!=0) {
			System.out.println(num+ " is a positive odd number");
		}
		else if(num<0 && num%2==0) {
			System.out.println(num+ " is a negative even number");
		}
		else if(num<0 && num%2!=0) {
			System.out.println(num+ " is a negative odd number");
		}
		else {
			System.out.println(num+ " is zero");
		}
	}

}
