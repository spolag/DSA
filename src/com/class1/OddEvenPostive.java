package com.class1;
import java.util.Scanner;
public class OddEvenPostive {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       
       if(a>=0) {
    	   if(a%2==0) 
    		   System.out.println("Even Positive");
    	   else
    		   System.out.println("Odd Positive");
       }else {
    	   if(a%2==0) 
    		   System.out.println("Even Negative");
    	   else
    		   System.out.println("Odd Negative");
       }
    }
}
