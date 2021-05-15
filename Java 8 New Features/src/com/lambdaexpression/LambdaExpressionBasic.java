package com.lambdaexpression;

public class LambdaExpressionBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

@FunctionalInterface
interface A{
	public void m();
	
}

@FunctionalInterface
interface B extends A{
	public void m();
}
