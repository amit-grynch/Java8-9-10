package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SquareOfListOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInteger=Arrays.asList(1,2,3,4,5);
		Stream<Integer> streamInteger=listInteger.stream().map(integer->integer*integer);
		 streamInteger.forEach(System.out::println);

	}

}
