package com.patterns;

import java.util.Scanner;

public class StarDashPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1;row<=n;row++) {
			
			for(int col = 1;col<=n+1-row;col++) {
				System.out.print("* ");
			}
			
			for(int col = 1;col<=2*row-2;col++) {
				System.out.print("  ");
			}
			
			for(int col = 1;col<=n+1-row;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
