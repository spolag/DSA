package com.arrays;

import java.util.Arrays;

public class RevereArray {
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		
		reverse(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	
	public static int[] reverse(int[] arr,int i,int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
		return arr;
	}
}

