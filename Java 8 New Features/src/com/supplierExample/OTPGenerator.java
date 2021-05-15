package com.supplierExample;

import java.util.function.Supplier;

public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = () -> {
			String str = "";
			for (int i = 0; i < 6; i++) {
				str = str + (int) (Math.random() * 10);
			}
			return str;
		};
		System.out.println(supplier.get());
	}

}
