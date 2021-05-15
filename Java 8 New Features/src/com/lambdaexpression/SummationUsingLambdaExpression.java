package com.lambdaexpression;

public class SummationUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summation summation = (a, b) ->{ System.out.println(a + b);};
		summation.sum(5, 10);
		LengthCaculation lengthCaculation = str ->  str.length();
		System.out.println("Length Of String " + lengthCaculation.getLength("Amit"));

	}

}

@FunctionalInterface
interface Summation {
	void sum(int a, int b);
}


interface LengthCaculation {
	int getLength(String str);
}