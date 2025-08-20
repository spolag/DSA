package com.patterns;

import java.util.Scanner;

public class InsertedNumericPyrmid {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n+1-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
