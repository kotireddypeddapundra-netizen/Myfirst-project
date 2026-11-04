package com.arrays;

public class ArrayIntervals2D {

	public static void main(String[] args) {

		int[][] arr = {
				{1,6},{2,5},{0,2},{4,5}
		};
		
		for(int i=0;i<arr.length;i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			boolean flag = false;
			
			for(int j=0;j<arr.length;j++) {
				
				int nextStart = arr[j][0];
				int nextEnd = arr[j][1];
				
				if(nextStart>start && nextEnd<=end) {
					flag = true;
					break;
				}
				
			}
			if(flag) {
				System.out.print(1+" ");
			}else {
				System.out.print(0+" ");
			}
			
		}
		
	}

}
