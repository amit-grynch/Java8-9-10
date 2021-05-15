package com.supplierExample;

import java.util.function.Supplier;

public class RandomNameSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Supplier<String>supplier=()->{
		String[] str= {"Amit","Kumar","Sharma","Grynch"};
			int x = (int) ((Math.random())*4);
	   return str[x];	
	};
  System.out.println(supplier.get());
  System.out.println(supplier.get());
  System.out.println(supplier.get());
  System.out.println(supplier.get());
	}

}
