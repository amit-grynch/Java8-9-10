package com.primitiveFunctionalInterface;

import java.util.function.IntConsumer;

public class IntConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     IntConsumer intConsumer=num->System.out.println(num*num);
     intConsumer.accept(10);
	}

}
