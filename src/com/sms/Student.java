package com.sms;

public class Student {

	int id;
	String name;
	double marks;

	// add constructor
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	// create display method
	public void display() {
		System.out.println("ID: " + id);
		System.out.println("name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("---------------------------");
	}
}
