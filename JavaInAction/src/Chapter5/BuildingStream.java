package Chapter5;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Stream using integer values
		Stream<Integer> integerStream = Stream.of(3, 5, 1, 28, 23);
		integerStream.forEach(System.out::println);
		// Creating Stream using String values
		Stream<String> stringStream=Stream.of("Modern","Java","In","Actino");
		stringStream.forEach(System.out::println);
		System.out.println(Stream.empty());
		
		//Creating Stream Using Arrays
		int[] intArray= {2,4,1,5,3};
		IntStream intStream=Arrays.stream(intArray);
		System.out.println(intStream.sum());
	}

}
