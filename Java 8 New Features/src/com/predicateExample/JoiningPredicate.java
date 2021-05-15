package com.predicateExample;

import java.util.function.Predicate;

public class JoiningPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray= {3,5,7,6,10,11,14,16,18};
		Predicate<Integer> predicate1=number->number>10;
		Predicate<Integer> predicate2=number->number%2==0;
		System.out.println(" Print Number who are greater than 10 and even both ");
		testPredicateCondition(predicate1.and(predicate2),inputArray);
		System.out.println(" Print Number who are greater than 10 ");
		testPredicateCondition(predicate1,inputArray);
		System.out.println(" Print Number who are not  greater than 10 ");
		testPredicateCondition(predicate1.negate(),inputArray);
		System.out.println(" Print Number who are   greater than 10 or even  ");
		testPredicateCondition(predicate1.or(predicate2),inputArray);
	}
  public static void testPredicateCondition(Predicate<Integer> predicate, int[] inputArray) {
	  for(int element:inputArray) {
		if( predicate.test(element)) {
			System.out.println(element);
		}
	  }
  }
}
