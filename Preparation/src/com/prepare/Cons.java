package com.prepare;

class Check{
	int sid;
	String name;
	
	Check(){
		System.out.println("Default cons");
	}
	
	Check(int a, String n){
		this.sid=a;
		this.name=n;
	}
	
	void show() {
		System.out.println(sid+" "+name);
	}
}
public class Cons {

	public static void main(String[] args) {
	Check ch=new Check();
	Check ch1=new Check(32,"Keir Starmer(UK)");
	ch1.show();
	}

}
