package com.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(naturalsum(5));
	}

//	public static int fact(int n) {
//		int res = 1;
//		for (int i = 1; i <= n; i++) {
//			res = res * i;
//		}
//		return res;
//	}

	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	public static int naturalsum(int n) {
		if(n==1) {
			return 1;
		}
		return n + naturalsum(n - 1);
	}
}