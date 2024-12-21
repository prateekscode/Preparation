package com.faq;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		//1. using algo 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:- ");
		int n = sc.nextInt();
		int rev=0;
		
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
}
