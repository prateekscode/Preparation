package com.dsa;

class St{
	int ids;
	String nam;
	
	public St(int i, String n) {
		this.ids=i;
		this.nam=n;
	}

	@Override
	public String toString() {
		return "[ids=" + ids + ", nam=" + nam + "]";
	}
	
}
public class ArrayObj {
	public static void main(String[] args) {
		St s=new St(1,"A");
		St s1=new St(2,"B");
		St s2=new St(2,"C");
		St s3=new St(2,"D");
		St s4=new St(2,"B");
		
		St[] ar= {s,s1,s2,s3,s4};
		for(St d: ar) {
			System.out.println(d);
		}
	}
}
