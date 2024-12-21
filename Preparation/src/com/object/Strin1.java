package com.object;

public class Strin1 {
	public static void main(String[] args) {
		String s="Hello"+"Kanpur";
		System.out.println(s);
		String n=s.concat("UP78");
		System.out.println(s);
		System.out.println(n);
		
		String s1=new String("hello");
		String s2=s1.toLowerCase();
		String s3=s1.toUpperCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String sa=new String("JVM IS Java Virtual Machine");
		String sb=new String("JVM IS Java Virtual Machine");
		String sn="JVM IS Java Virtual Machine";
		System.out.println(sa==sb);
		System.out.println(sb==sn);
		String ss="Good things take more time";
		String si="Good things"+" take more time";
		System.out.println(ss==si);
		
		String s4="Good things";
		String s5=s4+" take more time";
		System.out.println(s4==s5);
		
		final String s6="Good things";
		String s7=s6+" take more time";
		System.out.println(s6==s7);
	}
}
