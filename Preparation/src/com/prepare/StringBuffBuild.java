package com.prepare;

public class StringBuffBuild {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.hashCode());
	
	StringBuilder sb1=new StringBuilder("Games");
	StringBuilder sb2=new StringBuilder("Games");

	System.out.println(sb1.capacity());
	System.out.println(sb1.reverse());
	System.out.println(sb1.hashCode());
	System.out.println(sb1.equals(sb2));
	String str1=sb1.toString();
	String str2=sb2.toString();
	boolean b1=str1.contentEquals(sb2);
	boolean b2=str1.contentEquals(str2);
	boolean b3=str1.equals(str2);	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
}
}
