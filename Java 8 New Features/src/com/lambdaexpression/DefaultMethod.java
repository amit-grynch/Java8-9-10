package com.lambdaexpression;

public class DefaultMethod implements DefaultMethodI {
 public static void main(String[] args) {
	  new DefaultMethod().m();
}
public  void m() {
		System.out.println(" Default Method  in Implemented Class");
	}
}


interface DefaultMethodI{
	default void m() {
		System.out.println(" Default Method ");
	}
}
