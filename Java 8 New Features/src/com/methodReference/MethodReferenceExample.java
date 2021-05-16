package com.methodReference;

public class MethodReferenceExample {
	public static String method2() {
		System.out.println(" Inside MethodReferenceExample method2");
		return " Amit";
	}

	public static void main(String[] args) {
		Base base = MethodReferenceExample::method2;
		base.method1();
	}
}

interface Base {
	public void method1();
}
