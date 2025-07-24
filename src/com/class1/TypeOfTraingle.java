package com.class1;

import java.util.Scanner;

public class TypeOfTraingle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println("Equivalent Traingle");
		}else if(a!=b && b!=c) {
			System.out.println("different  Traingle");
		}else 
			System.out.println("isosceles  Traingle");
	}

}
