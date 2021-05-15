package com.predicateExample;

import java.util.function.Predicate;

public class CheckNameStartWithK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] strArray= {"amit","komal","kajal","ashu","kundan"};
     Predicate<String> predicate1=str->str.charAt(0)=='k';
     System.out.println("  Input String Statisfying The Predicate Conditions : ");
     checkString(predicate1, strArray);
	}
   public static void checkString(Predicate<String> predicate,String[] inputrray) {
	   for(String str:inputrray) {
		   if(predicate.test(str)) {
			   System.out.println(str);
		   }
	   }
	    
   }
}
