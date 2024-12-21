package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArryToCollection {
	public static void main(String[] args) {
		String[] stu= {"Adarsh","Abhinav","Samarth","Sajal","Rohit"};
		System.out.println("Arrays input: "+Arrays.toString(stu));
		
		List stuList=Arrays.asList(stu);
		System.out.println("Converted: "+stuList);
	}
}
