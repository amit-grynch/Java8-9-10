package com.methodReference;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseInterface base=Sample::new;
		base.get();
	}

}

class Sample{
	
	public Sample() {
		System.out.println(" Sample Class Object Creation ");
	}
}

interface BaseInterface{
	public void get();
}