package com.functionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmplloyeeTotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Employee> employeList=new ArrayList<Employee>();
     populateEmploye(employeList);
		Function<List<Employee>, Double> empFunction = employeList1 -> {
			double salary = 0.0;
			for (Employee emp1 : employeList) {
				salary += emp1.salary;
			}
			return salary;
		};
     System.out.println(empFunction.apply(employeList));
	}
  public static void populateEmploye(List<Employee>employeList ) {
	  Employee emp1=new Employee("A",32000);
	  Employee emp2=new Employee("B",40000);
	  employeList.add(emp1);
	  employeList.add(emp2);
	  
  }
}

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
