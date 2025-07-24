package com.class1;

import java.util.Scanner;

public class FizzBizz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		StringBuilder result = new StringBuilder();
		if(a%3==0) {
			result.append("FIZZ");
		}
		if(a%5==0)
			result.append("BIZZ");
		
		System.out.println("result is "+result);
	}
}
