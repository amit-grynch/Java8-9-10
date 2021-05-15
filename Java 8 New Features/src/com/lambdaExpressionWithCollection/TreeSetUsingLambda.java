package com.lambdaExpressionWithCollection;

import java.util.TreeSet;

public class TreeSetUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> setWithLamda=new TreeSet<Integer>((int1,int2)->(int1>int2)?-1:(int1<int2)?1:0);
		TreeSet<Integer> setWithOutLamda=new TreeSet<Integer>();
		System.out.println(" Sort Without Lambda ");
		setWithOutLamda.add(25);
		setWithOutLamda.add(0);
		setWithOutLamda.add(15);
		setWithOutLamda.add(5);
		setWithOutLamda.add(10);
		System.out.println(setWithOutLamda);
		System.out.println(" Sort With Lambda ");
		setWithLamda.add(25);
		setWithLamda.add(0);
		setWithLamda.add(15);
		setWithLamda.add(5);
		setWithLamda.add(10);
		System.out.println(setWithLamda);

	}

}
