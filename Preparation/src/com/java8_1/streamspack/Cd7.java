package com.java8_1.streamspack;

import java.util.Arrays;
import java.util.List;

public class Cd7 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Abhay");
		Employee e2 = new Employee(2, "Basant");
		Employee e3 = new Employee(3, "Carry");
		Employee e4 = new Employee(4, "Denom");
		Employee e5 = new Employee(5, "Eric");
		Employee e6 = new Employee(6, "Franklin");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6);

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

		intList.stream().filter(x -> x % 2 == 0).map(x -> x + x).filter(x -> x > 5).peek(System.out::println).count();
		
		empList.stream().filter(e->e.getId()%2==0).map(e->{
			e.printName();
			return e.getName();
		}).forEach(x->System.out.println(x));
		
		/*we can chain multiple intermediate ops and none of them do anything
		 until we invoke terminal ops because intermediate ops are lazy loading */
		empList.stream().filter(e->e.getId()%2==0).map(e->{
			e.printName();
			return e.getName();
		});
		
		//this reduce is use to do some ops on the whole stream elements and produce a single result from that stream.
		System.out.println(intList.stream().reduce((a,b)->a+b).get());
		
		System.out.println(intList.stream().reduce((a,b)->a+b).get());	
	}
}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("print name ()--"+name);
	}

}