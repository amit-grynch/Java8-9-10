package com.supplierExample;

import java.util.Date;
import java.util.function.Supplier;

public class SysytemDateSupply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());
	}

}
