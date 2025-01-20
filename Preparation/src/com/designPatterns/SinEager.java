package com.designPatterns;

class SingletonEager{
private static final SingletonEager eager=new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return eager;
	}
}

public class SinEager {

	public static void main(String[] args) {
		SingletonEager s1= SingletonEager.getInstance();
		SingletonEager s2= SingletonEager.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
