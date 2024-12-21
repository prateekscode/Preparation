package com.prepare;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String sname;
	private int sid;

	public Student(String sname, int sid) {
		this.sname = sname;
		this.sid = sid;
	}

	public int getStudId() {
		return this.sid;
	}

	public String getStudName() {
		return this.sname;
	}
}

class Department {
	private String dname;
	private List<Student> students;

	public Department(String dname, List<Student> students) {
		this.dname = dname;
		this.students = students;
	}

	public void addStud(Student student) {
		students.add(student);
	}

	public List<Student> getStud() {
		return students;
	}
}

class Institute {
	private String instname;
	private List<Department> departments;

	public Institute(String inst, List<Department> depart) {
		this.instname = inst;
		this.departments = depart;
	}

	public void addDepart(Department department) {
		departments.add(department);
	}

	public int getTotalStudents() {
		int noOfStud = 0;
		List<Student> students = null;

		for (Department dept : departments) {
			students = dept.getStud();

			for (Student s : students) {
				noOfStud++;
			}
		}
		return noOfStud;
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Student s1 = new Student("Tanay", 1);
		Student s2 = new Student("Rahul", 2);
		Student s3 = new Student("Sam", 3);
		Student s4 = new Student("Rex", 4);
		Student s5 = new Student("Tanay", 5);

		List<Student> cs = new ArrayList<Student>();
		cs.add(s1);
		cs.add(s5);

		List<Student> ee = new ArrayList<Student>();
		ee.add(s2);
		ee.add(s3);

		List<Student> me = new ArrayList<Student>();
		me.add(s4);

		Department CSE = new Department("CSE", cs);
		Department EE = new Department("EE", ee);
		Department ME = new Department("ME", me);

		List<Department> departments = new ArrayList<Department>();
		departments.add(ME);
		departments.add(EE);
		departments.add(CSE);

		Institute institute = new Institute("BITS", departments);

		System.out.println("Total students in institute: ");
		System.out.println(institute.getTotalStudents());

	}
}