package com.java8_1.streamspack;

public class FreqOfChar {
	public static void main(String[] args) {
		String inputString="Java Concept of the day";
		inputString.chars().mapToObj(c->(char)c).collect(null);
	}
}
