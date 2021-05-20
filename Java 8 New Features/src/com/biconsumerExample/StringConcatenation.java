package com.biconsumerExample;

import java.util.function.BiConsumer;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> biConsumer=(str1,str2)->System.out.println(str1+str2);
		 biConsumer.accept("amit", "sharma");

	}

}
