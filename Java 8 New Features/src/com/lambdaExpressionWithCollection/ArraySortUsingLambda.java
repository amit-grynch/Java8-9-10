package com.lambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(35);
		list.add(20);
		Collections.sort(list,(int1,int2)->(int1>int2)?-1:(int1<int2)?1:0);
		System.out.println(list);
		

	}

}
