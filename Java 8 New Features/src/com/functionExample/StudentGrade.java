package com.functionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student("A",79);
		Student std2=new Student("B",67);
		Student std3=new Student("C",61);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		Function<Integer,String> studentFunction=marks->marks>75?"1stDivision":((marks>60&&marks<75)?"2ndDivision":"3rdDivision");
		for(Student std : studentList) {
			System.out.println(std.getName()+" "+std.getMarks()+" "+studentFunction.apply(std.getMarks()));
		}

	}

}

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}
