package com.bipredicateExample;

import java.util.function.BiPredicate;

public class SummEvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> biPredicate=(num1,num2)->(num1+num2)%2==0;
		System.out.println(biPredicate.test(10, 20));
		System.out.println(biPredicate.test(15, 10));

	}

}
