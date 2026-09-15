package com.assignment;

import java.util.Scanner;
import java.util.Random;

public class MiniGameProject {

	public static void main(String[] args) {

		Random r = new Random();
		int randomNumber = r.nextInt(11);

		Scanner sc = new Scanner(System.in);
		int chancesLeft = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter a Number That Matches The Random Number : ");
			int num = sc.nextInt();		
			chancesLeft=3-i;
			
			if(num==randomNumber) {
				System.out.println("You Won");
				break;
			}else if(num!=randomNumber && chancesLeft>=1) {
				System.out.println("Incorrect Guess...The Number Of Chances Left : "+chancesLeft);
			}else {
				System.out.println("You Lost");
			}
			
		}

	}

}
