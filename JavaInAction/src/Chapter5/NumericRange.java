package Chapter5;

import java.util.stream.IntStream;

public class NumericRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          IntStream numberRange=IntStream.range(1, 10);
          IntStream numberRangeClosed=IntStream.rangeClosed(11, 20);
          numberRange.forEach(System.out::println);
          numberRangeClosed.forEach(System.out::println);
	}

}
