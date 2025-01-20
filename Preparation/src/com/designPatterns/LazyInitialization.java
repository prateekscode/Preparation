package com.designPatterns;

public class LazyInitialization {
	public static void main(String[] args) {
		LazIni l1 = LazIni.getInstance();
		LazIni l2 = LazIni.getInstance();
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
	}
}

class LazIni {
	private static LazIni instance;

	private LazIni() {
	}

	public static LazIni getInstance() {
		if (instance == null) {
			instance = new LazIni();
		}
		return instance;
	}
}