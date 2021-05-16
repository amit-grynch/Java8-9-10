package com.primitiveFunctionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 6, 7, 10, 3, 12, 13, 2 };
		IntPredicate intPredicate = num -> num % 2 == 0;
		for (int num : intArray) {
			if (intPredicate.test(num)) {
				System.out.println(num);
			}
		}
	}

}
