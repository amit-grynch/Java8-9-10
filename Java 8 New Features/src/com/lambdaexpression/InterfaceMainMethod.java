package com.lambdaexpression;

interface InterfaceMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Main Method");

	}

}


interface AA{
	static void m() {
		System.out.println(" A class m method ");
	}
}

class BB implements  AA{
	private void m() {
		
	}
}