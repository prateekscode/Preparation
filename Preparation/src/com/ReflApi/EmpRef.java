package com.ReflApi;

public class EmpRef {
	private int id;
	private double sal;
	private String name;

	enum Week {
		SUN, TUE, WED;
	}

	@interface MyAnno {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmpRef(int id, double sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	public EmpRef() {
	}

	class A {
	}

	class B {
	}

}
