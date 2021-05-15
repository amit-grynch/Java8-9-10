package com.lambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(100,"a"));
		list.add(new Employee(50,"k"));
		list.add(new Employee(20,"c"));
		list.add(new Employee(70,"l"));
		list.add(new Employee(60,"d"));
		System.out.println(" print Without Lambda and Sorting ");
		System.out.println(list);
		System.out.println(" print With Lambda and Sorting ");
		Collections.sort(list,(emp1,emp2)->(emp1.getEmpId()>emp2.getEmpId())?1:(emp1.getEmpId()<emp2.getEmpId())?-1:0);
		System.out.println(list);
	}

}

class Employee{
	int empId;
	String ename;
	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return  empId +":"+ ename ;
	}
	
	
}
