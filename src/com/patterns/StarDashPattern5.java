package com.patterns;

import java.util.Scanner;

public class StarDashPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int row=1; row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				if(col%2==0) {
					System.out.print("- ");
				}else {
					System.out.print(col+" ");
				}
			}
			System.out.println();
			
		}
	}
}
