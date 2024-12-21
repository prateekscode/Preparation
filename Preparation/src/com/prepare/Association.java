package com.prepare;

import java.util.*;

class Bank {
	private String bankname;
	private Set<Employee> Employees;

	public Bank(String name) {
		this.bankname = name;
	}

	public String getBankname() {
		return bankname;
	}

	public Set<Employee> getEmployees() {
		return Employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.Employees = employees;
	}

}

class Employee {
	private String empname;

	public Employee(String ename) {
		this.empname = ename;
	}

	public String getEmployeeName() {
		return this.empname;
	}

}

public class Association {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh");
		Employee e2 = new Employee("Suresh");

		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);

		Bank bank = new Bank("BOB");
		bank.setEmployees(employees);

		for (Employee e : bank.getEmployees()) {
			System.out.println(e.getEmployeeName() + " from bank " + bank.getBankname());
		}
	}

}
