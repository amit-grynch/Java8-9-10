package com.biFunctionExample;

import java.util.function.BiFunction;

public class StudentObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, Integer, Student> biFunction = (name, roll) -> new Student(name, roll);
		System.out.println(biFunction.apply("amit", 10));
	}

}

class Student {
	String sname;
	int roll;

	public Student(String sname, int roll) {
		super();
		this.sname = sname;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", roll=" + roll + "]";
	}

}
