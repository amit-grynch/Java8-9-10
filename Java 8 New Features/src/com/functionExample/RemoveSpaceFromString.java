package com.functionExample;

import java.util.function.Function;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Function<String,String> stringFunction=string->string.trim();
       System.out.println(stringFunction.apply(" amit   "));
	}

}
