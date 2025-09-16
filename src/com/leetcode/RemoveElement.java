package com.leetcode;

public class RemoveElement {
	public static void main(String[] args) {
		
	}
	
	public static int removeElement(String[] arr, String val) {
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[k]=arr[i];
				k++;
			}
		}
		return  k;
		
		
		
	}
}
