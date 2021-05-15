package com.functionExample;

import java.util.function.Function;

public class FunctionChaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Function<String,String> fun1=str->str.toUpperCase();
       Function<String,String> fun2=str->str.substring(0,4);
       System.out.println(fun1.apply("amitsharma"));
       System.out.println(fun2.apply("amitsharma"));
       System.out.println(fun1.andThen(fun2).apply("amitsharma"));
       System.out.println(fun1.compose(fun2).apply("amitsharma"));
	}

}
