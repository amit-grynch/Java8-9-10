package Chapter7;

import java.util.stream.Stream;

public class SummationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDigit = 10;
		int sum = Stream.iterate(1, a -> a + 1).limit(lastDigit).reduce(0, (a, b) -> a + b);
		int addition = Stream.iterate(1, a -> a + 1).limit(lastDigit).reduce(0, Integer::sum);
		System.out
				.println("Calculating the Sum of Digit From 1 to lastDigit so, sum=" + sum + " Addition = " + addition);

	}

}
