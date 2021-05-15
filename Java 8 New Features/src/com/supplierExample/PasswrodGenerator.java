package com.supplierExample;

import java.util.function.Supplier;

public class PasswrodGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
		Supplier<Integer> digitSupplier = () -> (int) (Math.random() * 10);
		Supplier<Character> charSupplier = () -> {
			return symbols.charAt((int) (Math.random() * 29));
		};
		String password = "";
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				password += digitSupplier.get();
			} else {
				password += charSupplier.get();
			}
		}
		System.out.println("Generated Password :" + password);
	}

}
