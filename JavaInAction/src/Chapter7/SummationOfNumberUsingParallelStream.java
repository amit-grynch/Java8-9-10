package Chapter7;

import java.util.stream.Stream;

/**
 * @author amitg Adding the Summation of all number from given number N to 1
 *         using Parallel Stream
 */
public class SummationOfNumberUsingParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDigit = 10;
		int summation = Stream.iterate(1, a -> a + 1).limit(lastDigit).parallel().reduce(0, (a, b) -> a + b);
		System.out.println(" Summation Of Number From " + lastDigit + " to 1 is = " + summation);
		System.out.println("Number of Processors : "+ Runtime.getRuntime().availableProcessors());
	}

}
