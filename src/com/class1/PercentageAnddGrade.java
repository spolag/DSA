package com.class1;

import java.util.Scanner;

public class PercentageAnddGrade {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 int d = sc.nextInt();
	 int e = sc.nextInt();
	 
	 int percentage = (a+b+c+d+e)/5;
	 
	 if(percentage>90) 
		 System.out.println("A");
	 else if(percentage>80)
		 System.out.println("B");
	 else if(percentage>70)
		 System.out.println("C");
	 else if(percentage>60)
		 System.out.println("D");
	 else if(percentage>40)
		 System.out.println("E");
	 else 
		 System.out.println("F");
	 
	 sc.close();
 }
}
