package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinValuePremitiveStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> intList=Arrays.asList(2,4,1,9,7,19);
		 OptionalInt maxValue=intList.stream().mapToInt(value->value).min();
		 OptionalInt minValue=intList.stream().mapToInt(value->value).max();
		 System.out.println("Max Value of Array"+maxValue.getAsInt());
		 System.out.println("Min Value of Array"+minValue.getAsInt());

	}

}
