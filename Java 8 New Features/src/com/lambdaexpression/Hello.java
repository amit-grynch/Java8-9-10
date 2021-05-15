package com.lambdaexpression;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHelloWithoutLamda();
		HelloFuncationalInterface hello = () -> {
			System.out.println(" Print Hello Using Lambda Expression");};
		hello.printUsingLamda();
	}

	public static void printHelloWithoutLamda() {
		System.out.println(" print Hello Without Lamda Expression ");
	}
}

@FunctionalInterface
interface HelloFuncationalInterface {
	public void printUsingLamda();
}
