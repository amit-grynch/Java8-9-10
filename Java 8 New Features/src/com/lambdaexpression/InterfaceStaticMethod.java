package com.lambdaexpression;

public class InterfaceStaticMethod implements StaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceStaticMethod.m(); can not call
		StaticInterface.m(); 
    
	}

}

interface StaticInterface{
	static void m() {
		System.out.println(" StaticInterface Static Method ");
	}
}
