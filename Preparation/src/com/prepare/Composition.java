package com.prepare;

import java.util.ArrayList;
import java.util.List;

class Department1 {
	public String deptname;

	public Department1(String deptname) {
		this.deptname = deptname;
	}

	public String getdeptname() {
		return deptname;
	}
}

class Company {
	String compname;
	List<Department1> depts;

	public Company(String compname) {
		this.compname = compname;
		this.depts = new ArrayList<Department1>();
	}

	public void adddept(Department1 department) {
		depts.add(department);
	}

	public List<Department1> getDepartments() {
		return new ArrayList(depts);
	}

	public int getTotalDepts() {
		return depts.size();
	}
}

public class Composition {
	public static void main(String[] args) {
		Company tc = new Company("Tech Corp");
		tc.adddept(new Department1("Engineering"));
		tc.adddept(new Department1("Operations"));
		tc.adddept(new Department1("Resources"));
		tc.adddept(new Department1("Finanace"));

		int d = tc.getTotalDepts();
		System.out.println("Total depts: " + d);

		System.out.println("Departs names");
		for (Department1 dt : tc.getDepartments()) {
			System.out.println("- " + dt.getdeptname());
		}

	}
}
