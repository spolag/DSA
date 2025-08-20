package com.patterns;

import java.util.Scanner;

public class CountFactors {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("factors  "+countFactors(n));	
	}
	
	public static int countFactors(int n) {
		int count = 0;
		
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				count++;
			} else if(n%i==0) {
				count+=2;
			}
		}
		return count;
	}
}
