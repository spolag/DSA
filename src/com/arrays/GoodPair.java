package com.arrays;

public class GoodPair {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int ans = goodPair(arr, 4);
		
		System.out.println(ans);
	}
	
	//TC : O(N)
	//SC : O(1)
	public static int goodPair(int[] arr, int k) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			
			if(arr[i]+arr[j]==k) {
				System.out.println(i+ " : "+j);
				return 1;
			}else if(arr[i]+arr[j]<k) {
				i++;
			}else 
				j--;
		}
		return 0;
	}
}
