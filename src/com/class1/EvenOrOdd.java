package com.class1;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%2==0)
			System.out.println(0);
		else
			System.out.println(1);
	}
}
