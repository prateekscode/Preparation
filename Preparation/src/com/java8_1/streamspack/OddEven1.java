package com.java8_1.streamspack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven1 {
	public static void main(String[] args) {
		List<Integer> listOfIntegers=Arrays.asList(71,18,42,21,67,32,95,14,86);
		Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		Set<Entry<Boolean, List<Integer>>> entryset= collect.entrySet();
		
		for(Entry<Boolean, List<Integer>> entry: entryset) {
			System.out.println("-----------");
			if(entry.getKey()) {
				System.out.println("Even nos.");
			} else {
				System.out.println("Odd nos.");
			}
			
			System.out.println("------------");
			List<Integer> list=entry.getValue();
			for(int i:list) {
				System.out.println(i);
			}
		}
		
	}
}
