package Chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CreateStreamFromFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generating number Using Iterate
       Stream<Integer> intStream=Stream.iterate(0,number->number+2).limit(10);
       System.out.println("Printing Using iterate and Limit ");
       intStream.forEach(System.out::println);
       
       Stream<Integer> integerStream=Stream.iterate(0, n->n<10,n->n+2);
       System.out.println("Printing Using Enhanced iterate ");
       integerStream.forEach(System.out::println);
       
       Stream<Integer> intStreamValue=Stream.iterate(0, n->n+2).takeWhile(n->n<20);
       System.out.println("Printing Using iterate and takeWhile");
       intStreamValue.forEach(System.out::println);
       
   	  //Generating number Using generate
       Stream<Double> randomNumber=Stream.generate(Math::random).limit(3);
       System.out.println("Printing Using Generate and Limit ");
       randomNumber.forEach(System.out::println);
       System.out.println("Printing Using Generate and IntStream ");
       IntStream.generate(()->1).limit(3).forEach(System.out::println);;
       
	}

}
