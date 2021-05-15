package com.lambdaexpression;

public class MultipleInheritanceDefualtMethod implements Left,Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new MultipleInheritanceDefualtMethod().m();
	}
	
	public void m() {
		Right.super.m();
	}

}

interface Left{
	default void m() {
		System.out.println(" Default Method In Left Interface ");
	}
}

interface Right{
	default void m() {
		System.out.println(" Default Method In Right Interface ");
	}
}
