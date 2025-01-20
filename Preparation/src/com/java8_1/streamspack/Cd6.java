package com.java8_1.streamspack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cd6 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(44);
		al.add(32);
		al.add(51);

		List<Integer> collect = al.stream().filter(n -> n > 30).collect(Collectors.toList());
		collect.forEach(x -> System.out.println(x));

		// stream for each and sorted
		Stream<Integer> collect1 = al.stream().filter(n -> n > 30).sorted();
		collect1.forEach(x -> System.out.println("^^^^^^" + x));

		long n = al.stream().count();
		System.out.println("----" + n);

		Stream<Integer> sorted = al.stream().sorted();
		sorted.forEach(x -> System.out.println("Sorted order " + x));

		Stream<Integer> sorted1 = al.stream().sorted((i1, i2) -> i2.compareTo(i1));
		sorted1.forEach(x -> System.out.println("Desc Sorted order " + x));

		Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum value: " + min);

		Integer max = al.stream().max((a1, a2) -> a1.compareTo(a2)).get();
		System.out.println("Maximum value: " + max);

		Object[] ay = al.stream().toArray();
		for (Object o : ay)
			System.out.println("Array elements: " + o);

		// Stream.of can convert anything or group of element into stream not only
		// collection.
		Stream.of(1, 11, 111, 1111, 2, 22, 222).forEach(x -> System.out.println("Stream of elements " + x));

	}
}
