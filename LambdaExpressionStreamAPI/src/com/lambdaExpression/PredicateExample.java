package com.lambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Implementing Predicate Before Java 8");
		Predicate<Integer> predicate = new Predicate<Integer>() {
			public boolean test(Integer num) {
				return num < 20;
			}
		};
		System.out.println(predicate.test(30));
	}

}
