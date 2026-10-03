package com.arrays;

public class StockMarket {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 9, 6, 5, 7, 9 };

		

		for (int i = 0; i < arr.length; i++) {
			
			int highest = 0;
			int lowest = 0;

			for (int j = i + 1; j < arr.length; j++) {
				
				int diff = arr[i] - arr[j];
				if (diff > highest) {
					highest = diff;
				}
				if (diff < lowest) {
					lowest = diff;
				}

			}

		}

	}

}
