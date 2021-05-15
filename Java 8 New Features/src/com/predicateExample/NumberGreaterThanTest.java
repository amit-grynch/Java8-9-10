package com.predicateExample;

import java.util.function.Predicate;

public class NumberGreaterThanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Predicate<Integer> predicate1=I->I>10;
    Predicate<String> predicate2=str->str.length()>10;
    System.out.println(predicate1.test(100));
    System.out.println(predicate1.test(9));
    System.out.println(predicate2.test("amit"));
    System.out.println(predicate2.test("amitgrynchkumar"));
	}

}
