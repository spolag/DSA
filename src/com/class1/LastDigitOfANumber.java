package com.class1;

import java.util.Scanner;

public class LastDigitOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println("Last digit is "+a%10);
	}
}
