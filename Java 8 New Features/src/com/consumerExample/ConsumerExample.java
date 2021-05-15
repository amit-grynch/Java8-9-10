package com.consumerExample;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=str->System.out.println(str);
		consumer.accept("amit");

	}

}
