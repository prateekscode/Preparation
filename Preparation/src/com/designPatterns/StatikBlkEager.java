package com.designPatterns;

public class StatikBlkEager {
	public static void main(String[] args) {
		SBlkEager s1 = SBlkEager.getInstance();
		SBlkEager s2 = SBlkEager.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class SBlkEager {
	private static SBlkEager instance;

	private SBlkEager() {
	}

	static {
		try {
			instance = new SBlkEager();
		} catch (Exception e) {
			throw new RuntimeException("Exception while creating instance");
		}
	}

	public static SBlkEager getInstance() {
		return instance;
	}
}