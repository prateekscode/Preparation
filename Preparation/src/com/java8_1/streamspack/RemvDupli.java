package com.java8_1.streamspack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemvDupli {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Java","C","Python","Java","COBOL","PHP","C","Go");
		List<String> dl=l.stream().distinct().collect(Collectors.toList());
		System.out.println(dl);
	}
}
