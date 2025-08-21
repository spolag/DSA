package com.arrays;

public class OccuranceInArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,5,5};
		
		System.out.println(occurance(arr, 5));
	}
	
	public static int occurance(int[] arr,int n) {
		int count=0;
		
		for(int i:arr) {
			if(i==n)
				count++;
		}
		
		return count;
	}
}
