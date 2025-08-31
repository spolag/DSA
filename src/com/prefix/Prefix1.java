package com.prefix;

public class Prefix1 {
	public static void main(String[] args) {
		int[][] Queries = {{4,7},{1,4},{6,8},{1,3}};
		
		int[] a = {1,2,3,4,5,6,7,7,1,3};
		
		prefixSum(Queries, a, Queries.length, a.length);
		
	}
	
	public static void prefixSum(int[][] Queries, int[] a, int queryLength, int size ) {
		
		for(int i=0;i<queryLength;i++) {
			int l = Queries[i][0];
			int r = Queries[i][1];
			
			int sum=0;
			
			for(int j=l;j<=r;j++) {
				
				sum+=a[j];
			}
			System.out.println(sum);
			
			
			
			
		}
	}
}
