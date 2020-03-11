package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReductionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reduce Operation for Summation
		List<Integer> numbers = Arrays.asList(3, 4, 1, 7, 6, 9);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(" Using Lambda Function " + sum);

		int summation = numbers.stream().reduce(0, Integer::sum);
		System.out.println(" Using Integer'Sum Operation" + summation);
		
		//Reduce Operation for Finding max and Min from List using InBuilt method
		Optional<Integer> maxValue=numbers.stream().reduce(Integer::max);
		Optional<Integer> minValue=numbers.stream().reduce(Integer::min);
		System.out.println("Max Value="+maxValue.get() +" "+"MinValue="+minValue.get());
		
		//Reduce Operation for Finding max and Min from List using Lambda Expression
				Optional<Integer> maxValue1=numbers.stream().reduce((x,y)->x>y?x:y);
				Optional<Integer> minValue1=numbers.stream().reduce((x,y)->x<y?x:y);
				System.out.println("Max Value1="+maxValue1.get() +" "+"MinValue1="+minValue1.get());
				
		//Counting the Element in Stream
		int count=numbers.stream().map(d->1).reduce(0, (a,b)->a+b);
		System.out.println(count);
		System.out.println(numbers.stream().count());

	}

}
