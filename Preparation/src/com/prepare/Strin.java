package com.prepare;

public class Strin {
	public static void main(String[] args) {
		String s="Games";
		String s1="Games";
		String s2=new String("Games");
		String s3=new String("Chess");
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.compareTo(s3));
		System.out.println(s1.substring(2));
		
		String s4=new String("Hi how are you");
		String s5=new String("Hi how are you");
		String s6="Hi how are you";
		String s7="Hi how are you";
		String s8="Hi how"+" are you";
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s6==s7);
		System.out.println(s7==s8);
		
		char[] a= {'P','A','N','D','A'};
		String ss=new String(a);
		System.out.println(ss);
		
		String sa=new String("Pool");
		String sb="Pool";
		System.out.println(sa==sb);
		sa=sa.intern();
		System.out.println(sa==sb);
	}
}
