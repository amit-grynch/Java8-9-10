package com.lambdaExpression;

import java.util.Comparator;

 class LambdaExpressionExampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Comparator<String> comparator=(str1, str2)->  Integer.compare(str1.length(), str2.length());
     
      
      System.out.println(comparator.compare("amit","kumar"));
	}


}
