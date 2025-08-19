package com.patterns;

import java.util.Scanner;

public class StarDashPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1;row<=n;row++) {
			System.out.print("* ");
			for(int col = 1;col<=n-row;col++) {
				System.out.print("- ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
