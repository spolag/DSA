package com.class1;

import java.util.Scanner;

public class MinOf2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		if(a<=b) {
			System.out.println(a+"is smaller ");
		}else 
			System.out.println(b+"is smaller ");
	}
}
