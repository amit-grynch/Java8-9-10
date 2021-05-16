package com.biFunctionExample;

import java.util.function.BiFunction;

public class TwoNumberProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 * num2;
		System.out.println(biFunction.apply(10, 5));
	}

}
