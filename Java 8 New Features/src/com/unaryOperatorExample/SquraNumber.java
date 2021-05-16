package com.unaryOperatorExample;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class SquraNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> unaryOperator = num -> num * num;
		IntUnaryOperator intUnaryOperator = num -> num * num;
		System.out.println(intUnaryOperator.applyAsInt(20));
		System.out.println(unaryOperator.apply(10));
	}

}
