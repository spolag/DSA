package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]= { 1,2,2};
		System.out.println(secondLargest(a));
	}
	
	public static int secondLargest(int[] arr) {
		
		int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first= arr[i];
			}else if(arr[i]>second && arr[i]<first)
				second = arr[i];
		}
		return second;
	}
}
