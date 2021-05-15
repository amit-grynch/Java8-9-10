package com.lambdaexpression;

public class NumberSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareNumber square= num-> { return num*num;}; 
        System.out.println(square.doSquare(9));
	}

}

@FunctionalInterface
interface SquareNumber{
	int doSquare(int num);
}
