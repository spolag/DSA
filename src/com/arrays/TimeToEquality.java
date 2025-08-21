package com.arrays;

public class TimeToEquality {

	public static void main(String[] args) {
		int[] arr = {2,4,1,3,0};
		
		System.out.println(timeToEquality(arr));
		
 	}
	
	public static int timeToEquality(int[] arr) {
		
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		int time=0;
		
		for(int i=0;i<arr.length;i++) {
			time+=(max-arr[i]);
		}
		
		return time;
	}
}
