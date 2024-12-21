package com.array.gfg;

import java.util.Scanner;

public class Largest3Elements {
	static void print3Largest(int ar[], int ar_size) {
		int first, second, third;
		
		if(ar_size<3) {
			System.out.println("Must input 3 elements");
			return;
		}
		third=first=second=Integer.MIN_VALUE;
		
		for(int i=0;i<ar_size;i++) {
			if(ar[i]>first) {
				third=second;
				second=first;
				first=ar[i];
			}
			
			else if(ar[i]>second) {
				third=second;
				second=ar[i];
			}
			
			else if(ar[i]>third)
				third=ar[i];
		}
		System.out.println("The largest elements are: "+first+" "+second+" "+third);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int s=sc.nextInt();
		int[] ar=new int[s];

		System.out.println("Enter elements in array:");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
			
		print3Largest(ar, s);
		sc.close();
	}
}
