package com.arrays;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int k=7;
		
		k = k%arr.length;
		
		RevereArray.reverse(arr, 0, arr.length-1);
		RevereArray.reverse(arr, 0, k-1);
		RevereArray.reverse(arr, k, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	

}
