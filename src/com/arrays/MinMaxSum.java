package com.arrays;

public class MinMaxSum {

	public static void main(String[] args) {
		
		int[] arr = {-2,1,-4,5,3};
		System.out.println(minMax(arr));
 	}
	
	public static int minMax(int[] arr) {
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			
			if(arr[i]>max)
				max=arr[i];
			
			if(arr[i]<min)
				min = arr[i];
			
		}
		return max+min;
	}
}
