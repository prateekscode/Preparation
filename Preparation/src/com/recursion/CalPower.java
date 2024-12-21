package com.recursion;

public class CalPower {
	public static void main(String[] args) {
		int p=power(5, 3);
		System.out.println(p);
	}
	
	public static int power(int x,int n) {
		if(n==0)
			return 1;
		int xnm=power(x, n-1);
		int xn=x*xnm;
		return xn;
	}
}
