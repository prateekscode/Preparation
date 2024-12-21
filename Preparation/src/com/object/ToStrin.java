package com.object;

class Str{
	int a;
	int b;
	String s;
	
	Str(){	}
	
	Str(int a,int b,String n){
		this.a=a;
		this.b=b;
		this.s=n;
	}
	
	@Override
	public String toString() {
		return "--> "+a+" "+b+" "+s;
	}
}
public class ToStrin {
	public static void main(String[] args) {
		Str str=new Str();
		System.out.println(str);
		
		Str str1=new Str(10,100,"James");
		System.out.println(str1);
	}
}
 