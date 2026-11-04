//package com.arrays;
//
//public class Array2DRotation {
//
//	public static void main(String[] args) {
//
//		int[][] arr = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[j][i]+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}
//
package com.arrays;

public class Array2DRotation {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through columns from 0 to 2
        for (int i = 0; i < arr.length; i++) {
            // Loop through rows from bottom (2) up to top (0)
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}

//20 10 00
//21 11 01
//22 12 02











