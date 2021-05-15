package com.functionExample;

import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<String,Integer> stringFunction=str->str.length();
        System.out.println(stringFunction.apply("AMIT" ));
	}

}
