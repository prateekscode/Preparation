package com.java8_1.streamspack;

import java.util.ArrayList;
import java.util.List;

public class Cd5 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(44);
		al.add(32);
		al.add(51);

		al.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
		al.stream().map(x->x*2).forEach(n->System.out.println("-------"+n));
	}
}
