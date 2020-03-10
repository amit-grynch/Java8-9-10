package Chapter5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class UnqiueCharactorUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = Arrays.asList("Hello", "World");
		Stream<String> stringStream=stringList.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct();
		  stringStream.forEach(System.out::print);

	}

}
