package com.recursion;

public class PrintIncreasing {
	public static void main(String[] args) {
		printDecr(5);
	}
	
	public static void printDecr(int n) {
		if(n==0)
			return;
		printDecr(n-1);
		System.out.println(n);
	}
}