package com.class1;

import java.util.Scanner;

public class HigestOf3 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a+" is higest");
		} else if (b >= a && b >= c) {
			System.out.println(b+" is higest");
		} else {
			System.out.println(c+" is higest");
		}
	}
}